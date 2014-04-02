package com.sc.MarkupHydra;

import com.sc.MarkupHydra.css.FontStyle;
import com.sc.MarkupHydra.css.FontWeight;
import com.sc.MarkupHydra.css.TextAlign;
import com.sc.MarkupHydra.css.TextStyle;

public class ReportHeader extends TextStyle {

	@Override
	public String getColor() {
		return ReportVariables.LIGHT_COLOR_ORANGE;
	}

	@Override
	public FontStyle getFontStyle() {
		
		return FontStyle.NORMAL;
	}

	@Override
	public FontWeight getFontWeight() {
		
		return FontWeight.BOLD;
	}

	@Override
	public int getSize() {
		
		return 30;
	}

	@Override
	public TextAlign getTextAlign() {
		
		return TextAlign.CENTER;
	}

}
