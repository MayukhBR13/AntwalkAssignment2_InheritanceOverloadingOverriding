package day4Assignment1;

public class Accessories extends Inventory{
	private String type;

	

	public Accessories(int uid, String type) {
		super(uid);

		super.setLowOrderLevelQuantity(5);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}


