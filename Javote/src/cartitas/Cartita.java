package cartitas;

public class Cartita {

	private String palo;
	private int numero;
	
	public Cartita(String palin, int num) {
		this.palo = palin;
		this.numero = num;
	}
	
	/*public Cartita() {
		
	}*/
	
	public String getPalo() {
		return palo;
	}
	public void setPalo(String palo) {
		this.palo = palo;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}
