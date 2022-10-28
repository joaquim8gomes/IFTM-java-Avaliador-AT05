package entities;

public class FuncionarioTest {
	@Test
	public void testarConstrutorAlunoComDadosValidosEAlunoAprovado() {
		//cenário de teste
		String nomeValido = "Joaquim";
		double notaValida = 8.9;
		int frequenciaValida = 77;
		boolean resultadoEsperado = true;
		Aluno a; 

		//execução		
		a = new Aluno(nomeValido, notaValida, frequenciaValida);
		boolean resultadoObtido = a.estaAprovado();
		String nomeObtido = a.getNome();
		double notaObtida = a.getNota();
		int frequenciaObtida = a.getFrequencia();

		//comparação
		Assertions.assertEquals(resultadoEsperado, resultadoObtido);
		Assertions.assertEquals(nomeValido, nomeObtido);
		Assertions.assertEquals(notaValida, notaObtida);
		Assertions.assertEquals(frequenciaValida, frequenciaObtida);


	}
}
