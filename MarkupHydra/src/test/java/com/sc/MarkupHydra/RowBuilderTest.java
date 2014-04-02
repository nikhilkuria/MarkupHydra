package com.sc.MarkupHydra;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.rendersnake.HtmlCanvas;

import com.sc.MarkupHydra.table.RowBuilder;

public class RowBuilderTest {

	@Test
	public void testRowBuild() throws IOException{
		RowBuilder rowBuilder = new RowBuilder();
		HtmlCanvas canvas = new HtmlCanvas();
		
		canvas.table();
		
		List<String> entries = new ArrayList<String>();
		entries.add(ReportVariables.REPORT_MAIN_HEADER);
		rowBuilder.addRowToCanvas(canvas, entries , null, new ReportHeader(), null);
		
		canvas._table();
		
		System.err.println(canvas.toHtml());
		
	}
	
}
