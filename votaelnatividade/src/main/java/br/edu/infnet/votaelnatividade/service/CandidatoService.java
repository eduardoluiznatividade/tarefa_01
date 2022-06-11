package br.edu.infnet.votaelnatividade.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.edu.infnet.votaelnatividade.model.domain.Candidato;
import br.edu.infnet.votaelnatividade.model.domain.Eleicao;
import br.edu.infnet.votaelnatividade.model.repository.CandidatoRepository;

@Service
public class CandidatoService {
	
	@Autowired
	private CandidatoRepository candidatoRepository;
	
	public void incluir(Candidato candidato) {
		candidatoRepository.save(candidato);
	}
	
	public List<Candidato> listar(){
		return (List<Candidato>)candidatoRepository.findAll();
	}
	
	public void excluir(Integer id) {
		candidatoRepository.deleteById(id);
	}

	public Object findByEleicao(Integer idEleicao) {
		return candidatoRepository.findAll();
	}
	

}
