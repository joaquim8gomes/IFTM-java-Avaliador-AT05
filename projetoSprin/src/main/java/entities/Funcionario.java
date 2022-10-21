package entities;

public class Funcionario{
	private double horasTrabalhadas;
	private double valorHora;
	
	public double calcularPagamento(){
		return horasTrabalhadas*valorHora*4;  
	}
	
}

