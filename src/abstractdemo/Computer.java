package abstractdemo;

public class Computer extends Machine {

	private boolean keyboard;

	public boolean isKeyboard() {
		return keyboard;
	}

	public void setKeyboard(boolean keyboard) {
		this.keyboard = keyboard;
	}

	@Override
	public void start(String name) {
		System.out.println("Computer is starting up!");

	}

	@Override
	public void doStuff() {
		System.out.println("Build us an application!");

	}

	@Override
	public void shutDown() {
		System.out.println("Computer is shutting down!");

	}

	@Override
	public String toString() {
		return "Computer name= " + getId() + " keyboard=" + keyboard;
	}


}
