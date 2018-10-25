package interfacedemo;

public class IPhone6S extends Phone implements IPhone, Carrier {

	private String name = "IPhone 6S";
	Condition condition;

	@Override
	public double getPrice() { // could also have set the price in the IPhoneCreator class to avoid having to
								// do this
		if (condition == Condition.NEW) {
			super.setPrice(395.99);
		} else {
			super.setPrice(344.95);
		}
		return super.getPrice(); // need the super reference here or the my compiler will think I am trying to
		// perform recursion
	}

	public String getName() {
		return name;
	}

	@Override
	public void prepare() {
		System.out.println("Preparing " + getName());

	}

	@Override
	public void bundle() {
		System.out.println("Bundling " + name);

	}

	@Override
	public void label() {
		System.out.println("Labeling " + name);

	}

	@Override
	public String toString() {
		return name + " price: $" + getPrice() + " condition: " + condition;
	}

	@Override
	public Condition getCondition(int count) {
		if (count > 0) {
			condition = Condition.NEW;
			return condition;
		}
		condition = Condition.Refurbished;
		return condition;
	}

	@Override
	public String getCarrier(String carrier) {

		return carrier;
	}

}
