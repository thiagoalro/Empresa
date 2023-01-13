public class Main {
	public static void main(String[] args) {
		Empregado empregado1 = new Empregado();
		Empregado empregado2 = new Empregado();

		empregado1.setNome("Alberto Silva");
		empregado1.setSalarioMensal(2500.45);

		empregado2.setNome("Bianca Sousa");
		empregado2.setSalarioMensal(2745.01);

		System.out.printf("Nome do primeiro funcionário: %s%n",
				empregado1.getNome());
		System.out.printf("Salário do primeiro funcionário: %.2f%n",
				empregado1.getSalarioMensal());
		System.out.printf("Ganhos anuais do primeiro funcionário: " +
				"%.2f%n", empregado1.getSalarioMensal() * 12);

		System.out.printf("Nome do segundo funcionário: %s%n",
				empregado2.getNome());
		System.out.printf("Salário do segundo funcionário: %.2f%n",
				empregado2.getSalarioMensal());
		System.out.printf("Ganhos anuais do segundo funcionário: " +
				"%.2f%n", empregado2.getSalarioMensal() * 12);


	}
}