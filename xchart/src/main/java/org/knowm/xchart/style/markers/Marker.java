package org.knowm.xchart.style.markers;

import java.awt.BasicStroke;
import java.awt.Graphics2D;

/** @author timmolter */
public abstract class Marker {

  final BasicStroke stroke = new BasicStroke(1, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);

  public abstract void paint(Graphics2D g, double xOffset, double yOffset, int markerSize);
}
