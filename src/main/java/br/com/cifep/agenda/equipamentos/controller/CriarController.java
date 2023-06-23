package br.com.cifep.agenda.equipamentos.controller;

import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.cifep.agenda.equipamentos.dto.ReservaDTO;

@Controller
@RequestMapping("/reserva")
public class CriarController {
	
	@GetMapping("/criar")
	public String telaCriar() {
		return "/agenda/criar";
	}

	/**
	 * Controlador que trabalhará com thymeleaf para recebimento dos dados.
	 * Chamado o ModelAttribute para reconehcer e criar um novo objeto de ReservaDTO
	 * 
	 * @param reservaDTO
	 * @return
	 */
	@PostMapping(value = "/criar-tm") //posteriormente será o ReservaService !!
	public String criarReserva(@ModelAttribute ReservaDTO reservasDTO) {
		
		
		ReservaDTO reservas = new ReservaDTO();
		reservas.setColaborador(reservasDTO.getColaborador());
		reservas.setSetor(reservasDTO.getSetor());
		reservas.setDataDaReserva(reservasDTO.getDataDaReserva());
		
		reservas.setDataDaReserva(reservasDTO.getDataFimDaReserva());
		reservas.setPeriodoInicio(reservasDTO.getPeriodoInicio());
		reservas.setPeriodoFim(reservasDTO.getPeriodoFim());
		reservas.setOpcoesDeRecorrencia(reservasDTO.getOpcoesDeRecorrencia());
		reservas.setOpcoesDeRecorrenciaItem(reservasDTO.getOpcoesDeRecorrenciaItem());
		reservas.setEquipamentosSelecionados(reservasDTO.getEquipamentosSelecionados());
		
		
//		List<ReservaDTO> list = new ArrayList<>();
//		list.add(reservas);
//		list.forEach(i -> {
//			System.out.println(i + "\n");
//		});
		
		
		
		return "/agenda/criar";
	}
	
	
	
	@PostMapping(value = "/criar-js", produces = "application/json")
	@ResponseBody
	public void addPet(@RequestBody ReservaDTO reservasDTO) {
		
		// para classe de serviço
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		
		
		
		System.out.println("Formulário JS");
		System.out.println("Nome: "+ reservasDTO.getColaborador());
		System.out.println("Setor: "+reservasDTO.getSetor());
		System.out.println("Data Início: "+reservasDTO.getDataDaReserva());
		System.out.println("Data Fim: "+reservasDTO.getDataFimDaReserva());
		System.out.println("Hora início: "+reservasDTO.getPeriodoInicio());
		System.out.println("Hora fim: "+reservasDTO.getPeriodoFim());
		
		
		
		System.out.println("Dia anual: "+reservasDTO.getOpcaoDiaAnual());
		
		System.out.println("Recorrência "+reservasDTO.getOpcoesDeRecorrencia());
		 
		System.out.println("Equipamentos reservados: "+reservasDTO.getEquipamentosSelecionados());
		System.out.println("Quantidade "+reservasDTO.getQuantidadeDeItem());
		
		System.out.println("Outro Equipamento (Exceção): "+reservasDTO.getOutrosEquipamentos());
		System.out.println("Quantidade de outro equipamento (Exceção):"+reservasDTO.getQtdOutroEquipamento());
		
		
		
		
//		ReservaDTO reservas = new ReservaDTO();
//		reservas.setColaborador(reservasDTO.getColaborador());
//		reservas.setSetor(reservasDTO.getSetor());
//		
//		reservas.setDataDaReserva(reservasDTO.getDataDaReserva());
//		reservas.setDataDaReserva(reservasDTO.getDataFimDaReserva());
//		reservas.setOpcoesDeRecorrencia(reservasDTO.getOpcoesDeRecorrencia());
//		reservas.setOpcoesDeRecorrenciaItem(reservasDTO.getOpcoesDeRecorrenciaItem());
		
		
		
		
		

//		List<ReservaDTO> list = new ArrayList<>();
//		list.add(reservas);
//		list.forEach(i -> {
//			System.out.println(i + "\n");
//		});
		
	}
	
	
	
	
	
	
	
	
	
	
}
