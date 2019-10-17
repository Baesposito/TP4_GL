
import java.time.*;

class Vol {
	
	private ZonedDateTime depart;
	private ZonedDateTime arrivee;
	private String identifiant;
	private boolean statut;
	
	public Vol(){
		
		System.out.println("nouveau vol");
		
		this.depart = ZonedDateTime.parse("2000-01-01T12:00:00Z[GMT]");
		this.arrivee = ZonedDateTime.parse("2000-01-01T14:00:00Z[GMT]");
		this.statut = true;
		
		this.identifiant = "123456"; // à déterminer
		
	}
	
	public Vol(ZonedDateTime depart,ZonedDateTime arrivee){
	
		System.out.println("nouveau vol");
		this.depart = depart;
		this.arrivee = arrivee;
		this.statut = true;
		
		this.identifiant = "123456"; // à déterminer
		
	}
	
	public Duration duree(){
		
		return Duration.between(this.depart, this.arrivee);
	
	}
	
	public void ouvrir(){
		
		this.statut = true;
		
	}

	public void fermer(){
	
		this.statut = false;
	
	}
	
	public boolean getStatut(){
	
		return this.statut;
	
	}

}
