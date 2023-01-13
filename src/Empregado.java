public class Empregado {
	private String nome;
	private double salarioMensal;

	public Empregado(String nome, double salarioMensal){
		this.nome = nome;
		this.salarioMensal = salarioMensal;
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
		this.salarioMensal = salarioMensal;
	}
}
