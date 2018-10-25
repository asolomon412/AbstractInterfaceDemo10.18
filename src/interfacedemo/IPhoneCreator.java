package interfacedemo;

/**
 * @author Antonella
 *
 */
public class IPhoneCreator {

	static int newX = 3;
	static int new7P = 2;
	static int new6S = 5;

	// created this for reuse
	public static IPhone getProduct(IPhone product, int choice) {
		if (choice == 1) {
			product = new IPhone6S();
			setUp(product);
			new6S--;
			if (new6S <= 0) {
				new6S = 0;
			}
			IPhone6S p = (IPhone6S) product;
			p.getCondition(new6S);

		} else if (choice == 2) {
			product = new IPhone7P();
			setUp(product);
			new7P--;
			if (new7P <= 0) {
				new7P = 0;
			}
			IPhone7P p = (IPhone7P) product;
			p.getCondition(new7P);
		} else {
			product = new IPhoneX();
			setUp(product);
			newX--;
			if (newX <= 0) {
				newX = 0;
			}
			IPhoneX p = (IPhoneX) product;
			p.getCondition(newX);
		}
		return product;
	}

	private static void setUp(IPhone product) {
		product.prepare();
		product.bundle();
		product.label();
	}

}
