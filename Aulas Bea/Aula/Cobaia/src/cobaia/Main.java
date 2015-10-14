package cobaia;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[]args){
		
		String texto = JOptionPane.showInputDialog("Digite um numero:");
		//M�todo lan�a uma NumberFormatException
		//TRATAR a exce��o!
		// try / catch(tentar/ capturar)
		int numero = 0;
		
		try{ //ABRA�A A INSTRU��O QUE PODE LAN�AR EXCE��O
			texto = texto.trim();
			 numero = Integer.parseInt(texto);
		} catch (NumberFormatException e){
			JOptionPane.showMessageDialog(null,
				"Numero Invalido",
				"Erro!",
				JOptionPane.ERROR_MESSAGE);
		} catch (NullPointerException e){
		JOptionPane.showMessageDialog(null,
			"Nao ha numero!",
			"Erro!",
			JOptionPane.ERROR_MESSAGE);
		}
		
		System.out.println(numero == 0);
	}
}
		
		
