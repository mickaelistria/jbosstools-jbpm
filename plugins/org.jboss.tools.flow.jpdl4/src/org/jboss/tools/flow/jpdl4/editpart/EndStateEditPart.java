package org.jboss.tools.flow.jpdl4.editpart;

import org.eclipse.draw2d.IFigure;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.jboss.tools.flow.common.editpart.ElementEditPart;
import org.jboss.tools.flow.common.figure.RectangleElementFigure;
import org.jboss.tools.flow.jpdl4.Activator;

public class EndStateEditPart extends ElementEditPart {

    private static final Image ICON = ImageDescriptor.createFromURL(
        Activator.getDefault().getBundle().getEntry("icons/end.gif")).createImage();
    
    protected IFigure createFigure() {
        RectangleElementFigure figure = new RectangleElementFigure();
        figure.setIcon(ICON);
        return figure;
    }

}