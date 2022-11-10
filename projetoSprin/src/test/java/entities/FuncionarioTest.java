package entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FuncionarioTest {
	@Test
	public void testarConstrutorComEntradasValidas() {
		//https://github.com/brunoqp78/exemplo_Aluno/commit/b5fedb345fb3ae8cd569da03e62a456e53e0c7ac#diff-5ebac3133f82da24703d1f2f54884ed6b6ab65b0e7997eb034e523689728470c
		//cenário de teste 03d - TDD Desenvolvimento
		//1.212,00
		//40horas trabalhadas
		
		String nomeValido = "Joaquim";
		int horasTrabalhadasValido = 30;
		double valorHoraValido = 60;
		
		double salarioEsperadoValido = 7200;

		Funcionario func; 

		//execução		
		func = new Funcionario(nomeValido, horasTrabalhadasValido, valorHoraValido);
		String nomeObtido = func.getNome();
		int horasTrabalhadasObtido = (int) func.getHorasTrabalhadas();
		double valorHoraObtido = func.getValorHora();
		double salarioObtido = func.calcularPagamento();

		//comparação
		Assertions.assertEquals(nomeValido, nomeObtido);
		Assertions.assertEquals(horasTrabalhadasValido, horasTrabalhadasObtido);
		Assertions.assertEquals(valorHoraValido, valorHoraObtido);
		Assertions.assertEquals(salarioEsperadoValido, salarioObtido);
	}
	
	
	@Test
	public void testarConstrutorComPagamentoInvalido() {
		
		String nomeValido = "Joaquim";
		int horasTrabalhadasValido = 3;
		double valorHoraValido = 60;
		
		double salarioEsperadoValido = 720;

		Funcionario func; 

		//execução		
		func = new Funcionario(nomeValido, horasTrabalhadasValido, valorHoraValido);
		

		//comparação
		Assertions.assertThrows(IllegalArgumentException.class, ()->{double salarioObtido = func.calcularPagamento();});
	}
	
	@Test
	public void testarConstrutorComEntradaHoraValorInvalida() {
		
		String nomeValido = "Joaquim";
		int horasTrabalhadasValido = 50;
		double valorHoraValido = 60;
		
		double salarioEsperadoValido = 12000;


		Assertions.assertThrows(IllegalArgumentException.class, ()->{Funcionario func = new Funcionario(nomeValido, horasTrabalhadasValido, valorHoraValido);});

	}
	
	@Test
	public void testarConstrutorComEntradaHoraInvalida() {
		
		String nomeValido = "Joaquim";
		int horasTrabalhadasValido = 60;
		double valorHoraValido = 60;
		
		double salarioEsperadoValido = 12000;


		Assertions.assertThrows(IllegalArgumentException.class, ()->{Funcionario func = new Funcionario(nomeValido, horasTrabalhadasValido, valorHoraValido);});

	}
	
	@Test
	public void testarConstrutorComHoraPagamentoInvalida() {
		
		String nomeValido = "Joaquim";
		int horasTrabalhadasValido = 50;
		double valorHoraValido = 600;
		
		double salarioEsperadoValido = 12000;


		Assertions.assertThrows(IllegalArgumentException.class, ()->{Funcionario func = new Funcionario(nomeValido, horasTrabalhadasValido, valorHoraValido);});

	}
	
	@Test
	public void testarConstrutorHorasEntradasValidas() {
		
		String nomeValido = "Joaquim";
		int horasTrabalhadasValido = 30;
		double valorHoraValido = 60;

		Funcionario func; 

		//execução		
		func = new Funcionario(nomeValido, horasTrabalhadasValido, valorHoraValido);

		int horasTrabalhadasObtido = (int) func.getHorasTrabalhadas();


		//comparação
		Assertions.assertEquals(horasTrabalhadasValido, horasTrabalhadasObtido);
	}
	
	@Test
	public void testarConstrutorValorHoraValida() {
		
		String nomeValido = "Joaquim";
		int horasTrabalhadasValido = 30;
		double valorHoraValido = 60;
		
		double salarioEsperadoValido = 7200;

		Funcionario func; 

		//execução		
		func = new Funcionario(nomeValido, horasTrabalhadasValido, valorHoraValido);
		String nomeObtido = func.getNome();
		int horasTrabalhadasObtido = (int) func.getHorasTrabalhadas();
		double valorHoraObtido = func.getValorHora();
		double salarioObtido = func.calcularPagamento();

		//comparaçã
		Assertions.assertEquals(valorHoraValido, valorHoraObtido);
	}
	
	
	
}
