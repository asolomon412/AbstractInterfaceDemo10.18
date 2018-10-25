package abstractdemo;

import java.util.ArrayList;

public class MachineApp {

	public static void main(String[] args) {
		// we can't create a new instance of an abstract class
		// Machine machine = new Machine();

		Machine nikon = new Camera();
		nikon.setId("My Nikon");
		Camera updatedNikon = (Camera) nikon;
		updatedNikon.setBrand("Nikon");
		System.out.println("Old Nikon: " + nikon);
		
		nikon.run();
		
		Computer myMac = new Computer();
		myMac.setId("Antonella's MacBook");
		myMac.setKeyboard(true);
		System.out.println(myMac);
		myMac.run();
		
		ArrayList<Machine> machineList = new ArrayList<>();
		machineList.add(nikon);
		machineList.add(myMac);
		machineList.add(new Camera());
		
		for (Machine m: machineList) {
			System.out.println(m);
		}
		
		
		
	}

}
