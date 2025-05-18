package objectExercise;

class Land extends Property {
	private double space;

	Land(String name, String ownerName, String type, int price, double space) {
		super(name, ownerName, type, price);
		this.space = space;
	}

	public void introduction() {
		super.introduction();
		System.out.println("広さ：" + space + "㎡");
		System.out.println("=============================");
	}

	public double getSpace() {
		return space;
	}

	public void setSpace(double space) {
		this.space = space;
	}

}
