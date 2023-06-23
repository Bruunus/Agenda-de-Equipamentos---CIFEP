package br.com.cifep.agenda.equipamentos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.cifep.agenda.equipamentos.calendario.CalendarioAgenda;
//import br.com.cifep.agenda.equipamentos.model.Calendario;
//import br.com.cifep.agenda.equipamentos.repository.CalendarioRepository;

@Controller
@RequestMapping("/")
public class HomeController {
	
	 
	
	public static int contador;
	public CalendarioAgenda ano = new CalendarioAgenda();
	
	
	

	public HomeController() {
		HomeController.contador++;
	}
	
	
	@GetMapping("/")
	public String homePage() {
		
		System.out.println("Teste de requisição com REST API - Agenda de Equipamentos com sucesso !!!");		 
		
		return "/home.html";	
	}
	
	
	
	
//	@GetMapping("/home")
//	public String home(HttpServletRequest request) {		
//		
//	 
//		
//		
//		
//		CalendarioAgenda calendario = new CalendarioAgenda();
//		List<String> mesesAno =  calendario.getMeses();
//		int year = calendario.getAnoAtual();
//	 
// 
//		request.setAttribute("mes", mesesAno);
//		request.setAttribute("anoAtual", year);
//		request.setAttribute("thymeleaf", "HOME PAGE - Cifep Equipamentos");
//	 
//		
//		
//		
//		
//		System.out.println("Página /home acessada: " + contador++ + " vez(zes)");
//		
//		return "/home";
//		
//	}
	
	
	@GetMapping("home2")
	public String home_2() {
		return "/home2.html";	
	}
	
	
	
	@GetMapping("home4")
	public String home_4() {
		return "/home4.html";	
	}
	
	
//	
//	/**
//	 * Puxando os dados de um objeto comum java
//	 * @param request
//	 * @param model
//	 * @return
//	 */
//	@GetMapping("/reservas")
//	public String reservas(HttpServletRequest request, Model model) {
//		
//		Reserva reserva = new Reserva();
//		reserva.setSolicitante("Bruno Fernandes");
//		reserva.setSetor(new Setor("TECNOLOGIA DA INFORMAÇÃOoooo"));
//		reserva.setDataDaReserva(LocalDate.of(2022, 12, 15));
//		reserva.setHoraInicial(LocalTime.of(9, 00));
//		reserva.setHoraFinal(LocalTime.of(15, 00));
//		reserva.setEquipamento("DATASHOW");
//		
//		List<Reserva> reservas = Arrays.asList(reserva);
//		
//		reservas.forEach(System.out::println);
//		
//		model.addAttribute("reserva", reservas);
//		
//		return "/agenda/reservas";
//		
//	}
//	
//	
//	
//	/**
//	 * Puxando os dados do banco de dados direto
//	 * @param request
//	 * @param model
//	 * @return
//	 */
//	@GetMapping("/reservasEntityManager")
//	public String reservasEntityManager(HttpServletRequest request, Model model) {
//		
////		Query query = entityManager.createQuery("SELECT r FROM Reserva r", Reserva.class);
////		
////		@SuppressWarnings("unchecked")
////			List<Reserva> reservas = query.getResultList();
////		
////		model.addAttribute("reserva", reservas);
//		
//		return "/agenda/reservas";
//		
//	}
//	
//	
//	
//	/**
//	 * Puxando os dados do banco de dados direto
//	 * @param request
//	 * @param model
//	 * @return
//	 */
//	@GetMapping("/reservasSpringData")
//	public String reservasDB(HttpServletRequest request, Model model) {
//		
////		List<Reserva> reservas = reservaRepository.findAll();
//		
////		model.addAttribute("reserva", reservas);
//		
//		return "/agenda/reservas";
//		
//	}
//	
//	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
}
