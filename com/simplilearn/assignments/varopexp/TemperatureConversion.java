package com.simplilearn.assignments.varopexp;

import java.util.Scanner;

public class TemperatureConversion {

	private float convertedTemperature, originalTemperature;
	private char convertTo;

	public static void main(String[] args) {
		TemperatureConversion t = new TemperatureConversion();
		t.readTemp();
		t.calcTemp();
		t.displayTemp();
	}
	public void readTemp() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter conversion mode C / F :");
		setConvertTo(scan.next().charAt(0));
		System.out.println("Enter Temperature to convert :");
		setOriginalTemperature(scan.nextFloat());
	}

	private void calcTemp() {
		float convertedTemperature = 0.0f;

		if (getConvertTo() == 'F') {
			convertedTemperature = (getOriginalTemperature() * 9 / 5) + 32;
		} else if (getConvertTo() == 'C') {
			convertedTemperature = (getOriginalTemperature() - 32) * 5 / 9;
		}
		setConvertedTemperature(convertedTemperature);
	}

	public void displayTemp() {
		System.out.println("Converted to " + getConvertTo() + " : " + getConvertedTemperature());
	}

	public float getOriginalTemperature() {
		return this.originalTemperature;
	}

	public void setOriginalTemperature(float originalTemperature) {
		this.originalTemperature = originalTemperature;
	}

	public float getConvertedTemperature() {
		return this.convertedTemperature;
	}

	public void setConvertedTemperature(float convertedTemperature) {
		this.convertedTemperature = convertedTemperature;
	}

	public char getConvertTo() {
		return this.convertTo;
	}

	public void setConvertTo(char convertTo) {
		this.convertTo = convertTo;
	}
}
