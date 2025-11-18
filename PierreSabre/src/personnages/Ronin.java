package personnages;



	public class Ronin extends Humain {
	    private int honneur = 1;
	    
	    public Ronin(String nom, String boissonFavorite, int argent) {
	        super(nom, boissonFavorite, argent);
	    }
	    
	    public void donner(Commercant beneficiaire) {
	        int don = getArgent() / 10;
	        parler(beneficiaire.getNom() + " prend ces " + don + " sous.");
	        perdreArgent(don);
	        beneficiaire.recevoir(don);
	    }
	    
	    public void provoquer(Yakuza adversaire) {
	        parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
	        int force = 2 * honneur;
	        
	        if (force >= adversaire.getReputation()) {
	            parler("Je t'ai eu petit yakuza!");
	            int gain = adversaire.perdre();
	            gagnerArgent(gain);
	            honneur++;
	        } else {
	            parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
	            adversaire.gagner(getArgent());
	            perdreArgent(getArgent());
	            honneur--;
	        }
	    }
	    
	
	}


