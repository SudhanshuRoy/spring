package loose_coupling;

public class Travel{
	
	Vehical v;
	
//	Travel(Vehical v){
//		this.v=v;
//	}
	
		
		
	
	public void setV(Vehical v) {
		this.v = v;
	}



	public void journey() {
		v.go();
		System.out.println("Jounrney started...");
		}
}
