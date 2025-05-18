package objectExercise;

class Property {
	private String name;
	private String ownerName;
	private String type;
	private int price;

	Property(String name, String ownerName, String type, int price) {
		this.name = name;
		this.ownerName = ownerName;
		this.type = type;
		this.price = price;
	}

	public void introduction() {
		System.out.println("=============================");
		System.out.println("物件名：" + this.name);
		System.out.println("物件所有者名：" + this.ownerName);
		System.out.println("物件種別：" + this.type);
		System.out.println("物件価格：" + this.price + "円");
	}

	public String getName() {
		return name;
	}

	public void setName() {
		this.name = name;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
