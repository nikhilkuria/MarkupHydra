package com.sc.MarkupHydra.css;

public class DefaultTextStyle extends TextStyle{

	@Override
	public FontStyle getFontStyle() {		
		return FontStyle.NORMAL;
	}

	@Override
	public FontWeight getFontWeight() {
		return FontWeight.NORMAL;
	}

	@Override
	public TextAlign getTextAlign() {
		return TextAlign.LEFT;
	}

	@Override
	public String getColor() {
		return DefaultConstants.DEFAULT_BLACK;
	}

	@Override
	public int getSize() {
		return DefaultConstants.DEFAULT_TEXT_SIZE;
	}

}
