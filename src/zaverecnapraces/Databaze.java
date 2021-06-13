package zaverecnapraces;

import java.util.*;

public class Databaze {
	private HashMap<String,Film> FilmList;
	private HashMap<String,ArrayList<Film>> HerecList;
	private HashMap<String,ArrayList<Film>> ZanrList;
	private HashMap<String,ArrayList<Film>> Kinosal;

	public Databaze() {
        FilmList = new HashMap<String,Film>();
        HerecList = new HashMap<String,ArrayList<Film>>();
        ZanrList  = new HashMap<String,ArrayList<Film>>();
        Kinosal  = new HashMap<String,ArrayList<Film>>();
	}

	public HashMap<String,Film> getFilmList() { 
		return FilmList; 
		}
	public HashMap<String, ArrayList<Film>> getKinosal() { 
		return Kinosal; 
		}
	public HashMap<String,ArrayList<Film>> getHerecList() { 
		return HerecList; 
		}
	public HashMap<String,ArrayList<Film>> getZanrList() {
    return ZanrList;
   }

	public String toString() {
        return ("Seznam Filmu v Databazi(" + FilmList.size()+ "):");
	}

	public void addFilm(Film Filmos) {

	    FilmList.put(Filmos.getNadpis(), Filmos);

	
	    if (!ZanrList.containsKey(Filmos.getZanr()))
	       ZanrList.put(Filmos.getZanr(), new ArrayList<Film>());


	    ZanrList.get(Filmos.getZanr()).add(Filmos);

	    if (!Kinosal.containsKey(Filmos.getKinosal()))
	    	Kinosal.put(Filmos.getKinosal(), new ArrayList<Film>());


		    Kinosal.get(Filmos.getKinosal()).add(Filmos);

		
	    for (String Herec: Filmos.getHerci()) {

	      	if (!HerecList.containsKey(Herec))
	            HerecList.put(Herec, new ArrayList<Film>());
	        HerecList.get(Herec).add(Filmos);
	    }
	}

	public void KinosalList(String cislo) {
		System.out.println("V Kinosale cislo " + cislo + " se nyni promitaji tyto filmy:");
		try {
	    for (Film x: Kinosal.get(cislo))
	        System.out.println(x);
		}catch(Exception e) {
			System.out.println("Zadne Filmy");
		}
	}
	public void listFilm() {
	    for (String a: FilmList.keySet())
	        System.out.println(a);
	}

	public void listHerec(String Herec) {
		try {
	    for (Film b: HerecList.get(Herec))
	         System.out.println(b);
		}catch(Exception e) {
			System.out.println("Herec neni v databazi");
		}
	}

	public void listZanr(String Zanr) {
		try {
	    for (Film c: ZanrList.get(Zanr))
	        System.out.println(c);
		}catch(Exception e) {
			System.out.println("Zanr neni v databazi");
		}
	}
}