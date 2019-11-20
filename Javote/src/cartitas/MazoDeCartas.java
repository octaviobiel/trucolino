package cartitas;

import java.util.ArrayList;
import java.util.Collections;

public class MazoDeCartas {

	private static ArrayList<Cartita> mazo = new ArrayList<Cartita>();
	
	public ArrayList<Cartita> getMazo() {
		return mazo;
	}

	public void setMazo(ArrayList<Cartita> mazo) {
		MazoDeCartas.mazo = mazo;
	}

	public ArrayList<Cartita> crearMazo(Palos palo){
		
		for(int i=0; i<4; i++) {
			for(int j=1; j<13; j++){
				if(j!=8&&j!=9) {			
				mazo.add(new Cartita(palo.getNaipesEspanioles()[i], j));
				}
			}
		}
		return mazo;
	}
	
	public void mezclarMazo() {
		
		Collections.shuffle(mazo);
	}
	
	
	
	public static void main(String[] args) {
		
		
		
	}

}
