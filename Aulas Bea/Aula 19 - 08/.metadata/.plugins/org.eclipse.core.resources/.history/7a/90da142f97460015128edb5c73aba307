package cobaia;

import java.io.File;
import java.io.FileWriter;
import java.util.Date;

public class Gravar4 {
	public static void main(String [] args) throws Exception{
		File alunos = new File("alunos.csv");
		//Comma Separated Values
		//Valores Separados por vírgula
		//Ex:
		//11030211, Bea, Costa, 08/24/1999
		FileWriter writer = new FileWriter(alunos, true);
		
		Aluno a = new Aluno();
		a.setMatricula(11030211);
		a.setNome("Bea");
		a.setSobrenome("Costa");
		a.setDataNascimento(new Date("08/24/1999"));
		
		Aluno b = new Aluno();
		b.setMatricula(11030212);
		b.setNome("Sarah");
		b.setSobrenome("Black");
		b.setDataNascimento("25/03/1999");
		
		writer.append(b.toCSV() + "\n");
		writer.append(a.toCSV()+ "\n");
		writer.flush();
		writer.close();
		System.out.println("ok");
		
		
	}
}
