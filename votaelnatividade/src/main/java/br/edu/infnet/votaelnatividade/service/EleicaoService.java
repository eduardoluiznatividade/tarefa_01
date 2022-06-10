package br.edu.infnet.votaelnatividade.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.edu.infnet.votaelnatividade.model.domain.Eleicao;
import br.edu.infnet.votaelnatividade.model.repository.EleicaoRepository;

@Service
public class EleicaoService {
	
	@Autowired
	private EleicaoRepository eleicaoRepository;
	
	public void incluir(Eleicao eleicao) {
		eleicaoRepository.save(eleicao);
	}
	
	public List<Eleicao> listar(){
		return (List<Eleicao>)eleicaoRepository.findAll();
	}
	
	public Eleicao obterPorId(Integer id) {
		return eleicaoRepository.findById(id).orElse(null);
	}

	public void excluir(Integer id) {
		eleicaoRepository.deleteById(id);
	}
}
