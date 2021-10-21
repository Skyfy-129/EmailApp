package emailapp;

public class EmailApp {
	
	public static void main(String[] args) {
		Email em1 = new Email("tia", "leach");
		System.out.println(em1.setAltEmail());
		System.out.println(em1.showInfo());
		
	}
}
