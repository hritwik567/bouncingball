package bouncingball;

import acm.graphics.*;

public class GFace extends GCompound {
	
	private static final double eye = 0.15;
	private static final double mouth_width = 0.50;
	private static final double mouth_height = 0.03;
	private static final double nose_height = 0.10;
	private static final double nose_width  = 0.15;
	
	
	public GFace(double width,double height) {
		head = new GOval(width,height);
		lefteye = new GOval(eye*width,eye*height);
		righteye = new GOval(eye*width,eye*height);
		mouth = new GRect(mouth_width*width,mouth_height*height);
		nose = createnose(nose_width*width,nose_height*height);
		
		add(head,0,0);
		add(lefteye,0.25*width-(eye*width)/2,0.25*height-(eye*height)/2);
		add(righteye,0.75*width-(eye*width)/2,0.25*height-(eye*height)/2);
		add(nose,0.5*width,0.5*height);
		add(mouth,0.5*width-(mouth_width*width)/2,0.75*height-(mouth_height*height)/2);
	}
	private GPolygon createnose(double width,double height){
		GPolygon poly = new GPolygon();
		poly.addVertex(0,-(height/2));
		poly.addVertex((width/2),(height/2));
		poly.addVertex(-(width/2),(height/2));
		return poly;
	}
	private GOval head;
	private GOval lefteye;
	private GOval righteye;
	private GRect mouth;
	private GPolygon nose;
	
	
	
	

}
