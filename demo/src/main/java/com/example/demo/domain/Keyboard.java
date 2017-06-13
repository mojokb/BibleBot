package com.example.demo.domain;

import java.util.Arrays;

public class Keyboard {
	String type;
	String[] buttons;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String[] getButtons() {
		return buttons;
	}
	public void setButtons(String[] buttons) {
		this.buttons = buttons;
	}
	@Override
	public String toString() {
		return "Keyboard [type=" + type + ", buttons=" + Arrays.toString(buttons) + "]";
	}
}
