package br.edu.infnet.votaelnatividade.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.edu.infnet.votaelnatividade.model.domain.Voto;
import br.edu.infnet.votaelnatividade.model.repository.VotoRepository;

@Service
public class VotoService {
	
	@Autowired
	private VotoRepository votoRepository;
	
	public void incluir(Voto voto) {
		votoRepository.save(voto);
		
	}
	
	public List<Voto> listar(){
		return (List<Voto>)votoRepository.findAll();
	}
	
	public void excluir(Integer id) {
		votoRepository.deleteById(id);
	}

}
