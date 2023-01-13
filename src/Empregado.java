public class Empregado {
	private String primeiroNome;
	private String ultimoNome;
	private double salarioMensal;

	public Empregado(String primeiroNome, String ultimoNome,
					 double salarioMensal){
		this.primeiroNome = primeiroNome;
		this.ultimoNome = ultimoNome;
		if (salarioMensal > 0){
			this.salarioMensal = salarioMensal;
		}
		else {
			this.salarioMensal = 0;
		}
	}

	public String getPrimeiroNomeNome(){
		return primeiroNome;
	}

	public void setPrimeiroNomeNome(String novoNome){
		primeiroNome = novoNome;
	}

	public String getUltimoNome(){
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome){
		this.ultimoNome = ultimoNome;
	}

	public double getSalarioMensal(){
		return salarioMensal;
	}

	public void setSalarioMensal(double salarioMensal){
		if (salarioMensal > 0){
			this.salarioMensal = salarioMensal;
		}
	}
}
