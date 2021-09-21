package net.progressit.visualz;

import java.awt.Color;

public class VScene {
	public class Layout{
		public double width = 800;
		public double height = 600;
		public double maxWidth = Double.MAX_VALUE;
		public double maxHeight = Double.MAX_VALUE;
		public String unitName = "pixel";
	}
	public class Background{
		public Color background = Color.WHITE;
	}
	
	public Layout layout = new Layout();
	public Background background = new Background();
	
}
