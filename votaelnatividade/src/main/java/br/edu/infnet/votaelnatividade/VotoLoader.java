package br.edu.infnet.votaelnatividade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import br.edu.infnet.votaelnatividade.model.domain.Voto;
//import br.edu.infnet.votaelnatividade.model.repository.VotoRepository;
import br.edu.infnet.votaelnatividade.service.VotoService;

@Component
public class VotoLoader implements ApplicationRunner{

	@Autowired
//	private VotoRepository votoRepository;
	private VotoService votoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Voto voto = new Voto();
		voto.setLocalizacao("Rio de Janeiro");
		
		try {
//			votoRepository.save(voto);
			votoService.incluir(voto);
			System.out.println("Voto salvo");
			
		} catch (Exception e) {
			System.out.println("Erro ".concat(e.getMessage()));
			
		}
	}

}
