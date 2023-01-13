public class Main {
	public static void main(String[] args) {
		Empregado empregado1 = new Empregado("Alberto",
				"Silva",
				2500.45);
		Empregado empregado2 = new Empregado("Bianca",
				"Sousa",
				2745.01);

		System.out.printf("Nome do primeiro funcionário: %s %s%n",
				empregado1.getPrimeiroNome(), empregado1.getUltimoNome());
		System.out.printf("Salário do primeiro funcionário: %.2f%n",
				empregado1.getSalarioMensal());
		System.out.printf("Ganhos anuais do primeiro funcionário: " +
				"%.2f%n", empregado1.getSalarioMensal() * 12);

		System.out.printf("Nome do segundo funcionário: %s %s%n",
				empregado2.getPrimeiroNome(), empregado2.getUltimoNome());
		System.out.printf("Salário do segundo funcionário: %.2f%n",
				empregado2.getSalarioMensal());
		System.out.printf("Ganhos anuais do segundo funcionário: " +
				"%.2f%n", empregado2.getSalarioMensal() * 12);

		System.out.println("\n********** Depois do aumento de 10% *****************\n");

		empregado1.setSalarioMensal(empregado1.getSalarioMensal() * 1.1);
		System.out.printf("Nome do primeiro funcionário: %s %s%n",
				empregado1.getPrimeiroNome(), empregado1.getUltimoNome());
		System.out.printf("Salário do primeiro funcionário: %.2f%n",
				empregado1.getSalarioMensal());
		System.out.printf("Ganhos anuais do primeiro funcionário: " +
				"%.2f%n", empregado1.getSalarioMensal() * 12);

		empregado2.setSalarioMensal(empregado2.getSalarioMensal() * 1.1);
		System.out.printf("Nome do segundo funcionário: %s %s%n",
				empregado2.getPrimeiroNome(), empregado2.getUltimoNome());
		System.out.printf("Salário do segundo funcionário: %.2f%n",
				empregado2.getSalarioMensal());
		System.out.printf("Ganhos anuais do segundo funcionário: " +
				"%.2f%n", empregado2.getSalarioMensal() * 12);
	}
}