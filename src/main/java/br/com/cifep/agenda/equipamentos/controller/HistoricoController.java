package br.com.cifep.agenda.equipamentos.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/reserva")
public class HistoricoController {

	@GetMapping("/historico")
	public String historicoCompleto(HttpServletRequest request) {
		
		request.setAttribute("mensagem", "Tela: Histórico de reservas");
		
		return "/agenda/historico.html";
	}
}
