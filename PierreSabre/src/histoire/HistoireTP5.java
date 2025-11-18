package histoire;

public class HistoireTP5 {

	    public static void main(String[] args) {
	        // Test partie 1 - Mémoire des humains
	        System.out.println("=== Test partie 1 ===");
	        Commercant marco = new Commercant("Marco", 20);
	        Commercant chonin = new Commercant("Chonin", 40);
	        Commercant kumi = new Commercant("Kumi", 10);
	        Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
	        Ronin roro = new Ronin("Roro", "shochu", 60);
	        
	        marco.faireConnaissanceAvec(roro);
	        marco.faireConnaissanceAvec(yaku);
	        marco.faireConnaissanceAvec(chonin);
	        marco.faireConnaissanceAvec(kumi);
	        
	        marco.listerConnaissance();
	        roro.listerConnaissance();
	        yaku.listerConnaissance();

	     
	        System.out.println("\n=== Test partie 2 ===");
	        yaku.direBonjour();

	  
	        System.out.println("\n=== Test partie 3 ===");
	        Samourai akimoto = new Samourai("Miyamoto", "Akimoto", "saké", 80);
	        akimoto.direBonjour();
	        akimoto.boire("thé");

	   
	        System.out.println("\n=== Test partie 4 ===");
	        Traitre masako = new Traitre("Miyamoto", "Masako", "whisky", 100);
	        masako.faireLeGentil();
	        masako.ranconner(kumi);
	        masako.ranconner(chonin);
	        masako.ranconner(marco);
	        masako.direBonjour();

	   
	        System.out.println("\n=== Test partie 5 ===");
	        GrandMere grandMere = new GrandMere("Grand-Mère", 10);
	        grandMere.faireConnaissanceAvec(akimoto);
	        grandMere.faireConnaissanceAvec(yaku);
	        grandMere.faireConnaissanceAvec(masako);
	        grandMere.faireConnaissanceAvec(kumi);
	        grandMere.faireConnaissanceAvec(marco);
	        grandMere.faireConnaissanceAvec(chonin);
	        grandMere.ragoter();
	    }
	}



}

