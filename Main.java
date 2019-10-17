class Main{

	public static void main(String[] args){
		
		Vol vol1 = new Vol();
		
		Vol vol2 = new Vol();
		vol2.fermer();
		
		Client client1 = new Client();
		Passager pass1 = new Passager("jean", "jean.dupont@gmail.com");
		
		System.out.println("reservation 1");
		Reservation res1 = new Reservation(vol1, pass1);
		System.out.println("reservation 2 celle qui ne marche pas");
		Reservation res2 = new Reservation(vol2, pass1);
		
		res1.getPassager().showPassager();
	}
}
