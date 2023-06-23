package br.com.cifep.agenda.equipamentos.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/reserva")
public class ReservasController {

	@GetMapping("/reservas")
	public String verReservas(HttpServletRequest request) {
		
		request.setAttribute("mensagem", "Tela: Reservas Ativas");
		
		return "/agenda/reservas.html";
	}
}
