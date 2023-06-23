package br.com.cifep.agenda.equipamentos.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AgendamentoController {

	@GetMapping("/agendamento")
	public String agendamentoReserva(HttpServletRequest request) {
		
		request.setAttribute("mensagem", "Tela: Agendamento de reservas");
		
		return "/agenda/agendamento";
	}
	
}
