package br.edu.infnet.votaelnatividade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import br.edu.infnet.votaelnatividade.model.domain.Candidato;
//import br.edu.infnet.votaelnatividade.model.repository.CandidatoRepository;
import br.edu.infnet.votaelnatividade.service.CandidatoService;

@Component
public class CandidatoLoader implements ApplicationRunner{
	
	@Autowired
//	private CandidatoRepository candidatoRepository;
	private CandidatoService candidatoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Candidato candidato = new Candidato();
		candidato.setNome("Eduardo");
		candidato.setNumero(45);
		
		try {
//			candidatoRepository.save(candidato);
			candidatoService.incluir(candidato);
			System.out.println("Candidato salvo");
			
		} catch (Exception e) {
			System.out.println("Erro ".concat(e.getMessage()));
			
		}
		
		
	}

}
