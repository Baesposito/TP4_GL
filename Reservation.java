
import java.util.*;

class Reservation {
	
	public Date date;
	public final double identifiant;
	public String etat;
	private Vol vol;
	private Passager passager;
	
	public Reservation(Vol vol, Passager pass){
	
		this.date = new Date();
		
		this.identifiant = 123456; // à déterminer
		
		this.etat = "attente";
		
		this.passager = pass;		
		
		this.vol = vol ;
	}
	
	public Reservation(){
	
		this.date = new Date();
		
		this.identifiant = 123456; // à déterminer
		
		this.etat = "attente";
		
		this.passager = new Passager();		
	
	    this.vol = new Vol();
	}	
	
	public void annuler(){
		
		this.etat = "annule";
	
	}
	
	public void confirmer(){
		
			this.etat = "confirme";
    }

	public void payer(){
	
			this.etat = "payé";
	}
		

	public Passager getPassager(){
	
		return this.passager;
	}

}
