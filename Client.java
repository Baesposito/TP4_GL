public class Client{
	
	private String nom;
	private String paiement;
	private String contact;
	private String reference;
	
	public Client() {
		
		System.out.println("nouveau client inconnu");
		
		this.nom = "Unknow";
		this.contact = "Unknow";
		this.reference = "123456789"; // à déterminer
		
	}
	
	public Client(String nom, String contact) {
		
		this.nom = nom;
		this.contact = contact;
		this.reference = "123456789"; // à déterminer
		
	}



}
