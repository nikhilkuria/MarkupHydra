package com.sc.MarkupHydra.css;

public class StyleStringGenerator {

	public static String generate(TextStyle textStyle){
		StringBuilder styleString = new StringBuilder();
		
		styleString.append(StyleConstants.COLOR +":"+ textStyle.getColor() + ";");
		styleString.append(StyleConstants.FONT_SIZE + ":" + textStyle.getSize() + ";");
		styleString.append(StyleConstants.FONT_STYLE + ":" + textStyle.getFontStyle().getValue() + ";");
		styleString.append(StyleConstants.FONT_WEIGHT + ":" + textStyle.getFontWeight().getValue() + ";");
		styleString.append(StyleConstants.TEXT_ALIGN + ":" + textStyle.getTextAlign().getValue());
		
		return styleString.toString();
	}
	
}
