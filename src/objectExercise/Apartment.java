package objectExercise;

class Apartment extends Property {
	private String floorPlan;

	Apartment(String name, String ownerName, String type, int price, String floorPlan) {
		super(name, ownerName, type, price);
		this.floorPlan = floorPlan;
	}

	public void introduction() {
		super.introduction();
		System.out.println("間取り：" + floorPlan);
		System.out.println("=============================");
	}

	public String getFloorPlan() {
		return floorPlan;
	}

	public void setFloorPlan(String floorPlan) {
		this.floorPlan = floorPlan;
	}

}
