package cartitas;

import java.util.ArrayList;
import java.util.Collections;

public class MazoDeCartas {

	private static ArrayList<Cartita> mazo = new ArrayList<Cartita>();
	private static Palos palitos;
	
	
	public static ArrayList<Cartita> getMazo() {
		return mazo;
	}

	public static void setMazo(ArrayList<Cartita> mazo) {
		MazoDeCartas.mazo = mazo;
	}

	public static Palos getPalitos() {
		return palitos;
	}

	public static void setPalitos(Palos palitos) {
		MazoDeCartas.palitos = palitos;
	}

	public static void crearMazo(ArrayList<Cartita> mazo){
		
		
		for(int i=0; i<4; i++) {
			for(int j=1; j<13; j++){
				if(j!=8&&j!=9) {
				mazo.add(new Cartita(palitos.getNaipesEspanioles()[i], j));
				}
			}
		}
	}
	
	public static void mezclarMazo(ArrayList<Cartita> mazo) {
		
		Collections.shuffle(mazo);
	}
	
	
	public static void main(String[] args) {
		crearMazo(mazo);
		mezclarMazo(mazo);

		for(int i=0; i<40; i++) {
			System.out.println(mazo.get(i).getPalo()+" "+mazo.get(i).getNumero());
		}
		
	}

}
