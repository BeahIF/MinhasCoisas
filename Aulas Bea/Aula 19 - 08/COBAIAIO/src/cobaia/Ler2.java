package cobaia;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ler2 {
	public static void main(String [] args) throws Exception{
		File alunos =  new File ("alunos.csv");
		Scanner scan = new Scanner(alunos);
		ArrayList<Aluno> lista = new ArrayList();
		while(scan.hasNextLine()) {
			String row = scan.nextLine();
			Aluno a = new Aluno();
			a.fromCSV(row);
			System.out.println(a);
			lista.add(a);
		}
		System.out.println(lista);
		scan.close();
	}
}
