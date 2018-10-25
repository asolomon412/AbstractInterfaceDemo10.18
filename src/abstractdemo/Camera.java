package abstractdemo;

// any child class that extends a parent
// that has abstract we have to override them and
// add functionality
public class Camera extends Machine{
	
	private String brand;

	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public void start(String name) {
		System.out.println("Camera name: "+ name + "Starting camera...");
		
	}

	@Override
	public void doStuff() {
		System.out.println("Taking a photo!");
		
	}

	@Override
	public void shutDown() {
		System.out.println("Powering camera off!");
		
	}

	@Override
	public String toString() {
		return "Camera name = " + super.getId() + " brand= " + brand;
	}
	

}
