package com.sc.MarkupHydra.table;

import static org.rendersnake.HtmlAttributesFactory.style;

import java.io.IOException;
import java.util.List;

import org.rendersnake.HtmlCanvas;

import com.sc.MarkupHydra.css.StyleStringGenerator;
import com.sc.MarkupHydra.css.TextStyle;

public class RowBuilder {

	public void addRowToCanvas(HtmlCanvas canvas, String entry,TextStyle textStyle) throws IOException{
		String normalStyle = StyleStringGenerator.generate(textStyle);
		canvas
			.tr();
		
			canvas
				.td(style(normalStyle)).content(entry);

	
		canvas	
			._tr();
	}
	
	public void addRowToCanvas(HtmlCanvas canvas, List<String> entries,TextStyle textStyle) throws IOException{
		String normalStyle = StyleStringGenerator.generate(textStyle);
		canvas
			.tr();
		
		for (String entry : entries) {
			canvas
				.td(style(normalStyle)).content(entry);
		}
	
		canvas	
			._tr();
	}
	
	public void addRowToCanvas(HtmlCanvas canvas, List<String> entries, String mark, TextStyle textStyle, TextStyle markStyle) throws IOException{
		String normalStyle = StyleStringGenerator.generate(textStyle);
		String markTextStyle = StyleStringGenerator.generate(markStyle);
		canvas
			.tr();
		
		for (String entry : entries) {
			canvas
				.td(style(normalStyle)).content(entry);
		}
		if(null!=mark){
			canvas
			.td(style(markTextStyle)).content(mark);
		}

		
		canvas	
			._tr();
	}
	
	public void addRowToCanvasWithHighLight(HtmlCanvas canvas, List<String> entries, List<String> highLightEntries, String mark, TextStyle textStyle, TextStyle highLightTextStyle, TextStyle markStyle) throws IOException{
		String normalStyle = StyleStringGenerator.generate(textStyle);
		String highLightStyle = StyleStringGenerator.generate(highLightTextStyle);
		canvas
			.tr();
		
		for (String entry : entries) {
			String columnTextStyle;
			if(highLightEntries.contains(entry)){
				columnTextStyle = highLightStyle;
			}else{
				columnTextStyle = normalStyle;
			}
			canvas
				.td(style(columnTextStyle)).content(entry);
		}
		
		canvas
			._tr();
	}
	
}
