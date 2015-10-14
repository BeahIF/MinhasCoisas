package cobaia;

import java.io.*;

public class Gravar2 {
	
	public static void main (String [] args) throws FileNotFoundException{
		File arquivo = new File ("arquivo.txt");
		PrintStream out = new PrintStream (arquivo);
		out.println("arquivo com caminho relativo");
		
		out.flush();
		out.close();
		
		System.out.println("ok");
	}
}
