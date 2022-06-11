package br.edu.infnet.votaelnatividade.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.votaelnatividade.model.domain.Eleicao;
import br.edu.infnet.votaelnatividade.model.domain.Eleitor;
import br.edu.infnet.votaelnatividade.service.CandidatoService;
import br.edu.infnet.votaelnatividade.service.EleicaoService;
import br.edu.infnet.votaelnatividade.service.EleitorService;
import br.edu.infnet.votaelnatividade.service.VotoService;

@Controller
public class votoController {
	
	@Autowired
	private VotoService votoService;
	@Autowired
	private EleitorService eleitorService;
	@Autowired
	private EleicaoService eleicaoService;
	@Autowired
	private CandidatoService candidatoService;

	
	@GetMapping(value = "/voto")
	public String cadastro(Integer idEleicao, Model model) {
		model.addAttribute("eleitores", eleitorService.listar());
		model.addAttribute("candidatos", candidatoService.findByEleicao(idEleicao));
		
		return "voto/cadastro";
		
	}
/*	
	@GetMapping(value = "/voto")
	public String cadastro(Model model) {
		model.addAttribute("eleitores", eleitorService.listar());
		model.addAttribute("candidatos", candidatoService.listar());
		
		return "voto/cadastro";
	}
*/

		
	@GetMapping(value = "/votos")
	public String lista(Model model) {
		model.addAttribute("lista", votoService.listar());
		model.addAttribute("eleicoes", eleicaoService.listar());
		
		return "voto/lista";
	}
/*	
	@PostMapping(value = "voto/incluir")
	public String incluir(Voto voto) {
//		System.out.println("Inclusao realizada".concat(voto.getLocalizacao()));
		votoService.incluir(voto);
		return "redirect:/votos";
	}
*/	
	@GetMapping(value = "/voto/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		votoService.excluir(id);	
		return "redirect:/votos";
	}

}
