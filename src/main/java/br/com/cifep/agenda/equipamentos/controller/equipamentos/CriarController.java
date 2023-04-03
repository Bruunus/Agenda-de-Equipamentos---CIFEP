package br.com.cifep.agenda.equipamentos.controller.equipamentos;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CriarController {

	@GetMapping("/criar")
	public String criarReserva(HttpServletRequest request) {
		
		request.setAttribute("mensagem", "Tela: Criar Reservas");
		
		return "/agenda/criar";
	}
}
