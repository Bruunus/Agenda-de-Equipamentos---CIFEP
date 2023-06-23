package br.com.cifep.agenda.equipamentos.dto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;


public class ReservaDTO {
	
	private String colaborador;
	
	private String setor;
	
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private String dataDaReserva;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private String dataFimDaReserva;
	
	private LocalTime periodoInicio;
	
	private LocalTime periodoFim;
	
	private String anualStringJS;
	
	private Boolean anual = false;
	
	private DiasDaSemana opcaoDiaAnual;
	
	private Boolean opcoesDeRecorrencia = false;
	              
	private OpcoesDeRecorrencia opcoesDeRecorrenciaItem;
	
	private List<Equipamento> equipamentosSelecionados;
	
	private List<Integer> quantidadeDeItem;
	
	private String outrosEquipamentos;
	
	private Integer qtdOutroEquipamento;
	
	
	
	

	public String getOutrosEquipamentos() {
		return outrosEquipamentos;
	}

	public void setOutrosEquipamentos(String outrosEquipamentos) {
		this.outrosEquipamentos = outrosEquipamentos;
	}

	

	public String getColaborador() {
		return colaborador;
	}

	public void setColaborador(String colaborador) {
		this.colaborador = colaborador;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getDataDaReserva() {
		return dataDaReserva;
	}

	public void setDataDaReserva(String dataDaReserva) {
		this.dataDaReserva = dataDaReserva;
	}

	public LocalTime getPeriodoInicio() {
		return periodoInicio;
	}

	public void setPeriodoInicio(LocalTime periodoInicio) {
		this.periodoInicio = periodoInicio;
	}

	public LocalTime getPeriodoFim() {
		return periodoFim;
	}

	public void setPeriodoFim(LocalTime periodoFim) {
		this.periodoFim = periodoFim;
	}

	public Boolean getAnual() {
		return anual;
	}

	public void setAnual(Boolean anual) {
		this.anual = anual;
	}

	public DiasDaSemana getOpcaoDiaAnual() {
		return opcaoDiaAnual;
	}

	public void setOpcaoDiaAnual(DiasDaSemana opcaoDiaAnual) {
		this.opcaoDiaAnual = opcaoDiaAnual;
	}

	public Boolean getOpcoesDeRecorrencia() {
		return opcoesDeRecorrencia;
	}

	public void setOpcoesDeRecorrencia(Boolean opcoesDeRecorrencia) {
		this.opcoesDeRecorrencia = opcoesDeRecorrencia;
	}

	public OpcoesDeRecorrencia getOpcoesDeRecorrenciaItem() {
		return opcoesDeRecorrenciaItem;
	}

	public void setOpcoesDeRecorrenciaItem(OpcoesDeRecorrencia opcoesDeRecorrenciaItem) {
		this.opcoesDeRecorrenciaItem = opcoesDeRecorrenciaItem;
	}

//	public List<Equipamento> getEquipamento() {
//		
//		List<Equipamento> equipamentos = Arrays.asList(Equipamento.values());
//		
//		return equipamentos;
//	}
	
	
	
	
	
	public Equipamento getEquipamento(Equipamento equipamento) {
		return equipamento;
	}

 
	public List<Equipamento> getEquipamentosSelecionados() {
		return equipamentosSelecionados;
	}

	public void setEquipamentosSelecionados(List<Equipamento> equipamentosSelecionados) {
		this.equipamentosSelecionados = equipamentosSelecionados;
	}

	public String getDataFimDaReserva() {
		return dataFimDaReserva;
	}

	public void setDataFimDaReserva(String dataFimDaReserva) {
		this.dataFimDaReserva = dataFimDaReserva;
	}
	
	
	
	@Override
	public String toString() {

		return 
				"Nome: "+ this.colaborador +"\n"+
				"Setor: "+this.setor +"\n"+
				"Data da Reserva: "+this.dataDaReserva +"\n"+
				"Data fim da Reserva: "+this.dataFimDaReserva +"\n"+
				"Hora início: "+this.periodoInicio +"\n"+
				"Hora fim: "+this.periodoFim + "\n"+
				"Recorrência anual? "+this.anual +"\n"+
				"Dia da Semana da Recorrência anual: "+this.opcaoDiaAnual + "\n"+
				"Opção para Recorrência? "+this.opcoesDeRecorrencia + "\n"+
				"Opção de Recorrência: "+this.opcoesDeRecorrenciaItem + "\n"+
				"Equipamentos Reservados: "+this.equipamentosSelecionados; 
										   
	}

	public String getAnualStringJS() {
		return anualStringJS;
	}

	public void setAnualStringJS(String anualStringJS) {
		this.anualStringJS = anualStringJS;
	}

	public List<Integer> getQuantidadeDeItem() {
		return quantidadeDeItem;
	}

	

	public void setQuantidadeDeItem(List<Integer> quantidadeDeItem) {
		this.quantidadeDeItem = quantidadeDeItem;
	}

	public Integer getQtdOutroEquipamento() {
		return qtdOutroEquipamento;
	}

	public void setQtdOutroEquipamento(Integer qtdOutroEquipamento) {
		this.qtdOutroEquipamento = qtdOutroEquipamento;
	}

	 

	
	
	
	
	
	
	
	

}
