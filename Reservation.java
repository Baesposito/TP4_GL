
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
		
		if(vol.getStatut()){
			
			this.vol = vol;
			System.out.print("nouvelle reservation pour ");
			this.passager.showPassager();
			
		}
		else{
			this.etat = "annule";
			throw new IllegalArgumentException("Le vol demandé n'est pas ouvert");
		}
		
		
	}
		
	
	public void annuler(){
		
		this.etat = "annule";
	
	}
	
	public void confirmer(){
		
		if(this.vol.getStatut()){
			this.etat = "confirme";
		}
		else{
			throw new IllegalArgumentException("Le vol demandé a ete ferme");
		}	
	}

	public void payer(){
	
		if(this.etat == "confirme"){
			this.etat = "payé";
		}
		else{
			throw new IllegalArgumentException("la reservation n'est pas encore validee");
		}
		
	}

	public Passager getPassager(){
	
		return this.passager;
	
	}

}
