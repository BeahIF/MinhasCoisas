package obi;

import java.util.*;

public class decifra {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[] alfabeto = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 
				't', 'u', 'v', 'x', 'y', 'z'};
		char[] tabela = scan.nextLine().toCharArray();
		String frase = scan.nextLine();
		char[] auxiliar = new char[frase.length()];
		String auxiliar2 =  new String();
		
		for(int c = 0; c < frase.length(); c++){
			for(int a = 0; a < tabela.length; a++){
				if(frase.charAt(c) == (tabela[a])){
					auxiliar[c] = alfabeto[a];
					//System.out.print(auxiliar[c]);
				}
			}
		}
		for(int b = 0; b < frase.length(); b++){
			auxiliar2  = auxiliar2 + auxiliar[b];
		}
		System.out.println(auxiliar2);
	}
}
//zcbedfghljkinmypqrutsvwxoa
//bzedzeymziluz

//iohmunlcawygdfbqpvxzerjskt
//haufhaimihbdqezihib