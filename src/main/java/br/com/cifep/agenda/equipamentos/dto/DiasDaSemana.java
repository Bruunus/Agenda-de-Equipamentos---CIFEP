package br.com.cifep.agenda.equipamentos.dto;

public enum DiasDaSemana {

	SEGUNDA_FEIRA("Segunda-feira"),
	TERCA_FEIRA("Terça-feira"),
	QUARTA_FEIRA("Quarta-feira"),
	QUINTA_FEIRA("Quinta-feira"),
	SEXTA_FEIRA("Sexta-feira"),
	SABADO("Sábado"),
	DOMINGO("Domingo");
	
	private String nome;
	
	DiasDaSemana(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nome;
	}
	
	
	
}
