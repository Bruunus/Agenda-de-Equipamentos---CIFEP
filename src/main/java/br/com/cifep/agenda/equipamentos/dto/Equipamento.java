package br.com.cifep.agenda.equipamentos.dto;

public enum Equipamento {

	NOTEBOOK("Notebook"), 
	DATASHOW("Datashow"),
	WEBCAM("Webcam"),
	FLIP_CHART("Flip-chart"),
	LASER_POINTER("Laser Ponter"),
	KIT_MICROFONE("Kit de microfone"),
	EXTENSAO("Extensão"),
	FILTRO_DE_LINHA("Filtro de linha"),
	CABO_HDMI("Cabo HDMI"),
	CABO_VGA("Cabo VGA"),
	CABO_DE_REDE("Cabo de rede"),
	CABO_DE_ENERGIA("Cabo de energia"),
	CABO_DE_AUDIO_P2("Cabo de áudio P2"),
	CABO_DE_AUDIO_P10("Cabo de áudio P10"),
	CABO_MICROFONE_P10("Cabo de microfone P10"),
	ADAPTADOR_DE_AUDIO_P10("Adaptador de áudio P10"),
	ADAPTADOR_DE_AUDIO_P2("Adaptador de áudio P2"),
	ADAPTADOR_DE_TOMADA("Adaptador de tomada"),
	SWITCH_VGA_SPLITTER("Switch VGA Splinter"),
	CONVERSOR_DIGITAL("Conversor digital"),
	PEN_DRIVE("Pendrive");
	
	
	private String nome;
	
	Equipamento(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
        return nome;
    }
	
	@Override
	public String toString() {
		return nome;
	}
	
}
