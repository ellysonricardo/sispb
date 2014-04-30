package br.com.pousadadobicao.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.pousadadobicao.dao.TextoPrincipalDao;
import br.com.pousadadobicao.modelo.Site;

@Transactional
@Controller
public class TextoPrincipalController {
	
	@Autowired
	TextoPrincipalDao dao;
	

	@RequestMapping("textoPrincipal")
	public String lista(Model model) {
		model.addAttribute("sites", dao.lista());
		return "jsp/index";
	}

	@RequestMapping("removeSite")
	public String remove(Site site) {
		dao.remove(site);
		return "redirect:AdminTextoPrincipal";
	}

	@RequestMapping("mostraSite")
	public String mostra(Long idSite, Model model) {
		model.addAttribute("site", dao.buscaPorId(idSite));
		return "jsp/mostra";
	}
	
	@RequestMapping("alteraSite")
	public String altera(Site site){
		dao.altera(site);
		return "redirect:AdminTextoPrincipal";
	}

	@RequestMapping("AdminTextoPrincipal")
	public String adminLista(Model model) {
		model.addAttribute("sites", dao.lista());
		return "jsp/adminTexto";
	}

	@RequestMapping("novoTextoPrincipal")
	public String form() {
		return "jsp/formulario";
	}

	@RequestMapping("")
	public String index() {
		return "jsp/index";
	}

	@RequestMapping("adicionaTextoPrincipal")
	public String adiciona(@Valid Site site, BindingResult result) {

		if (result.hasFieldErrors("texto")) {
			return "jsp/formulario";
		}

		dao.adiciona(site);
		return "jsp/adicionada";
	}
}
