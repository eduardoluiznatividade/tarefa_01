package br.edu.infnet.votaelnatividade.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import br.edu.infnet.votaelnatividade.model.domain.Eleicao;
import br.edu.infnet.votaelnatividade.service.EleicaoService;

@Controller
public class EleicaoController {
	
	@Autowired
	private EleicaoService eleicaoService;
		
	@GetMapping(value = "/eleicao")
	public String cadastro() {
		return "eleicao/cadastro";
	}
	
	@GetMapping(value = "/eleicoes")
	public String lista(Model model) {
		model.addAttribute("lista", eleicaoService.listar());
		return "eleicao/lista";
	}
	
	@PostMapping(value = "eleicao/incluir")
	public String incluir(Eleicao eleicao) {
//		System.out.println("Inclusao realizada".concat(eleicao.getDescricao()));
		eleicaoService.incluir(eleicao);
		return "redirect:/eleicoes";
	}
	
	@GetMapping(value = "/eleicao/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		eleicaoService.excluir(id);	
		return "redirect:/eleicoes";
	}

}
