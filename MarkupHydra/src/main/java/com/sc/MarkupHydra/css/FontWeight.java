package com.sc.MarkupHydra.css;

public enum FontWeight {

	BOLD("BOLD"),NORMAL("NORMAL");
	
	private String value;
	
	private FontWeight(String value){
		this.value = value;
	}
	
	public String getValue(){
		return this.value;
	}
	
}
