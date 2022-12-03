package loose_coupling;

public class Car implements Vehical{
	void start(){
		System.out.println("Car Started !");
	}

	@Override
	public void go() {
		start();
		
	}

}
