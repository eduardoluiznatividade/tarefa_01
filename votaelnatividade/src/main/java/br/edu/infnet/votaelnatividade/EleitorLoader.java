package br.edu.infnet.votaelnatividade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import br.edu.infnet.votaelnatividade.model.domain.Eleitor;
//import br.edu.infnet.votaelnatividade.model.repository.EleitorRepository;
import br.edu.infnet.votaelnatividade.service.EleitorService;

public class EleitorLoader implements ApplicationRunner {

	@Autowired
//	private EleitorRepository eleitorRepository;
	private EleitorService eleitorService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Eleitor eleitor = new Eleitor();
		eleitor.setCodigo("3344");
		
		try {
//			eleitorRepository.save(eleitor);
//			eleitorService.incluir(eleitor);
//			System.out.println("Eleitor salvo");
			
		} catch (Exception e) {
			System.out.println("Erro ".concat(e.getMessage()));
			
		}

	}

}
