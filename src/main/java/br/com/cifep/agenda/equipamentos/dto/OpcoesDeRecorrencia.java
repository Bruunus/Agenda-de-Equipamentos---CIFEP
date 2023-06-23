package br.com.cifep.agenda.equipamentos.dto;

public enum OpcoesDeRecorrencia {

	TODOS_OS_DIAS("Todos os dias"),
	A_CADA_15_DIAS("A cada 15 dias"),
	UMA_VEZ_POR_MES("1 vez por mês");

	private String nome;
	
	OpcoesDeRecorrencia(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
		
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nome;
	}
	
}
