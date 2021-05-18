package Entities;

public class Discount {
	private String discountName;
	private int discountPercent;
	
	public Discount() {
		
	}
	
	public Discount(String discountName, int discountPercent) {
		super();
		this.discountName = discountName;
		this.discountPercent = discountPercent;
	}

	public String getDiscountName() {
		return discountName;
	}

	public void setDiscountName(String discountName) {
		this.discountName = discountName;
	}

	public int getDiscountPercent() {
		return discountPercent;
	}

	public void setDiscountPercent(int discountPercent) {
		this.discountPercent = discountPercent;
	}
	
	
	
}
