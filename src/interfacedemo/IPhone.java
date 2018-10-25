package interfacedemo;

// interfaces can only have static constants as variables
// also has abstract methods
// the methods are assumed public and abstract so we don't
// need to use those keywords
public interface IPhone {

	// public and abstract are assumed here so we don't need to use the keywords
	// they are optional
	public abstract void prepare();

	void bundle();

	void label();



}
