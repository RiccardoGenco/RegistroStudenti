package Main;



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

	

	class Studente 
	{
		  String nome;
		  String cognome;
		  String matricola;          // dichiarazione variabili

		  
		    public Studente(String nome, String cognome, String matricola)    //costruttore della classe
		    {    // Costruttore
		        this.nome = nome;
		        this.cognome = cognome;
		        this.matricola = matricola;
		    }

		  
		    public String getNome() 
		    {                     // getter nome
		        return nome;
		    }

		    public String getCognome() 
		    { 						// getter cognome
		        return cognome;
		    }

		    public String getMatricola() 
		    {						// getter matricola
		        return matricola;
		    }

		    @Override
		    public String toString()            // Override del metodo toString per una rappresentazione leggibile dello studente
		    {
		        return "Matricola: " + matricola + ", Nome: " + nome + ", Cognome: " + cognome;
		    }
	}
