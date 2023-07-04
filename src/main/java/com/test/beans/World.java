package com.test.beans;

import org.springframework.beans.factory.annotation.Value;

public class World {
	
	@Value("Hello World")
	private String wave;
	
	
	public  String getWave() {
		return wave;
	}
	
	public void setWave(String wave) {
		this.wave = wave;
	}
}
