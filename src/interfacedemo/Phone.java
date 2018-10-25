package interfacedemo;

// abstract classes don't have to have abstract methods
public abstract class Phone implements IPhone {

	private double price;

	// abstract methods have no body (in abstract classes we do need to use the
	// access modifier public, and the keyword abstract)
	public abstract Condition getCondition(int count);

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
