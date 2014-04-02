package com.sc.MarkupHydra.css;

public enum FontStyle {

	ITALIC("ITALIC"),NORMAL("NORMAL");
	
	private String value;
	
	private FontStyle(String value){
		this.value = value;
	}
	
	public String getValue(){
		return this.value;
	}
	
}
