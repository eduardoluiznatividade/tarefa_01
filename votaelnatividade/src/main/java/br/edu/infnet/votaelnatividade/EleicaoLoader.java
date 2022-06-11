package br.edu.infnet.votaelnatividade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import br.edu.infnet.votaelnatividade.model.domain.Eleicao;
//import br.edu.infnet.votaelnatividade.model.repository.EleicaoRepository;
import br.edu.infnet.votaelnatividade.service.EleicaoService;

@Component
public class EleicaoLoader implements ApplicationRunner{
	
	@Autowired
//	private EleicaoRepository eleicaoRepository;
	private EleicaoService eleicaoService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Eleicao eleicao = new Eleicao();
		eleicao.setDescricao("Eleicao 2022");
		
		try {
//			eleicaoRepository.save(eleicao);
//			eleicaoService.incluir(eleicao);
//			System.out.println("Eleição salvo");
			
		} catch (Exception e) {
			System.out.println("Erro ".concat(e.getMessage()));
			
		}
		
	}
	
	

}
