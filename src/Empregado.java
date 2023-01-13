public class Empregado {
	private String nome;
	private double salarioMensal;

	public Empregado(String nome, double salarioMensal){
		this.nome = nome;
		if (salarioMensal > 0){
			this.salarioMensal = salarioMensal;
		}
		else {
			this.salarioMensal = 0;
		}
	}

	public String getNome(){
		return nome;
	}

	public void setNome(String novoNome){
		nome = novoNome;
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
