package net.progressit.visualz;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.geom.Point2D;

import javax.swing.JComponent;

public class VView extends JComponent{
	private static final long serialVersionUID = 1L;

	public enum YAxisMode { DOWN, UP }
	public enum OriginMode { NATURAL_CORNER, CENTER }
	
	class Transforms{
		public YAxisMode yAxisMode = YAxisMode.UP;
		public double scale = 1d;
		public double rotation = 0d;
	}
	
	class SceneState{
		public VScene scene = new VScene();
		public Point2D.Double sceneOffset = new Point2D.Double( - scene.layout.width/2, scene.layout.height/2 );
		public boolean offSceneEnabled = true;
		public Color offSceneColor = VColors.coolGrayColor();
		public OriginMode originMode = OriginMode.CENTER;
		public boolean autoStretchInitial = false;
	}
	
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		
	}
}
