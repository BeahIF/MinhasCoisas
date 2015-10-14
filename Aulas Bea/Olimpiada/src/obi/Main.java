package obi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//entrada: 43 23 87 23 12 \n
		// saida: 87\n
		
		Scanner scan = new Scanner(System.in);
		int max = 0;
	/*	scan.useDelimiter(" ");
		while(scan.hasNextInt()){
			int num =  scan.nextInt();
			if(num > max){
				max = num;
			}
		}
			System.out.println(max);
		}*/
		String linha = scan.nextLine();
		String[] vetor = linha.split(" ");
		for(int i = 0; i < vetor.length; i++){
			int num = Integer.parseInt(vetor[i]);
			if(num > max) max =  num;
		}
		System.out.println(max);
	}
}



