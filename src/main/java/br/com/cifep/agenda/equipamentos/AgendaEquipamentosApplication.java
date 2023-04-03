package br.com.cifep.agenda.equipamentos;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//import br.com.cifep.agenda.equipamentos.repository.ReservaRepository;
//import br.com.cifep.agenda.equipamentos.repository.SetorRepository;

// (exclude = {DataSourceAutoConfiguration.class })

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class AgendaEquipamentosApplication implements CommandLineRunner{

	
//	@Autowired
//	ReservaRepository reservaRepository;
//	
//	@Autowired
//	SetorRepository setorRepository;
	
	
	

	public static void main(String[] args) {
		
		SpringApplication.run(AgendaEquipamentosApplication.class, args);
		System.out.println("Springboot carregado com sucesso !!!");

		
		
		
	}




	
	
	

	@Override
	public void run(String... args) throws Exception { 
		
	 
		 
		 
		
//		Reserva reserva = new Reserva();
//			reserva.setSolicitante("Amanda");
//			reserva.setDataDaReserva(LocalDate.of(2022, 12, 12));
//			reserva.setHoraInicial(LocalTime.of(10, 00));
//			reserva.setHoraFinal(LocalTime.of(15, 00));
//			reserva.setSetor(new Setor("MOVIMENTAÇÃO"));
//			reserva.setEquipamento("DATASHOW");
//			
//			reservaRepository.save(reserva);
		
			
			
		 
			
			
		
	}
	
	
	private void selects(String solicitante) {
		
//		List<Reserva> list =  (List<Reserva>) reservaRepository.findAll();
//		list.forEach(System.out::println);
		
	}
	
	

}

