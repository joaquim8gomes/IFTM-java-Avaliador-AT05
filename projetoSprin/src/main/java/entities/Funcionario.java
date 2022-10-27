package entities;

public class Funcionario{
	private String nome;
	private double horasTrabalhadas;
	private double valorHora;
	
	public double calcularPagamento(){
		return horasTrabalhadas*valorHora*4;  
	}
	
	public void setHorasTrabalhadas(int horasTrabalhadas) {
		if (horasTrabalhadas > 40) {
		throw new IllegalArgumentException("O número de horas trabalhadas por funcionários próprios deve ser menor ou igual a 40.");
		}
		this.horasTrabalhadas = horasTrabalhadas;
	}
}

