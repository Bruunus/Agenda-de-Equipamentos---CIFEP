package br.com.cifep.agenda.equipamentos.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.cifep.agenda.equipamentos.dto.ReservaDTO;

@RestController
@RequestMapping("/api")
public class RestControllerApi {

	// 1 ponto -  O formulário chegou, ele precisa virar um objeto aqui no controller
	
	@RequestMapping(value = "/criar", method = RequestMethod.POST)
	private ResponseEntity<Void> criarApi(@RequestBody ReservaDTO reservaDTO) {		
		
		try {
			ReservaDTO reserva = new ReservaDTO();
			reserva.setColaborador(reservaDTO.getColaborador());
			reserva.setSetor(reservaDTO.getSetor());
			reserva.setDataDaReserva(reservaDTO.getDataDaReserva());
			reserva.setPeriodoInicio(reservaDTO.getPeriodoInicio());
			reserva.setPeriodoFim(reservaDTO.getPeriodoFim());
			reserva.setOpcoesDeRecorrencia(reservaDTO.getOpcoesDeRecorrencia());
			reserva.setOpcoesDeRecorrenciaItem(reservaDTO.getOpcoesDeRecorrenciaItem());
			reserva.setEquipamentosSelecionados(reservaDTO.getEquipamentosSelecionados()); // criamos uma lista do enum, e não importa quantos dados cheguem ele vai adicionar na lista
			
			List<ReservaDTO> list = new ArrayList<>();
			list.add(reserva);
			list.forEach(i -> {
				System.out.println(i + "\n");
			});
			
			return ResponseEntity.status(HttpStatus.OK).build();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		
	}
	
}
