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

package net.sf.freecol.client.gui.plaf;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.font.LineBreakMeasurer;
import java.awt.font.FontRenderContext;
import java.awt.font.TextLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.text.AttributedCharacterIterator;
import java.text.AttributedString;
import java.util.regex.Pattern;
import javax.swing.JComponent;
import javax.swing.JToolTip;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicToolTipUI;

import net.sf.freecol.client.gui.ImageLibrary;


// TODO: Auto-generated Javadoc
/**
 * Draw the "image.background.FreeColToolTip" resource as a tiled background
 * image on tool tip popups.
 */
public class FreeColToolTipUI extends BasicToolTipUI {

    /** The Constant sharedInstance. */
    private static final FreeColToolTipUI sharedInstance = new FreeColToolTipUI();

    // FIXME: find out why we can't use the FontRenderContext of the
    /** The Constant frc. */
    // component.  And should we use fractional metrics?
    private static final FontRenderContext frc
        = new FontRenderContext(null, true, false);

    /** The Constant MARGIN. */
    private static final int MARGIN = 5;
    
    /** The maximum width. */
    private static int maximumWidth = 300;
    
    /** The Constant LEADING. */
    private static final int LEADING = 5;

    /** The Constant lineBreak. */
    private static final Pattern lineBreak = Pattern.compile("\n");


    /**
     * Instantiates a new free col tool tip UI.
     */
    private FreeColToolTipUI() {
        super();
    }

    /**
     * Creates the UI.
     *
     * @param c the c
     * @return the component UI
     */
    public static ComponentUI createUI(@SuppressWarnings("unused") JComponent c) {
        return sharedInstance;
    }

    /**
     * Sets the maximum width.
     *
     * @param width the new maximum width
     */
    public static void setMaximumWidth(int width) {
        maximumWidth = width;
    }

    /* (non-Javadoc)
     * @see javax.swing.plaf.basic.BasicToolTipUI#paint(java.awt.Graphics, javax.swing.JComponent)
     */
    @Override
    public void paint(Graphics g, JComponent c) {
        if (c.isOpaque()) {
            ImageLibrary.drawTiledImage("image.background.FreeColToolTip", g, c, null);
        }

        g.setColor(Color.BLACK); // FIXME: find out why this is necessary

        Graphics2D graphics = (Graphics2D)g;
        float x = MARGIN;
        float y = MARGIN;
        for (String line : lineBreak.split(((JToolTip) c).getTipText())) {
            if (line.isEmpty()) {
                y += LEADING;
                continue;
            }
            AttributedCharacterIterator styledText =
                new AttributedString(line).getIterator();

            LineBreakMeasurer measurer = new LineBreakMeasurer(styledText, frc);

            while (measurer.getPosition() < styledText.getEndIndex()) {

                TextLayout layout = measurer.nextLayout(maximumWidth);

                y += (layout.getAscent());
                float dx = layout.isLeftToRight() ?
                    0 : (maximumWidth - layout.getAdvance());

                layout.draw(graphics, x + dx, y);
                y += layout.getDescent() + layout.getLeading();
            }
        }
     }

    /* (non-Javadoc)
     * @see javax.swing.plaf.basic.BasicToolTipUI#getPreferredSize(javax.swing.JComponent)
     */
    @Override
    public Dimension getPreferredSize(JComponent c) {
        String tipText = ((JToolTip)c).getTipText();
        if (tipText == null || tipText.isEmpty()) {
            return new Dimension(0, 0);
        }

        float x = 0f;
        float y = 0f;
        for (String line : lineBreak.split(tipText)) {
            if (line.isEmpty()) {
                y += LEADING;
                continue;
            }
            AttributedCharacterIterator styledText
                = new AttributedString(line).getIterator();
            LineBreakMeasurer measurer = new LineBreakMeasurer(styledText, frc);

            while (measurer.getPosition() < styledText.getEndIndex()) {

                TextLayout layout = measurer.nextLayout(maximumWidth);

                x = Math.max(x, layout.getVisibleAdvance());
                y += layout.getAscent() + layout.getDescent() + layout.getLeading();

            }
        }
        return new Dimension((int) (x + 2 * MARGIN),
                             (int) (y + 2 * MARGIN));

    }

    /* (non-Javadoc)
     * @see javax.swing.plaf.basic.BasicToolTipUI#getMinimumSize(javax.swing.JComponent)
     */
    @Override
    public Dimension getMinimumSize(JComponent c) {
        return getPreferredSize(c);
    }

    /* (non-Javadoc)
     * @see javax.swing.plaf.basic.BasicToolTipUI#getMaximumSize(javax.swing.JComponent)
     */
    @Override
    public Dimension getMaximumSize(JComponent c) {
        return getPreferredSize(c);
    }
}
