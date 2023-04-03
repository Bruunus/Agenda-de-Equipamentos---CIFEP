package br.com.cifep.agenda.equipamentos.controller.equipamentos;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReservasController {

	@GetMapping("/reservasAtivas")
	public String verReservas(HttpServletRequest request) {
		
		request.setAttribute("mensagem", "Tela: Reservas Ativas");
		
		return "/agenda/reservas";
	}
}
