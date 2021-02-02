package org.fujitsu.training.codes;

public class Dimension {

	protected Dimension() {
		width = 10.0;
		height = 20.0;
	}

	private Double width;
	private Double height;

	public Dimension(Double width, Double height) {
		this();
		this.width = width;
		this.height = height;
	}

	public double getDimension() {
		Double size = width * height;
		return size;
	}
}
