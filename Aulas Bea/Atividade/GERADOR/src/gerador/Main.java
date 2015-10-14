package gerador;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.ImageIO;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedImage imagem = ImageIO.read(new File("download.jpg"));	
		//BufferedImage bufferedImage = new BufferedImage(200, 200, imagem);  
		
		Graphics b = imagem.createGraphics();  
		
		b.setColor(Color.WHITE);  
        b.setFont(new Font("Arial ", Font.PLAIN, 20));    
        b.drawString("MEU DEUS", 10, 50); 
		b.setColor(Color.WHITE);  
        b.setFont(new Font("Arial ", Font.PLAIN, 20));    
        b.drawString("ME SOLTA", 30, 100); 
        b.setColor(Color.WHITE);  
        b.setFont(new Font("Arial ", Font.PLAIN, 10));    
        b.drawString("UM LIVRO NOVO, PRECISO COMPRAR", 0, 200); 
        
        
        
        
        
        ImageIO.write(imagem, "jpg", new File("mme.jpg"));
        
        

	}

}
