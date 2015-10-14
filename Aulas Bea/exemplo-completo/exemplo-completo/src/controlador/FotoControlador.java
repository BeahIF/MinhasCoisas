package controlador;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.UUID;

import javax.servlet.*;
import javax.servlet.http.Part;

import spark.Request;
import spark.Response;
import spark.Route;

public class FotoControlador implements Route{

	@Override
	public Object handle(Request req, Response resp) throws Exception {
		MultipartConfigElement multipart = new MultipartConfigElement("/temp");
		req.raw().setAttribute("org.eclipse.multipartConfig", multipart);
		Part file = req.raw().getPart("foto");
		
		if(file.getContentType().equals("image/jpeg")){
			//salvar
			//Universally Unique Identificattion
			String id = UUID.randomUUID().toString();
			InputStream input = file.getInputStream();
			System.out.println(id);
			FileOutputStream output = new FileOutputStream("bin/pub/" + id + ".jpg");
			int b = 0;
			while((b = input.read()) >=0){
				output.write(b);
			}
			input.close();
			
			output.close();
			return "Foto enviada com sucesso";
		} 
		
		return "Deve ser enviada uma imagem jpeg";
	

}
}