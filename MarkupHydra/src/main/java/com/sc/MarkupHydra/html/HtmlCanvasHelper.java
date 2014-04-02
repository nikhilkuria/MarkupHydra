package com.sc.MarkupHydra.html;

import static org.rendersnake.HtmlAttributesFactory.style;

import java.io.IOException;

import org.rendersnake.HtmlCanvas;

public class HtmlCanvasHelper {

	public void initCanvas(HtmlCanvas canvas) throws IOException {
		canvas
			.html()
				.body()
					.table(style("width:100%"));
		
	}
	
	public void closeCanvas(HtmlCanvas canvas) throws IOException {
		canvas
			._table()
				._body()
					._html();
		
	}
}
