/**
 *  Copyright (C) 2002-2015   The FreeCol Team
 *
 *  This file is part of FreeCol.
 *
 *  FreeCol is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  FreeCol is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with FreeCol.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.sf.freecol.client.gui.panel;

import java.awt.Color;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.RenderingHints;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

// TODO: Auto-generated Javadoc
/**
 * This class generates the most common types of flags from a small
 * number of parameters, biased towards flags similar to that of the
 * United States, i.e. flags with a "union", an area filled with stars
 * representing the colonies of the player. Obvious improvements
 * include adding shapes other than stars (e.g. the fleur-de-lys for
 * Quebec) and larger design elements, such as the Southern Cross, or
 * coats of arms.
 *
 * Please feel free to correct any vexillological errors.
 */
public class Flag {

    /**
     * The alignment of stripes or other design elements on the
     * flag. Might be extended to handle diagonal alignment
     * (Friesland, for example).
     */
    public enum Alignment {
        
        /** The none. */
        NONE,
        
        /** The horizontal. */
        HORIZONTAL,
        
        /** The vertical. */
        VERTICAL
    }

    /**
     * The "background layer" of the flag, generally one or several
     * squares or triangles of different color. The alignment of the
     * background influences the size of the canton, if there is one.
     */
    public enum Background {
            /** A plain background. */
        PLAIN(Alignment.NONE),
            /** Quartered rectangularly. */
        QUARTERLY(Alignment.NONE),
            /** Vertical stripes. */
        PALES(Alignment.VERTICAL),
            /** Horizontal stripes. */
        FESSES(Alignment.HORIZONTAL),
            /** Diagonal top left to bottom right. */
        PER_BEND(Alignment.NONE),
            /** Diagonal bottom left to top right. */
        PER_BEND_SINISTER(Alignment.NONE),
            /** Quartered diagonally. */
        PER_SALTIRE(Alignment.NONE);

        /** The alignment. */
        public final Alignment alignment;

        /**
         * Instantiates a new background.
         *
         * @param alignment the alignment
         */
        Background(Alignment alignment) {
            this.alignment = alignment;
        }
    }

    /**
     * The "middle layer" of the flag, generally a number of vertical,
     * horizontal or diagonal bars. The decoration limits the shape
     * and possible positions of the "union".
     */
    public enum Decoration {
        
        /** The none. */
        NONE(),
        
        /** The cross. */
        CROSS(UnionPosition.CANTON),
        
        /** The greek cross. */
        GREEK_CROSS(UnionPosition.CANTON),
        
        /** The scandinavian cross. */
        SCANDINAVIAN_CROSS(UnionPosition.CANTON),
        
        /** The chevron. */
        CHEVRON(UnionShape.CHEVRON, UnionPosition.LEFT),
        
        /** The pall. */
        PALL(UnionShape.CHEVRON, UnionPosition.LEFT),
        
        /** The bend. */
        BEND(UnionShape.BEND, UnionPosition.TOP, UnionPosition.BOTTOM),
        
        /** The bend sinister. */
        BEND_SINISTER(UnionShape.BEND, UnionPosition.TOP, UnionPosition.BOTTOM),
        
        /** The saltire. */
        SALTIRE(UnionShape.CHEVRON, UnionPosition.TOP, UnionPosition.BOTTOM,
                UnionPosition.LEFT, UnionPosition.RIGHT),
        
        /** The saltire and cross. */
        SALTIRE_AND_CROSS(UnionPosition.CANTON);

        /** The union shape. */
        public UnionShape unionShape = UnionShape.RECTANGLE;
        
        /** The union positions. */
        public Set<UnionPosition> unionPositions = EnumSet.allOf(UnionPosition.class);

        /**
         * Instantiates a new decoration.
         *
         * @param positions the positions
         */
        Decoration(UnionPosition... positions) {
            this.unionPositions = EnumSet.of(UnionPosition.NONE);
            for (UnionPosition position : positions) {
                unionPositions.add(position);
            }
        }

        /**
         * Instantiates a new decoration.
         *
         * @param shape the shape
         * @param positions the positions
         */
        Decoration(UnionShape shape, UnionPosition... positions) {
            this(positions);
            this.unionShape = shape;
        }

    }

    /**
     * The shape of the "union", which generally depends on the
     * decoration or background of the flag.
     */
    public enum UnionShape {
        
        /** The rectangle. */
        RECTANGLE,
        
        /** The triangle. */
        TRIANGLE,
        
        /** The chevron. */
        CHEVRON,
        
        /** The bend. */
        BEND,
        
        /** The rhombus. */
        RHOMBUS
    }

    /**
     * The position of the "union", which depends on the alignment of
     * the background. The "canton" is the top left quarter of the
     * flag. Other quarters might be added.
     */
    public enum UnionPosition {
        
        /** The left. */
        LEFT(Alignment.VERTICAL, 0),
        
        /** The center. */
        CENTER(Alignment.VERTICAL, 1),
        
        /** The right. */
        RIGHT(Alignment.VERTICAL, 2),
        
        /** The top. */
        TOP(Alignment.HORIZONTAL, 0),
        
        /** The middle. */
        MIDDLE(Alignment.HORIZONTAL, 1),
        
        /** The bottom. */
        BOTTOM(Alignment.HORIZONTAL, 2),
        
        /** The canton. */
        CANTON(Alignment.NONE, 0),
        
        /** The none. */
        NONE(null, 0);

        /** The alignment. */
        public final Alignment alignment;
        
        /** The index. */
        public final int index;

        /**
         * Instantiates a new union position.
         *
         * @param alignment the alignment
         * @param index the index
         */
        UnionPosition(Alignment alignment, int index) {
            this.alignment = alignment;
            this.index = index;
        }

    }

    /**
     * Width and height are used in the usual sense, not the
     * vexillological sense.
     */
    public static final int WIDTH = 150;
    
    /** The Constant HEIGHT. */
    public static final int HEIGHT = 100;
    
    /** The Constant SQRT_3. */
    public static final double SQRT_3 = Math.sqrt(3);
    /**
     * MAGIC NUMBER: the width of decoration elements.
     */
    public static final double DECORATION_SIZE = (double) HEIGHT / 7;
    
    /** The Constant CHEVRON_X. */
    public static final double CHEVRON_X = SQRT_3 * HEIGHT / 2;
    /**
     * MAGIC NUMBER: the size of the stars in the union.
     */
    public static final double STAR_SIZE = 0.07 * HEIGHT;
    /**
     * MAGIC NUMBER: the horizontal offset of the vertical bar of the
     * Scandinavian cross.
     */
    public static final double CROSS_OFFSET = 2 * DECORATION_SIZE;
    
    /** The Constant BEND_X. */
    public static final double BEND_X = DECORATION_SIZE;
    
    /** The Constant BEND_Y. */
    public static final double BEND_Y = DECORATION_SIZE / SQRT_3;

    /** The Constant star. */
    private static final GeneralPath star = getStar();

    /**
     * The distribution of stars in the "union", based on historical
     * flags of the United States. This really should be extended to
     * handle rectangles of different shapes.
     */
    private static final int[][] layout = new int[51][2];

    static {
        for (int[] bars : new int[][] {
                { 5, 4 }, { 5, 6 }, { 6, 5 }, { 5, 5 }
            }) {
            int sum = bars[0] + bars[1];
            boolean even = true;
            while (sum < 51) {
                layout[sum] = bars;
                if (even) {
                    sum += bars[0];
                    even = false;
                } else {
                    sum += bars[1];
                    even = true;
                }
            }
        }

    }

    /**
     * If the background is striped, the background colors will be
     * used in turn, from top to bottom, or from left to right. If the
     * background is quartered, the colors will be used clockwise,
     * starting at the top left. If there are more colors than stripes
     * or quarters, the superfluous colors will be ignored.
     */
    private List<Color> backgroundColors = new ArrayList<>();

    /** The union color. */
    private Color unionColor = Color.BLUE;
    
    /** The star color. */
    private Color starColor = Color.WHITE;
    
    /** The decoration color. */
    private Color decorationColor = Color.WHITE;

    /** The background. */
    private Background background = Background.FESSES;
    
    /** The decoration. */
    private Decoration decoration = Decoration.NONE;
    
    /** The union shape. */
    private UnionShape unionShape = UnionShape.RECTANGLE;
    
    /** The union position. */
    private UnionPosition unionPosition = UnionPosition.CANTON;

    /**
     * The number of stars in the union. This value is only relevant
     * if the flag contains a union.
     */
    private int stars = 13;

    /**
     * The number of background stripes. This value is only relevant
     * if the background contains stripes (currently FESSES or
     * PALES).
     */
    private int stripes = 13;


    /**
     * Instantiates a new flag.
     *
     * @param background the background
     * @param decoration the decoration
     * @param unionPosition the union position
     */
    public Flag(Background background, Decoration decoration,
                UnionPosition unionPosition) {
        this(background, decoration, unionPosition, UnionShape.RECTANGLE);
    }

    /**
     * Instantiates a new flag.
     *
     * @param background the background
     * @param decoration the decoration
     * @param unionPosition the union position
     * @param unionShape the union shape
     */
    public Flag(Background background, Decoration decoration,
                UnionPosition unionPosition, UnionShape unionShape) {
        this.background = background;
        this.decoration = decoration;
        this.unionPosition = unionPosition;
        this.unionShape = unionShape;
    }

    /**
     * Returns the background of the flag.
     *
     * @return A <code>Background</code> value.
     */
    public Background getBackground() {
        return background;
    }

    /**
     * Sets the background of the flag and returns the flag itself.
     *
     * @param background The new <code>Background</code> value.
     * @return The modified flag.
     */
    public Flag setBackground(Background background) {
        this.background = background;
        return this;
    }

    /**
     * Returns the decoration of the flag.
     *
     * @return A <code>Decoration</code> value.
     */
    public Decoration getDecoration() {
        return decoration;
    }

    /**
     * Sets the decoration of the flag and returns the flag itself.
     *
     * @param decoration The new <code>Decoration</code> value.
     * @return The modified flag.
     */
    public Flag setDecoration(Decoration decoration) {
        this.decoration = decoration;
        return this;
    }

    /**
     * Returns the union position of the flag.
     *
     * @return A <code>UnionPosition</code> value.
     */
    public UnionPosition getUnionPosition() {
        return unionPosition;
    }

    /**
     * Sets the union position of the flag and returns the flag
     * itself.
     *
     * @param position The new <code>UnionPosition</code> value.
     * @return The modified flag.
     */
    public Flag setUnionPosition(UnionPosition position) {
        this.unionPosition = position;
        return this;
    }

    /**
     * Returns the union shape of the flag.
     *
     * @return A <code>UnionShape</code> value.
     */
    public UnionShape getUnionShape() {
        return unionShape;
    }

    /**
     * Sets the union shape of the flag and returns the flag itself.
     *
     * @param shape The new <code>UnionShape</code> value.
     * @return The modified flag.
     */
    public Flag setUnionShape(UnionShape shape) {
        this.unionShape = shape;
        return this;
    }

    /**
     * Returns a <code>List</code> of background colors.
     *
     * @return A <code>List</code> of background colors.
     */
    public List<Color> getBackgroundColors() {
        return backgroundColors;
    }

    /**
     * Sets the background colors of the flag and returns the flag
     * itself.
     *
     * @param backgroundColors A <code>List</code> of background colors.
     * @return The modified flag.
     */
    public Flag setBackgroundColors(List<Color> backgroundColors) {
        this.backgroundColors = backgroundColors;
        return this;
    }

    /**
     * Sets the background colors of the flag and returns the flag
     * itself.
     *
     * @param colors A variable number of background colors.
     * @return The modified flag.
     */
    public Flag setBackgroundColors(Color... colors) {
        backgroundColors.clear();
        for (Color color : colors) {
            if (color != null) {
                backgroundColors.add(color);
            }
        }
        return this;
    }

    /**
     * Returns the union color of the flag.
     *
     * @return A <code>Color</code> value.
     */
    public Color getUnionColor() {
        return unionColor;
    }

    /**
     * Sets the union color of the flag and returns the flag itself.
     *
     * @param unionColor The new <code>Color</code> value.
     * @return The modified flag.
     */
    public Flag setUnionColor(Color unionColor) {
        this.unionColor = unionColor;
        return this;
    }

    /**
     * Returns the decoration color of the flag.
     *
     * @return A <code>Color</code> value.
     */
    public Color getDecorationColor() {
        return decorationColor;
    }

    /**
     * Sets the decoration color of the flag and returns the flag
     * itself.
     *
     * @param decorationColor The new <code>Color</code> value.
     * @return The modified flag.
     */
    public Flag setDecorationColor(Color decorationColor) {
        this.decorationColor = decorationColor;
        return this;
    }

    /**
     * Returns the star color of the flag.
     *
     * @return A <code>Color</code> value.
     */
    public Color getStarColor() {
        return starColor;
    }

    /**
     * Sets the star color of the flag and returns the flag itself.
     *
     * @param starColor The new <code>Color</code> value.
     * @return The modified flag.
     */
    public Flag setStarColor(Color starColor) {
        this.starColor = starColor;
        return this;
    }

    /**
     * Returns the number of stars in the union.
     *
     * @return The number of stars.
     */
    public int getStars() {
        return stars;
    }

    /**
     * Sets the number of stars in the union and returns the flag
     * itself.
     *
     * @param stars The new number of stars.
     * @return The modified flag.
     */
    public Flag setStars(int stars) {
        this.stars = stars;
        return this;
    }

    /**
     * Returns the number of background stripes.
     *
     * @return The number of stars.
     */
    public int getStripes() {
        return stripes;
    }

    /**
     * Sets the number of background stripes and returns the flag
     * itself.
     *
     * @param stripes The new number of background stripes.
     * @return The modified flag.
     */
    public Flag setStripes(int stripes) {
        this.stripes = stripes;
        return this;
    }

    /**
     * Generates an image of the flag.
     *
     * @return An image of the flag.
     */
    public BufferedImage getImage() {
        BufferedImage image = new BufferedImage(WIDTH, HEIGHT,
                                                BufferedImage.TYPE_INT_RGB);
        Graphics2D g = image.createGraphics();
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                           RenderingHints.VALUE_ANTIALIAS_ON);

        if (backgroundColors.isEmpty()) {
            backgroundColors.add(Color.BLACK);
        }
        // draw background
        switch(background) {
        case FESSES:
        case PALES:
            if (stripes < 1) {
                drawBackground(g);
            } else {
                drawStripes(g, background.alignment, stripes);
            }
            break;
        case PLAIN:
            drawBackground(g);
            break;
        case QUARTERLY:
            drawQuarters(g);
            break;
        case PER_BEND:
            drawPerBend(g, false);
            break;
        case PER_BEND_SINISTER:
            drawPerBend(g, true);
            break;
        case PER_SALTIRE:
            drawPerSaltire(g);
            break;
        default:
            break;
        }

        // draw decoration
        GeneralPath decorationShape = null;
        switch(decoration) {
        case GREEK_CROSS:
        case CROSS:
        case SCANDINAVIAN_CROSS:
            decorationShape = getCross(decoration);
            break;
        case CHEVRON:
            decorationShape = getTriangle(UnionShape.CHEVRON, false);
            break;
        case PALL:
            decorationShape = getPall();
            break;
        case BEND:
            decorationShape = getBend(false);
            break;
        case BEND_SINISTER:
            decorationShape = getBend(true);
            break;
        case SALTIRE:
            decorationShape = getBend(true);
            decorationShape.append(getBend(false), false);
            break;
        case SALTIRE_AND_CROSS:
            decorationShape = getBend(true);
            decorationShape.append(getBend(false), false);
            decorationShape.append(getCross(Decoration.CROSS), false);
            break;
        default:
            break;
        }
        if (decorationShape != null) {
            g.setColor(decorationColor);
            g.fill(decorationShape);
        }

        if (unionPosition == null
            || unionPosition == UnionPosition.NONE) {
            return image;
        }

        GeneralPath union = null;
        GeneralPath starShape = null;
        // draw union
        if (unionShape == null && decoration != null) {
            unionShape = decoration.unionShape;
        }
        switch(unionShape) {
        case RECTANGLE:
            Rectangle2D.Double rectangle = getRectangle();
            union = new GeneralPath(rectangle);
            starShape = getUnionRectangle(rectangle);
            break;
        case CHEVRON:
            union = getTriangle(unionShape, decoration == Decoration.PALL);
            starShape = getUnionTriangle(true);
            break;
        case BEND:
            union = getTriangle(unionShape, (decoration == Decoration.BEND)
                                || (decoration == Decoration.BEND_SINISTER));
            starShape = getUnionTriangle(false);
            transformBend(union);
            transformBend(starShape);
            break;
        case RHOMBUS:
            union = getRhombus();
            starShape = getUnionRhombus();
            break;
        case TRIANGLE:
            union = getTriangle(unionShape, decoration == Decoration.SALTIRE);
            starShape = getUnionTriangle(true);
            transformTriangle(union);
            transformTriangle(starShape);
            break;
        default:
            break;
        }
        if (!(union == null || unionColor == null)) {
            g.setColor(unionColor);
            g.fill(union);
        }
        if (starShape != null) {
            g.setColor(starColor);
            g.fill(starShape);
        }
        g.dispose();
        return image;
    }

    /**
     * Return the stars in a rectangular "union", distributed
     * according to rules derived from historical flags of the United
     * States.
     *
     * @param union The rectangular area to fill.
     * @return The union path
     */
    private GeneralPath getUnionRectangle(Rectangle2D.Double union) {

        if (union == null) return null;

        GeneralPath unionPath;
        if (stars < 14) {
            double radius = 0.3 * Math.min(union.height, union.width);
            unionPath = getCircleOfStars(radius);
        } else {
            unionPath = getGridOfStars(union);
        }
        double x = union.x + union.width / 2;
        double y = union.y + union.height / 2;
        center(unionPath, x, y);
        return unionPath;
    }

    /**
     * Gets the union triangle.
     *
     * @param isosceles the isosceles
     * @return the union triangle
     */
    private GeneralPath getUnionTriangle(boolean isosceles) {
        boolean small = (decoration == Decoration.PALL
                         || decoration == Decoration.BEND
                         || decoration == Decoration.BEND_SINISTER);

        double x = 0;
        double y = 0;
        double r = 0;
        if (unionShape == UnionShape.CHEVRON) {
            x = CHEVRON_X;
            y = HEIGHT;
            if (small) {
                x -= BEND_X;
                y -= 2 * BEND_Y;
            }
            r = SQRT_3 * y / 6;
        } else if (unionShape == UnionShape.TRIANGLE) {
            if (unionPosition == UnionPosition.LEFT
                || unionPosition == UnionPosition.RIGHT) {
                x = WIDTH / 2.00;
                y = HEIGHT;
                if (small) {
                    x -= BEND_X;
                    y -= 2 * BEND_Y;
                }
                r = SQRT_3 * y / 6;
            } else {
                x = HEIGHT / 2.00;
                y = WIDTH;
                if (small) {
                    x -= BEND_Y;
                    y -= 2 * BEND_X;
                }
                double h = y / 2;
                double c = Math.sqrt(h * h + x * x);
                r = x * y / (y + 2 * c);
            }
        } else {
            // union shape is bend
            x = WIDTH;
            y = HEIGHT;
            if (small) {
                x -= BEND_X;
                y -= BEND_Y;
            }
            double c = Math.sqrt(x * x + y * y);
            double a = x * y / 2;
            r = 2 * a / (x + y + c);
        }
        // leave a margin
        double radius = r * 0.6;

        GeneralPath unionPath = new GeneralPath();
        if (stars < 14) {
            unionPath = getCircleOfStars(radius);
            if (isosceles) {
                if (unionPosition == UnionPosition.LEFT
                    || unionPosition == UnionPosition.RIGHT) {
                    center(unionPath, r, HEIGHT / 2.00);
                } else {
                    center(unionPath, r, WIDTH / 2.00);
                }
            } else {
                center(unionPath, r, r);
            }
        } else {

            int sum = 0;
            int rows = 1;
            while (sum < stars) {
                sum += rows;
                rows++;
            }
            int missing = sum - stars;
            double slope = y / x;
            double dx = x / rows;
            double xx = dx / 2;
            double height = y - xx * slope;
            double offset = 0;
            rows--;
            double dy = height / rows;
            for (int index = rows; index > 0; index--) {
                if (isosceles) {
                    height = y - xx * slope;
                    dy = height / index;
                    offset = (HEIGHT - height) / 2;
                }
                double yy = dy / 2;
                int count = index;
                if (missing > 0) {
                    count = index - missing;
                    yy += missing / 2.00 * dy;
                    missing = 0;
                }
                for (int starVal = 0; starVal < count; starVal++) {
                    unionPath.append(getStar(xx, yy + offset), false);
                    yy += dy;
                }
                xx += dx;
            }
        }
        return unionPath;
    }

    /**
     * Flip or rotate a top left triangle so that it fits another
     * corner.
     *
     * @param triangle The top left triangle.
     * @return The transformed triangle.
     */
    private GeneralPath transformBend(GeneralPath triangle) {
        if (unionPosition == UnionPosition.TOP) {
            if (decoration == Decoration.BEND) {
                triangle.transform(AffineTransform.getScaleInstance(-1, 1));
                triangle.transform(AffineTransform.getTranslateInstance(WIDTH, 0));
            } else if (decoration == Decoration.BEND_SINISTER) {
                // nothing to do: default is top left
            }
        } else if (unionPosition == UnionPosition.BOTTOM) {
            if (decoration == Decoration.BEND) {
                triangle.transform(AffineTransform.getScaleInstance(1, -1));
                triangle.transform(AffineTransform.getTranslateInstance(0, HEIGHT));
            } else if (decoration == Decoration.BEND_SINISTER) {
                triangle.transform(AffineTransform.getQuadrantRotateInstance(2));
                triangle.transform(AffineTransform.getTranslateInstance(WIDTH, HEIGHT));
            }
        }
        return triangle;
    }

    /**
     * Flip or rotate a left triangle so that it fits another side.
     *
     * @param triangle The left triangle.
     * @return The transformed triangle.
     */
    private GeneralPath transformTriangle(GeneralPath triangle) {
        switch(unionPosition) {
        case TOP:
            triangle.transform(AffineTransform.getQuadrantRotateInstance(1));
            triangle.transform(AffineTransform.getTranslateInstance(WIDTH, 0));
            break;
        case BOTTOM:
            triangle.transform(AffineTransform.getQuadrantRotateInstance(3));
            triangle.transform(AffineTransform.getTranslateInstance(0, HEIGHT));
            break;
        case RIGHT:
            triangle.transform(AffineTransform.getScaleInstance(-1, 1));
            triangle.transform(AffineTransform.getTranslateInstance(WIDTH, 0));
            break;
        case LEFT:
        default:
        }
        return triangle;
    }

    /**
     * Gets the union rhombus.
     *
     * @return the union rhombus
     */
    private GeneralPath getUnionRhombus() {
        GeneralPath unionPath = new GeneralPath();

        int count = 1;
        int square = 1;
        while (square < stars) {
            count++;
            square = count * count;
        }
        int rows = stars / count;
        if (rows * count < stars) rows++;
        int starCount = 0;
        double a = WIDTH / 2.00 - BEND_X;
        double b = HEIGHT / 2.00 - BEND_Y;

        if (stars < 14) {
            double c = Math.sqrt(a * a + b * b);
            double r = (a * b) / c;
            double radius = 0.6 * r;
            unionPath = getCircleOfStars(radius);
            center(unionPath, WIDTH / 2.00, HEIGHT / 2.00);
        } else {
            double dx = a / count;
            double dy = b / count;
            double dx1 = a / rows;
            double dy1 = b / rows;
            outer: for (int index = 0; index < rows; index++) {
                double x = BEND_X + dx + index * dx1;
                double y = HEIGHT / 2.00 - index * dy1;
                for (int starDouble = 0; starDouble < count; starDouble++) {
                    unionPath.append(getStar(x, y), false);
                    starCount++;
                    if (starCount == stars) {
                        break outer;
                    } else {
                        x += dx;
                        y += dy;
                    }
                }
            }
        }

        return unionPath;
    }


    /**
     * Calculate the width of stripes on the basis of the given
     * alignment.
     *
     * @param alignment The alignment of the stripes.
     * @return The width of the stripes.
     */
    private double getStripeWidth(Alignment alignment) {
        return (alignment == Alignment.HORIZONTAL)
            ? WIDTH : (double) WIDTH / stripes;
    }

    /**
     * Calculate the height of stripes on the basis of the given
     * alignment.
     *
     * @param alignment The alignment of the stripes.
     * @return The height of the stripes.
     */
    private double getStripeHeight(Alignment alignment) {
        return (alignment == Alignment.VERTICAL)
            ? HEIGHT : (double) HEIGHT / stripes;
    }

    /**
     * Draw background.
     *
     * @param g the g
     */
    private void drawBackground(Graphics2D g) {
        g.setColor(backgroundColors.get(0));
        g.fillRect(0, 0, WIDTH, HEIGHT);
    }

    /**
     * Draw stripes.
     *
     * @param g the g
     * @param alignment the alignment
     * @param stripes the stripes
     */
    private void drawStripes(Graphics2D g, Alignment alignment, int stripes) {
        int colors = backgroundColors.size();
        double stripeWidth = getStripeWidth(alignment);
        double stripeHeight = getStripeHeight(alignment);
        double x = (alignment == Alignment.VERTICAL)
            ? stripeWidth : 0;
        double y = (alignment == Alignment.HORIZONTAL)
            ? stripeHeight : 0;
        Rectangle2D.Double rectangle = new Rectangle2D.Double();
        for (int index = 0; index < stripes; index++) {
            g.setColor(backgroundColors.get(index % colors));
            rectangle.setRect(index * x, index * y, stripeWidth, stripeHeight);
            g.fill(rectangle);
        }
    }

    /**
     * Draw quarters.
     *
     * @param g the g
     */
    private void drawQuarters(Graphics2D g) {
        int colors = backgroundColors.size();
        int[] x = { 0, 1, 1, 0 };
        int[] y = { 0, 0, 1, 1 };
        double halfWidth = WIDTH / 2.00;
        double halfHeight = HEIGHT / 2.00;
        double offset = (decoration == Decoration.SCANDINAVIAN_CROSS)
            ? CROSS_OFFSET : 0;
        Rectangle2D.Double rectangle = new Rectangle2D.Double();
        for (int index = 0; index < 4; index++) {
            g.setColor(backgroundColors.get(index % colors));
            rectangle.setRect(x[index] * halfWidth - offset, y[index] * halfHeight,
                              halfWidth + x[index] * offset, halfHeight);
            g.fill(rectangle);
        }
    }

    /**
     * Draw per bend.
     *
     * @param g the g
     * @param sinister the sinister
     */
    private void drawPerBend(Graphics2D g, boolean sinister) {
        drawBackground(g);
        int colors = backgroundColors.size();
        GeneralPath path = new GeneralPath();
        path.moveTo(0, HEIGHT);
        path.lineTo(sinister ? WIDTH : 0, 0);
        path.lineTo(WIDTH, HEIGHT);
        g.setColor(backgroundColors.get(1 % colors));
        g.fill(path);
    }

    /**
     * Draw per saltire.
     *
     * @param g the g
     */
    private void drawPerSaltire(Graphics2D g) {
        int colors = backgroundColors.size();
        GeneralPath path = new GeneralPath();
        int[] x = { 0, WIDTH, WIDTH, 0 };
        int[] y = { 0, 0, HEIGHT, HEIGHT };
        double halfWidth = WIDTH / 2.00;
        double halfHeight = HEIGHT / 2.00;
        for (int index = 0; index < 4; index++) {
            path.moveTo(x[index], y[index]);
            path.lineTo(halfWidth, halfHeight);
            int nextIndex = (index + 1) % 4;
            path.lineTo(x[nextIndex], y[nextIndex]);
            g.setColor(backgroundColors.get(index % colors));
            g.fill(path);
            path.reset();
        }
    }

    /**
     * Gets the cross.
     *
     * @param decoration the decoration
     * @return the cross
     */
    private GeneralPath getCross(Decoration decoration) {
        double quarterWidth = (WIDTH - DECORATION_SIZE) / 2;
        double quarterHeight = (HEIGHT - DECORATION_SIZE) / 2;
        double offset = 0;
        double width = WIDTH;
        double height = HEIGHT;
        switch(decoration) {
        case SCANDINAVIAN_CROSS:
            offset = CROSS_OFFSET;
            break;
        case GREEK_CROSS:
            width = height = Math.min(WIDTH, HEIGHT) - 2 * DECORATION_SIZE;
            break;
        default:
            break;
        }
        GeneralPath cross = new GeneralPath();
        cross.append(new Rectangle2D.Double((WIDTH - width) / 2, quarterHeight,
                                            width, DECORATION_SIZE), false);
        cross.append(new Rectangle2D.Double(quarterWidth - offset, (HEIGHT - height) / 2,
                                            DECORATION_SIZE, height), false);
        return cross;
    }

    /**
     * Gets the bend.
     *
     * @param sinister the sinister
     * @return the bend
     */
    private GeneralPath getBend(boolean sinister) {
        GeneralPath path = new GeneralPath();
        if (sinister) {
            path.moveTo(0, HEIGHT);
            path.lineTo(0, HEIGHT - BEND_Y);
            path.lineTo(WIDTH - BEND_X, 0);
            path.lineTo(WIDTH, 0);
            path.lineTo(WIDTH, BEND_Y);
            path.lineTo(BEND_X, HEIGHT);
        } else {
            path.moveTo(0, 0);
            path.lineTo(BEND_X, 0);
            path.lineTo(WIDTH, HEIGHT - BEND_Y);
            path.lineTo(WIDTH, HEIGHT);
            path.lineTo(WIDTH - BEND_X, HEIGHT);
            path.lineTo(0, BEND_Y);
        }
        return path;
    }

    /**
     * Gets the pall.
     *
     * @return the pall
     */
    private GeneralPath getPall() {
        double y1 = (HEIGHT - DECORATION_SIZE) / 2;
        double y2 = (HEIGHT + DECORATION_SIZE) / 2;
        double x = BEND_X + y1 * SQRT_3;
        GeneralPath path = new GeneralPath(getTriangle(UnionShape.CHEVRON, true));
        path.lineTo(0, HEIGHT);
        path.lineTo(BEND_X, HEIGHT);
        path.lineTo(x, y2);
        path.lineTo(WIDTH, y2);
        path.lineTo(WIDTH, y1);
        path.lineTo(x, y1);
        path.lineTo(BEND_X, 0);
        path.lineTo(0, 0);
        return path;
    }

    /**
     * Returns a triangle of the given shape and size. This is a large
     * top left triangle if the given shape is BEND, and a small left
     * triangle if the given shape is CHEVRON or TRIANGLE.
     *
     * @param unionShape The shape of the union.
     * @param small Whether the shape is limited by decorations.
     * @return the triangle
     */
    private GeneralPath getTriangle(UnionShape unionShape, boolean small) {
        GeneralPath path = new GeneralPath();
        double x = 0;
        double y = 0;
        if (small) {
            x = BEND_X;
            y = BEND_Y;
        }
        switch(unionShape) {
        case BEND:
            path.moveTo(0, HEIGHT - y);
            path.lineTo(0, 0);
            path.lineTo(WIDTH - x, 0);
            break;
        case CHEVRON:
            path.moveTo(0, y);
            path.lineTo(CHEVRON_X - x, HEIGHT / 2.00);
            path.lineTo(0, HEIGHT - y);
            break;
        case TRIANGLE:
            if (unionPosition == UnionPosition.LEFT
                || unionPosition == UnionPosition.RIGHT) {
                path.moveTo(0, y);
                path.lineTo(WIDTH / 2.00 - x, HEIGHT / 2.00);
                path.lineTo(0, HEIGHT - y);
            } else {
                path.moveTo(0, x);
                path.lineTo(HEIGHT / 2.00 - y, WIDTH / 2.00);
                path.lineTo(0, WIDTH - x);
            }
            break;
        default:
            break;
        }
        return path;
    }

    /**
     * Gets the rhombus.
     *
     * @return the rhombus
     */
    private GeneralPath getRhombus() {
        GeneralPath rhombus = new GeneralPath();
        rhombus.moveTo(WIDTH / 2.00, BEND_Y);
        rhombus.lineTo(WIDTH - BEND_X, HEIGHT / 2.00);
        rhombus.lineTo(WIDTH / 2.00, HEIGHT - BEND_Y);
        rhombus.lineTo(BEND_X, HEIGHT / 2.00);
        return rhombus;
    }

    /**
     * Gets the rectangle.
     *
     * @return the rectangle
     */
    private Rectangle2D.Double getRectangle() {
        if (unionPosition == null || unionPosition == UnionPosition.NONE) {
            return null;
        }
        Rectangle2D.Double union = new Rectangle2D.Double();
        if (unionPosition.alignment == Alignment.VERTICAL) {
            if (background.alignment == Alignment.VERTICAL
                && stripes < 3) {
                union.width = WIDTH / stripes;
                if (stripes == 2 && unionPosition == UnionPosition.RIGHT) {
                    union.x = WIDTH /2.00;
                }
            } else {
                union.width = WIDTH / 3.00;
                union.x = unionPosition.index * union.width;
            }
            union.height = HEIGHT;
        } else if (unionPosition.alignment == Alignment.HORIZONTAL) {
            if (background.alignment == Alignment.HORIZONTAL
                && stripes < 3) {
                union.height = HEIGHT / stripes;
                if (stripes == 2 && unionPosition == UnionPosition.BOTTOM) {
                    union.y = HEIGHT / 2.00;
                }
            } else {
                union.height = HEIGHT / 3.00;
                union.y = unionPosition.index * union.height;
            }
            union.width = WIDTH;
        } else {
            // canton
            union.width = WIDTH / 2.00;
            union.height = HEIGHT / 2.00;
            if (background.alignment == Alignment.HORIZONTAL) {
                union.height = (stripes < 3.00)
                    ? HEIGHT / 2.00
                    : (stripes / 2.00) * getStripeHeight(background.alignment);
            } else if (background.alignment == Alignment.VERTICAL) {
                union.width = (stripes < 3.00)
                    ? WIDTH / 2.00
                    : (stripes / 2.00) * getStripeWidth(background.alignment);
            }
            if (decoration == Decoration.GREEK_CROSS
                || decoration == Decoration.CROSS) {
                union.width = (WIDTH - DECORATION_SIZE) / 2.00;
                union.height = (HEIGHT - DECORATION_SIZE) / 2.00;
            } else if (decoration == Decoration.SCANDINAVIAN_CROSS) {
                union.width = (WIDTH - DECORATION_SIZE) / 2.00
                    - CROSS_OFFSET;
                union.height = (HEIGHT - DECORATION_SIZE) / 2.00;
            }
        }

        return union;
    }

    /**
     * Return the basic five-point star.
     *
     * @return the basic star shape
     */
    private static GeneralPath getStar() {
        GeneralPath star = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        double angle = 2 * Math.PI / 5;
        double radius = STAR_SIZE / 2;
        double x = 0;
        double y = -radius;
        star.moveTo(x, y);
        int[] vertex = { 2, 4, 1, 3 };
        for (int i : vertex) {
            double phi = i * angle;
            x = radius * Math.sin(phi);
            y = -radius * Math.cos(phi);
            star.lineTo(x, y);
        }
        star.closePath();
        return star;
    }

    /**
     * Returns a star at the given coordinates (x, y).
     *
     * @param x The x coordinate of the star.
     * @param y The y coordinate of the star.
     * @return the star
     */
    public GeneralPath getStar(double x, double y) {
        return getStar(-1, x, y);
    }

    /**
     * Returns a star of the given scale at the given coordinates (x, y).
     *
     * @param scale The scale of the star.
     * @param x The x coordinate of the star.
     * @param y The y coordinate of the star.
     * @return the star
     */
    public GeneralPath getStar(double scale, double x, double y) {
        GeneralPath newStar = new GeneralPath(star);
        if (scale > 0) {
            newStar.transform(AffineTransform.getScaleInstance(scale, scale));
        }
        newStar.transform(AffineTransform.getTranslateInstance(x, y));
        return newStar;
    }

    /**
     * Centers the given path on the given point (x,y).
     *
     * @param path The path to center.
     * @param x The x coordinate of the center.
     * @param y The y coordinate of the center.
     */
    private void center(GeneralPath path, double x, double y) {
        double dx = x - path.getBounds().getX() - path.getBounds().getWidth() / 2;
        double dy = y - path.getBounds().getY() - path.getBounds().getHeight() / 2;
        path.transform(AffineTransform.getTranslateInstance(dx, dy));
    }

    /**
     * Returns either a single star, or a circle of stars with the
     * given radius, centered at the origin.
     *
     * @param radius The radius of the circle.
     * @return The circle of stars.
     */
    private GeneralPath getCircleOfStars(double radius) {
        double phi = Math.PI * 2 / stars;
        GeneralPath unionPath = new GeneralPath();
        if (stars == 0) {
            // nothing to do
        } else if (stars == 1) {
            // one double sized star
            unionPath = getStar(2, 0, 0);
        } else if (stars == 2) {
            // two larger stars, on the x axis
            unionPath.append(getStar(1.5, -radius, 0), false);
            unionPath.append(getStar(1.5, radius, 0), false);
        } else {
            // a general circle of stars
            for (int i = 0; i < stars; i++) {
                double x = -radius - radius * Math.sin(i * phi);
                double y = -radius * Math.cos(i * phi);
                unionPath.append(getStar(x, y), false);
            }
        }
        return unionPath;
    }


    /**
     * Gets the grid of stars.
     *
     * @param union the union
     * @return the grid of stars
     */
    public GeneralPath getGridOfStars(Rectangle2D.Double union) {
        int[] bars = new int[2];
        for (int count = stars; count < 51; count++) {
            if (layout[count][0] > 0) {
                bars = layout[count];
                break;
            }
        }
        int maxCols = Math.max(bars[0], bars[1]);
        int rows = 2;
        int sum = bars[0] + bars[1];
        while (sum < stars) {
            sum += bars[rows%2];
            rows++;
        }
        double hSpace = union.getWidth() / (2 * maxCols);
        double vSpace = union.getHeight() / (2 * rows);
        double y = 0;
        GeneralPath grid = new GeneralPath();
        int count = 1;
        for (int row = 0; row < rows; row++) {
            int cols = bars[row%2];
            double x = (cols == maxCols) ? 0 : hSpace;
            for (int col = 0; col < cols; col++) {
                if (count > stars) {
                    break;
                }
                grid.append(getStar(x, y), false);
                x += 2 * hSpace;
                count++;
            }
            y += 2 * vSpace;
        }
        return grid;
    }

}
