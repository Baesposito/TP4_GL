
import org.junit.*;



class ReservationTest{
    
    @Test(expected = IllegalArgumentException.class)
    public void VolNonOuvert(){
        Vol vol1 ;
        Passager pass1 ;
        Reservation res1 ;
        
        vol1.fermer();
        assertFalse("Vol non ouvert, impossible de reserver",vol1.statut);
        
    }
    
     
    @Test(expected = IllegalArgumentException.class)
    public void PayementNonPossible(){
            
        Reservation res2;
        String memoire = res2.etat;
        res2.payer();
        assertFalse("Reservation en attente, impossible de payer sans confirmer avant",memoire.compareTo("attente") == res2.etat.compareTo("payé") );
        
                    
    }
    
    @Test(excepted = IllegalArgumentException.class)
    public void PassagerNonRenseigne(){
    
        Passager pass = new Passager();
        
        assertNotNull("Passager invalide, le nom n'est pas renseigne",pass.nom.compareTo("unknow"));

    }
    

}
