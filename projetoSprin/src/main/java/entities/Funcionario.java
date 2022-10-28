package entities;

public class Funcionario{
	private String nome;
	private int horasTrabalhadas;
	private double valorHora;
	
	public Funcionario(String nome, int horasTrabalhadas, double valorHora) {
		super();
		this.nome = nome;
		if (horasTrabalhadas > 40) {
			throw new IllegalArgumentException("O número de horas trabalhadas por funcionários próprios deve ser menor ou igual a 40.");
			}
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHora = valorHora;
	}

	public double calcularPagamento(){
		double salario = horasTrabalhadas*valorHora*4;
		if (salario < 1212) {
			throw new IllegalArgumentException("Salario Invalido");
			}
		return salario;  
	}
	
	public void setHorasTrabalhadas(int horasTrabalhadas) {
		if (horasTrabalhadas > 40) {
		throw new IllegalArgumentException("O número de horas trabalhadas por funcionários próprios deve ser menor ou igual a 40.");
		}
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	


}

