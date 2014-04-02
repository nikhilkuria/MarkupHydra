package com.sc.MarkupHydra.table;

import static org.rendersnake.HtmlAttributesFactory.style;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.rendersnake.HtmlCanvas;

import com.sc.MarkupHydra.css.StyleStringGenerator;
import com.sc.MarkupHydra.css.TextStyle;

public class TableBuilder {

	RowBuilder rowBuilder;
	
	public TableBuilder(){
		rowBuilder = new RowBuilder();
	}
	
	public void addTableToCanvas(HtmlCanvas canvas, List<List<String>> entries,
			List<String> headers, TextStyle contentStyle, TextStyle headerStyle) throws IOException {
		canvas
		.table();
			rowBuilder.addRowToCanvas(canvas, headers, headerStyle);
		
		for (List<String> rowEntries : entries) {

			rowBuilder.addRowToCanvas(canvas, rowEntries, contentStyle);
		}
		
		canvas
		._table();
	}
	
	public void addTableToCanvas(HtmlCanvas canvas, List<List<String>> entries,
			TextStyle contentStyle) throws IOException {
		canvas
			.table();
		for (List<String> rowEntries : entries) {
			
			rowBuilder.addRowToCanvas(canvas, rowEntries, null, contentStyle, null);
		}
		
		canvas
		._table();
	}
	
	public void addSimpleTableToCanvas(HtmlCanvas canvas, List<String> entries,
			String header, TextStyle contentStyle, TextStyle headerStyle) throws IOException {
		canvas
		.table();
			rowBuilder.addRowToCanvas(canvas, header, headerStyle);
		
		for (String rowEntries : entries) {
			rowBuilder.addRowToCanvas(canvas, rowEntries, contentStyle);
		}
		
		canvas
		._table();
	}
	
	public void addSimpleTableToCanvas(HtmlCanvas canvas, List<String> entries,
			TextStyle contentStyle) throws IOException {
		canvas
		.table();
		for (String rowEntries : entries) {
			rowBuilder.addRowToCanvas(canvas, rowEntries, contentStyle);
		}
		
		canvas
		._table();
	}
	
	public void addMarkedTableToCanvas(HtmlCanvas canvas,
			Map<String, List<String>> entries, List<String> headers, TextStyle contentStyle,
			TextStyle headerStyle, TextStyle markStyle) throws IOException {
		canvas
		.table();
			rowBuilder.addRowToCanvas(canvas, headers, null, headerStyle, null);
		
		for(String mark : entries.keySet()){
			rowBuilder.addRowToCanvas(canvas, entries.get(mark), mark, contentStyle, markStyle);
		}
		
		canvas
		._table();
	}

}
