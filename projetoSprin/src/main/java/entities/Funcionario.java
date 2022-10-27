package entities;

public class Funcionario{
	private String nome;
	private double horasTrabalhadas;
	private double valorHora;
	
	public double calcularPagamento(){
		return horasTrabalhadas*valorHora*4;  
	}
	
}

