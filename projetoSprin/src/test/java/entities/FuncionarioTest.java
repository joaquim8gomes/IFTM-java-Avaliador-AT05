package entities;

import org.assertj.core.api.Assertions;

public class FuncionarioTest {
	@Test
	public void testarConstrutorAlunoComDadosValidosEAlunoAprovado() {
		//https://github.com/brunoqp78/exemplo_Aluno/commit/b5fedb345fb3ae8cd569da03e62a456e53e0c7ac#diff-5ebac3133f82da24703d1f2f54884ed6b6ab65b0e7997eb034e523689728470c
		//cenário de teste 03d - TDD Desenvolvimento
		//1.212,00
		//40horas trabalhadas
		
		String nomeValido = "Joaquim";
		int horasTrabalhadasValido = 50;
		double valorHoraValido = 10;

		Funcionario func; 

		//execução		
		func = new Funcionario(nomeValido, horasTrabalhadasValido, valorHoraValido);
		String nomeObtido = func.getNome();
		int horasTrabalhadasObtido = (int) func.getHorasTrabalhadas();
		double valorHoraObtido = func.getHorasTrabalhadas();

		//comparação
		Assertions.assertEquals(resultadoEsperado, resultadoObtido);
		Assertions.assertEquals(nomeValido, nomeObtido);
		Assertions.assertEquals(notaValida, notaObtida);
		Assertions.assertEquals(frequenciaValida, frequenciaObtida);


	}
}
