package cobaia;

import java.io.File;
import java.io.FileWriter;

public class Gravar3 {

	public static void main(String[] args) throws Exception {
		//banco.csv
		File banco = new File("banco.csv");
		FileWriter writer = new FileWriter(banco, true);
		writer.append("Laura D\n");
		writer.append("Laura G\n");
		writer.close();
		
		System.out.println("ok");
	}

}