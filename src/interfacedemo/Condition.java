package interfacedemo;

// enums should be declared with all caps as
// a good best practice, but will work regardless
public enum Condition {
	NEW, Refurbished;

	public String toString() {
		switch (this) {
		case NEW:
			return "brand new";
		default:
			return "old, but refurbished";
		}
	}
}
