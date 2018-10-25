package abstractdemo;

// using the abstract keyword means that we can't create an instance of Machine
// the class does not have to have abstract methods to be declared abstract
public abstract class Machine {

	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	// abstract methods have no body and end in a semicolon
	// meaning each child that extends the parent has to 
	// implement its own behavior
	public abstract void start(String name);
	public abstract void doStuff();
	public abstract void shutDown();
	
	public void run() {
		start(getId());
		doStuff();
		shutDown();
	}
	
	@Override
	public String toString() {
		return "Machine id=" + id;
	}

}
