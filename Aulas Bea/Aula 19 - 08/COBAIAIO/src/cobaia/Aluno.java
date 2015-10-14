
	package cobaia;

	import java.text.DateFormat;
	import java.text.ParseException;
	import java.text.SimpleDateFormat;
	import java.util.Date;

	public class Aluno extends Model{
		
		private String nome;
		private String sobrenome;
		private Date dataNascimento;
		
		private DateFormat dateFormat = DateFormat.getDateInstance(); 
		
		public String getNome() {
			return nome;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public String getSobrenome() {
			return sobrenome;
		}
		
		public void setSobrenome(String sobrenome) {
			this.sobrenome = sobrenome;
		}
		
		public void setMatricula(int matricula) {
			this.id = matricula;
		}
		
		public Date getDataNascimento() {
			return dataNascimento;
		}
		
		public int getMatricula(){
			return this.id;
		}
		
		public void setDataNascimento(Date dataNascimento) {
			this.dataNascimento = dataNascimento;
		}
			
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + id;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Aluno other = (Aluno) obj;
			if (id != other.id)
				return false;
			return true;
		}
		
		@Override
		public String toString() {
			return "Aluno [nome=" + nome + ", sobrenome=" + sobrenome
					+ ", matricula=" + id + ", dataNascimento="
					+ dataNascimento + "]";
		}
		
		public void fromCSV(String row){
			// 11030211;Bea;Costa;24/08/1999
			String [] columns = row.split(";");
			this.setMatricula(Integer.parseInt(columns[0]));
			this.setNome(columns[1]);
			this.setSobrenome(columns[2]);
			this.setDataNascimento(columns[3]);
		}
		
		public String toCSV(){
			StringBuilder builder = new StringBuilder();
			builder.append(id);
			builder.append(";");
			builder.append(nome);
			builder.append(";");
			builder.append(sobrenome);
			builder.append(";");
			builder.append(dateFormat.format(dataNascimento));
			return builder.toString();
		}
		
		public void setDataNascimento(String data){
			try {
				dataNascimento = dateFormat.parse(data);
			} catch (ParseException e) {
				System.err.println("A data" + data + "eh invalida");
			}
		}
		
	}

