package interfacedemo;

public class IPhoneX extends Phone implements IPhone {

	String name = "IPhoneX";
	Condition condition;

	@Override
	public double getPrice() { // could also have set the price in the IPhoneCreator class to avoid having to
								// // do this
		if (condition == Condition.NEW) {
			super.setPrice(1195.99);
		} else {
			super.setPrice(1144.95);
		}
		return super.getPrice(); // need the super reference here or the my compiler will think I am trying to
		// perform recursion
	}

	@Override
	public void prepare() {
		System.out.println("Preparing IPhoneX...");

	}

	@Override
	public void bundle() {
		System.out.println("Bundling IPhoneX...");

	}

	@Override
	public void label() {
		System.out.println("Adding label for IPhoneX...");

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
	public String toString() {
		return name + " price: " + getPrice() + " condtion: " + condition;
	}

}
