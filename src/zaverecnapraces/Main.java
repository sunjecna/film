package zaverecnapraces;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		
		Databaze db = new Databaze();
		
        //Priklad:              //Nadpis Filmu:    //Zanr Filmu:   //Cislo Kinosalu:  //Cas
		Film priklad = new Film("Harry Potter", "Komedie",      "5",                 "12:30");
		
		//Ostatni filmy
		Film f3 = new Film("Spongebob", "Komedie", "6", "13:00");
		Film f2 = new Film("Demon Slayer", "Anime", "5" , "14:00");
		//Funkce pro pridavani hercu do daneho filmu:
		priklad.addHerec("Michael Jackson");
		priklad.addHerec("Billie Eilish");
		//f2
		f2.addHerec("Tanjiro");
		f2.addHerec("Nezuko");
		//f3
		f3.addHerec("Spongebob");
		f3.addHerec("Patrik");
	    db.addFilm(f3);
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
		
		System.out.println("Herec hral ve filmech:");
		//Funkce ktera umoznuje vyhledat Filmy ve kterych hrali herci
		db.listHerec("Michael Jackson");
		System.out.println();
	
		System.out.println("Filmy se stejnym zanrem:");
		//Funkce ktera umoznuje vyhledat Filmy se stejnym zanrem
		db.listZanr("Komedie");
		System.out.println();
	

	}
}