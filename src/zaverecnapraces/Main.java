package zaverecnapraces;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Databaze db = new Databaze();
		
		
        //Priklad:              //Nadpis Filmu:    //Zanr Filmu:   //Cislo Kinosalu:
		Film priklad = new Film("Harry Potter",  "Komedie",      "5",     "12:30");
		Film f2 = new Film("Demon Slayer", "Anime", "5" , "14:00");
		//Funkce pro pridavani hercu do daneho filmu:
		priklad.addHerec("Michael Jackson");
		priklad.addHerec("Lana Rhoades");
		f2.addHerec("Tanjiro");
		f2.addHerec("Nezuko");
		f2.addHerec("Michael Jackson");
		//Pridani filmu do databaze
	    db.addFilm(priklad);
	    db.addFilm(f2);
		//Vypis
		System.out.println(db);
		db.listFilm();
		System.out.println();
		
		//Do uvozovek zadate c.kinosalu a funkce vam vypise filmy ktery se nyni
		//promitaji v danym kinosale:
		db.KinosalList("5");
		
		System.out.println("Filmy s Michael Jacksonem");
		db.listHerec("Michael Jackson");
		System.out.println();
	


	}
}