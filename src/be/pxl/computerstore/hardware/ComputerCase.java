package be.pxl.computerstore.hardware;

import java.util.Random;

import be.pxl.computerstore.util.Dimension;

public class ComputerCase {

	private String vendor;
	private String name;
	private double price;
	private Dimension dimension;
	private double weight;
	private String articleNumber;
	Random random = new Random();

	public ComputerCase(String vendor, String name, double price) {
		this.vendor = vendor;
		this.name = name;
		this.price = price;
		articleNumber = vendor + "-" + (random.nextInt(99998) + 1) + "-"
				+ "111";
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Dimension getDimension() {
		return dimension;
	}

	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getArticleNumber() {
		return articleNumber;
	}

	public void setArticleNumber(String articleNumber) {
		this.articleNumber = articleNumber;
	}

}
