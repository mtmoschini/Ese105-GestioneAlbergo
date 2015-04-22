package gestionealbergo;

public class Cliente {
	
	private String cellulare;
	private String cognome;
	private String email;
	private String nome;
	private Prenotazione prenotazione;
	
	public Cliente(String cellulare, String cognome, String nome) {
		super();
		this.cellulare = cellulare;
		this.cognome = cognome;
		this.nome = nome;
	}

	public Prenotazione getPrenotazione(){
		return prenotazione;
	}
	
	public void setPrenotazione(Prenotazione prenotazione){
		this.prenotazione=prenotazione;
	}
	
	public String getCellulare() {
		return cellulare;
	}
	
	public void setCellulare(String cellulare) {
		this.cellulare = cellulare;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
