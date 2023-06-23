package br.com.cifep.agenda.equipamentos.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AtualizarController {

	@GetMapping("/atualizar")
	public String atualizarReserva(HttpServletRequest request) {
		 
		request.setAttribute("mensagem", "Tela: Atualizar Reservas");		
		
		return "/agenda/atualizar/atualizar_reserva";
	}
	
}
