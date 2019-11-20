package cartitas;

import java.util.ArrayList;

public class Jugador {

	private ArrayList<Cartita> mano = new ArrayList<Cartita>();

	public ArrayList<Cartita> getMano() {
		return mano;
	}

	public void setMano(ArrayList<Cartita> mano) {
		this.mano = mano;
	}
	
	public void agregarCarta(Cartita carta) {
		this.mano.add(carta);
	}
	
	public void verMano(int cartas) {
		for(int i=0; i<cartas; i++) {
			System.out.println("Tenes el "+mano.get(i).getNumero()+" de "+mano.get(i).getPalo());
		}
	}
	
	
}
