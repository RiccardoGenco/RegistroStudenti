package Main;
import java.util.ArrayList;
import java.util.Scanner;


	public class Registro 
	{
	    
	    private ArrayList<Studente> registro; // Lista degli studenti
	    
	    public Registro()   
	    {
	        this.registro = new ArrayList<>(); //creaione arraylist per memorizzare gli studenti
	    }
	    
	    public void aggiungiStudente(String nome, String cognome, String matricola) {    //metodo per aggiungere uno studente insesendone i dati
	        for (Studente i : registro) { // Controlla se la matricola è già presente
	            if (i.getMatricola().equals(matricola)) {
	                System.out.println("Errore: matricola già esistente.");
	                return;
	            }
	        }
	        
	        registro.add(new Studente(nome, cognome, matricola));
	        System.out.println("Studente aggiunto con successo.");
	    }
	    
	    public void visualizzaStudenti() 
	    {
	        if (registro.isEmpty()) 
	        {
	            System.out.println("Nessuno studente registrato.");
	        } else 
	        {
	            System.out.println("\n--- Elenco Studenti ---");
	            for (Studente i : registro) 
	            {
	                System.out.println(i);
	            }
	        }
	    }
	    
	    public void cercaStudente(String matricola) 
	    {
	        for (Studente i : registro) 
	        {
	            if (i.getMatricola().equals(matricola)) 
	            {
	                System.out.println("Studente trovato: " + i);
	                return;
	            }
	        }
	        System.out.println("Matricola ancora libera.");
	    }
	}

