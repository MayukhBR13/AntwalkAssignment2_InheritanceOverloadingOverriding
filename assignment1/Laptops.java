package day4Assignment1;

public class Laptops extends Inventory{
	private String company;

	public Laptops(int uid, String company) {
		super(uid);
		super.setLowOrderLevelQuantity(3);
		this.company = company;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
}


