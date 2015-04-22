package gestionealbergo;

import java.time.LocalDateTime;

public class Prenotazione {
	
	private LocalDateTime arrivoIl;
	private LocalDateTime clienteArrivaIl;
	private LocalDateTime effettuataIl;
	private String richieste;
	private int nuomeroNotti;
	private Cliente cliente;
	private Camera camera;
	
	public LocalDateTime getArrivoIl() {
		return arrivoIl;
	}
	
	public void setArrivoIl(LocalDateTime arrivoIl) {
		this.arrivoIl = arrivoIl;
	}
	
	public LocalDateTime getClienteArrivaIl() {
		return clienteArrivaIl;
	}
	
	public void setClienteArrivaIl(LocalDateTime clienteArrivaIl) {
		this.clienteArrivaIl = clienteArrivaIl;
	}
	
	public LocalDateTime getEffettuataIl() {
		return effettuataIl;
	}
	
	public void setEffettuataIl(LocalDateTime effettuataIl) {
		this.effettuataIl = effettuataIl;
	}
	
	public String getRichieste() {
		return richieste;
	}
	
	public void setRichieste(String richieste) {
		this.richieste = richieste;
	}
	
	public int getNuomeroNotti() {
		return nuomeroNotti;
	}
	
	public void setNuomeroNotti(int nuomeroNotti) {
		this.nuomeroNotti = nuomeroNotti;
	}
	
	public Cliente getCliente(){
		return cliente;
	}
	
	public void setCliente(Cliente cliente){
		this.cliente=cliente;
	}
	
	public Camera getCamera(){
		return camera;
	}
	
	

}
