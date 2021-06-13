package zaverecnapraces;

import java.util.ArrayList;

public class Film implements Comparable<Film> {
    private String Nadpis;
    private String Zanr;
    private String Kinosal;
    private ArrayList<String>  Herci;
    private String Cas;
    
    public Film(String t) {
    	this(t, "???", "","");
    }
    public Film() {
    	this("???", "???", "","");
    }
    public Film(String Nazev, String Zanry, String cislo,String sac) {
        Nadpis = Nazev;
        Zanr = Zanry;
        Kinosal = cislo;
        Cas = sac;
        Herci = new ArrayList<String>();
    }

    public String getCas() {
		return Cas;
	}
	public String getNadpis() { 
    	return Nadpis; 
    	}
 
    public String getZanr() { 
    	return Zanr; 
    	}
    public String getKinosal() { 
    	return Kinosal; 
    	}
    public ArrayList<String> getHerci() { 
    	return Herci;
    	}

	public void addHerec(String anHerec) {
		Herci.add(anHerec);
	}

    public String toString() { 
    	return "Film: " + Nadpis +"\n" +
               "Kinosal: " + Kinosal + "\n" +
    			"Cas: " + Cas + "\n" + 
    			"Zanr: " + Zanr + "\n" +
    			"Herci: " + Herci + "\n";
    			
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Film)) return false;
        return Nadpis.equals(((Film)obj).Nadpis);
    }

    public int hashCode() {
        return Nadpis.hashCode();
    }

    public int compareTo(Film m) {
        return Nadpis.compareTo(m.Nadpis);
    }

}