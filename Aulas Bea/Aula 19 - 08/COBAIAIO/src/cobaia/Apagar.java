package cobaia;

import java.io.File;

public class Apagar {

	public static void main(String[] args) throws Exception{
		File arq = new File("professores/1801026.csv"); //id
		if(arq.exists()){
			arq.delete();
			System.out.println("Arquivo apagado");
		}else{
			System.out.println("Arquivo não existe");
		}
		
	}

}

