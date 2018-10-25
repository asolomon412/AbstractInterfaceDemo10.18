package interfacedemo;

public class IPhone7P extends Phone implements IPhone {
	private String name = "IPhone 7 Plus";
	Condition condition;

	public double getPrice() {
		if (condition == Condition.NEW) {
			super.setPrice(495.99);
		} else {
			super.setPrice(444.95);
		}
		return super.getPrice(); // need the super reference here or the my compiler will think I am trying to
		// perform recursion
	}

	@Override
	public void prepare() {
		System.out.println("This is an " + name + " we are preparing your package");

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

}
