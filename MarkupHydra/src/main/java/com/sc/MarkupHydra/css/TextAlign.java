package com.sc.MarkupHydra.css;

public enum TextAlign {

	LEFT("LEFT"),RIGHT("RIGHT"),CENTER("CENTER");
	
	private String value;
	
	private TextAlign(String value){
		this.value = value;
	}
	
	public String getValue(){
		return this.value;
	}
	
}
