package com.sc.MarkupHydra.css;

public abstract class TextStyle {

	private FontStyle fontStyle;
	private FontWeight fontWeight;
	private TextAlign textAlign;
	
	private String color;
	private int size;
	
	public FontStyle getFontStyle() {
		return fontStyle;
	}
	public FontWeight getFontWeight() {
		return fontWeight;
	}
	public TextAlign getTextAlign() {
		return textAlign;
	}
	public String getColor() {
		return color;
	}
	public int getSize() {
		return size;
	}	
}
