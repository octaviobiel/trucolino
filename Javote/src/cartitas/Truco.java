package cartitas;

import java.util.ArrayList;
import java.util.Scanner;

public class Truco {

	private static MazoDeCartas mazo = new MazoDeCartas();
	private static Palos palines = new Palos();
	
			
	public static void repartirMano(Jugador j1, Jugador j2) {
		mazo.mezclarMazo();
		int contador = 0;
		for(int i=0; i<6; i++) {
			j1.agregarCarta(mazo.getMazo().get(i));
			j2.agregarCarta(mazo.getMazo().get(++i));
		}
		
	}
	
	public void envido(Jugador j) {
		String palo1 = j.getMano().get(0).getPalo();
		String palo2 = j.getMano().get(1).getPalo();
		String palo3 = j.getMano().get(2).getPalo();
		
		int tanto;
		
		if(palo1.equals(palo2)) {
			tanto = verificarTantoEnvido(j.getMano().get(0),j.getMano().get(1));
		} else if (palo2.equals(palo3)) {
			tanto = verificarTantoEnvido(j.getMano().get(1),j.getMano().get(2));
		} else if (palo1.contentEquals(palo3)) {
			tanto = verificarTantoEnvido(j.getMano().get(0),j.getMano().get(2));
		} else { tanto = verificarCartaMasAlta(j.getMano().get(0),j.getMano().get(1),j.getMano().get(2));
			
		}
		System.out.println("Tengo "+tanto+" de tanto");
	}
	
	public int verificarTantoEnvido(Cartita carta1, Cartita carta2) {
		int valor1 = carta1.getNumero();
		int valor2 = carta2.getNumero();
		
		if(valor1 == 10 || valor1 == 11 || valor1 == 12) {
			valor1=0;
		}
		if(valor2 == 10 || valor2 == 11 || valor2 == 12) {
			valor2=0;
		}
		return 20 + valor1 + valor2 ;
	}
	
	public int verificarCartaMasAlta(Cartita carta1, Cartita carta2, Cartita carta3) {
		int num1 = carta1.getNumero();
		int num2 = carta2.getNumero();
		int num3 = carta3.getNumero();
		
		if(num1>num2 && num1>num3) {
			return num1;
		} else if(num2>num1 && num2>num3) {
			return num2;
		} else return num3;
		
	}
	
	public static void main(String[] args) {
		Jugador j1 = new Jugador();
		Jugador j2 = new Jugador();
		
		mazo.crearMazo(palines);
		repartirMano(j1, j2);
		j1.verMano(3);
		j2.verMano(3);
	}

}
