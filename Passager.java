class Passager {
	
	private String nom;
	private String contact;
	
	public Passager(String nom, String contact){
		
		this.nom = nom;
		this.contact = contact;
		
	}
	
	public Passager(){
	    this.nom = "unknow";
	    this.contact = "unknow";
	    
	}
	
	public void showPassager(){
		System.out.println(this.nom);
	}
	
}
