package cobaia;

//classe gen�rica (abstrata)
//classe abstrata : serve como pai para outras classes
public abstract class Model {
	protected int id;
//PROTECTED : torba o id acess�vel para as classes filhas

	
//m�todos concretos (com miolo)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	//m�todos abstratos
	public abstract String toCSV();
	
	public abstract void fromCSV(String row);
		
	
}