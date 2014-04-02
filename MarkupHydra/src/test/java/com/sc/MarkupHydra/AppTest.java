package com.sc.MarkupHydra;

import org.junit.Test;

import com.sc.MarkupHydra.css.StyleStringGenerator;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test
	public void TestStyleString(){
		String styleString = StyleStringGenerator.generate(new ReportHeader());
		System.out.println(styleString);
	}
}
