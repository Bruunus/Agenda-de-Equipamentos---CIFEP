package br.com.cifep.agenda.equipamentos.calendario;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class CalendarioAgenda {
	
	List<String> listaMeses = new ArrayList<String>();
	
	private String mes0 = "Janeiro";
	private String mes1 = "Fevereiro";
	private String mes2 = "Março";
	private String mes3 = "Abril";
	private String mes4 = "Maio";
	private String mes5 = "Junho";
	private String mes6 = "Julho";
	private String mes7 = "Agosto";
	private String mes8 = "Setembro";
	private String mes9 = "Outubro";
	private String mes10 = "Novembro";
	private String mes11 = "Dezembro";
	
	
	
	
	
	
	
	public int getAnoAtual() {
		
		Calendar ano = Calendar.getInstance();
		int year = ano.get(Calendar.YEAR);
		
		return year;
	}
	
	
	public List<String> getMeses() {
		
		listaMeses.add(mes0);
		listaMeses.add(mes1);
		listaMeses.add(mes2);
		listaMeses.add(mes3);
		listaMeses.add(mes4);
		listaMeses.add(mes5);
		listaMeses.add(mes6);
		listaMeses.add(mes7);
		listaMeses.add(mes8);
		listaMeses.add(mes9);
		listaMeses.add(mes10);
		listaMeses.add(mes11);
		
		return listaMeses;
	}
	
	 


	public String getMes0() {
		return mes0;
	}


	public void setMes0(String mes0) {
		this.mes0 = mes0;
	}


	public String getMes1() {
		return mes1;
	}


	public void setMes1(String mes1) {
		this.mes1 = mes1;
	}


	public String getMes2() {
		return mes2;
	}


	public void setMes2(String mes2) {
		this.mes2 = mes2;
	}


	public String getMes3() {
		return mes3;
	}


	public void setMes3(String mes3) {
		this.mes3 = mes3;
	}


	public String getMes4() {
		return mes4;
	}


	public void setMes4(String mes4) {
		this.mes4 = mes4;
	}


	public String getMes5() {
		return mes5;
	}


	public void setMes5(String mes5) {
		this.mes5 = mes5;
	}


	public String getMes6() {
		return mes6;
	}


	public void setMes6(String mes6) {
		this.mes6 = mes6;
	}


	public String getMes7() {
		return mes7;
	}


	public void setMes7(String mes7) {
		this.mes7 = mes7;
	}


	public String getMes8() {
		return mes8;
	}


	public void setMes8(String mes8) {
		this.mes8 = mes8;
	}


	public String getMes9() {
		return mes9;
	}


	public void setMes9(String mes9) {
		this.mes9 = mes9;
	}


	public String getMes10() {
		return mes10;
	}


	public void setMes10(String mes10) {
		this.mes10 = mes10;
	}


	public String getMes11() {
		return mes11;
	}


	public void setMes11(String mes11) {
		this.mes11 = mes11;
	}
	


	
}
