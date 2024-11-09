
public class Adress {
	String city,state,countires;//properties

	public Adress(String city, String state, String countires) {//generate constrctors
		super();
		this.city = city;
		this.state = state;
		this.countires = countires;
	}
	public void displayAdress() {
		System.out.println("city:     "+city);
		System.out.println("state:    "+state);
		System.out.println("countires:"+countires);
		
	}	
	
	
}
