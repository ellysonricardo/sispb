package br.com.pousadadobicao.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.pousadadobicao.dao.AgenciadorDao;
import br.com.pousadadobicao.modelo.Agenciador;
import br.com.pousadadobicao.modelo.Endereco;

@Transactional
@Controller
public class AgenciadorController {

	@Autowired
	AgenciadorDao dao;
	
	@RequestMapping("removeAgenciador")
	public String remove(Agenciador agenciador) {
		dao.remove(agenciador);
		return "redirect:AdminAgenciador";
	}

	@RequestMapping("mostraAgenciador")
	public String mostra(Long idAgenciador, Model model) {
		model.addAttribute("agenciador", dao.buscaPorId(idAgenciador));
		return "jsp/mostra-agenciador";
	}
	
	@RequestMapping("alteraAgenciador")
	public String altera(Agenciador agenciador){
		dao.altera(agenciador);
		return "redirect:AdminAgenciador";
	}

	@RequestMapping("AdminAgenciador")
	public String adminLista(Model model) {
		model.addAttribute("agenciadores", dao.lista());
		return "jsp/admin-agenciador";
	}

	@RequestMapping("novoAgenciador")
	public String form() {
		return "jsp/adiciona-agenciador";
	}

	
	@RequestMapping("adicionaAgenciador")
	public String adiciona(@Valid Agenciador agenciador, Endereco endereco, BindingResult result) {

		if (result.hasFieldErrors("nome")) {
			return "jsp/adiciona-agenciador";
		}

		dao.adiciona(agenciador, endereco);
		return "jsp/adicionada";
	}

}
