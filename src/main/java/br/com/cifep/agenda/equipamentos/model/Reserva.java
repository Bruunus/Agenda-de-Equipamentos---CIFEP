package br.com.cifep.agenda.equipamentos.model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
public class Reserva {

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String colaborador;
	
	private String setor;
	
	private LocalDate data_da_reserva;
	
	private LocalTime hora_inicio;
	
	private LocalTime hora_fim;
	
	
	
	
}
