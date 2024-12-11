package Main;

import java.util.Scanner;

public class Main 									   //Classe principale main che gestisc il registro
{     										     
	 public static Scanner scanner = new Scanner(System.in);
	    public static Registro registro = new Registro(); // Creazione dell'oggetto Registro

	    public static void main(String[] args) 
	    {
	        
	        
	        registro.aggiungiStudente("Carlo", "Marzo", "1818");   // Aggiungi tanti studenti simpatici
	        registro.aggiungiStudente("Giulia", "Cesara", "476");
	        registro.aggiungiStudente("Philip", "Dick", "1928");
	        registro.aggiungiStudente("Giorgio", "Orvello", "1984");

	        int scelta;
	        do 
	        {
	            System.out.println("\n--- Menu Registro Studenti ---");
	            
	            System.out.println("1. Registra un nuovo studente");
	            
	            System.out.println("2. Visualizzare elenco studenti");
	            
	            System.out.println("3. Cercare studente per matricola");
	            
	            System.out.println("4. Chiudi il programma");
	            
	            System.out.print("Seleziona un'opzione: ");
	            
	            scelta = scanner.nextInt();
	            scanner.nextLine(); // Consuma la nuova linea

	            switch (scelta) 
	            {
	                case 1:
	                    aggiungiStudente();
	                    break;
	                case 2:
	                    registro.visualizzaStudenti();
	                    break;
	                case 3:
	                    cercaStudente();
	                    break;
	                case 4:
	                    System.out.println("Arrivederci.");
	                    break;
	                default:
	                    System.out.println("Opzione non valida. Riprova.");
	            }
	        } while (scelta != 4);
	    }

	    public static void aggiungiStudente() 
	    {
	        System.out.print("Inserisci il nome dello studente: ");
	        String nome = scanner.nextLine();
	        System.out.print("Inserisci il cognome dello studente: ");
	        String cognome = scanner.nextLine();
	        System.out.print("Inserisci la matricola dello studente: ");
	        String matricola = scanner.nextLine();
	        
	        registro.aggiungiStudente(nome, cognome, matricola);
	    }

	    public static void cercaStudente() 
	    {
	        System.out.print("Inserisci la matricola dello studente da cercare: ");
	        String matricola = scanner.nextLine();
	        
	        registro.cercaStudente(matricola);
	    }
	}


/* Gestione di un Registro di Studenti
Creare un programma Java che consenta di gestire un registro degli studenti. Il programma deve:

Registrare nuovi studenti con:
Nome,
Cognome,
Matricola (univoca).
Visualizzare l'elenco degli studenti.
Cercare uno studente tramite la matricola.
Requisiti Tecnici:
Creare una classe Studente con i campi necessari.
Utilizzare un ArrayList per memorizzare gli studenti.
Creare un menu testuale che permetta all'utente di:

Aggiungere uno studente.
Visualizzare tutti gli studenti.
Cercare uno studente per matricola.
Uscire dal programma */
