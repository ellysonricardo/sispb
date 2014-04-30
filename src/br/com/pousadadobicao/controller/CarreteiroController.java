package br.com.pousadadobicao.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.pousadadobicao.dao.CarreteiroDao;
import br.com.pousadadobicao.modelo.Carreteiro;
import br.com.pousadadobicao.modelo.Endereco;

@Transactional
@Controller
public class CarreteiroController {

	@Autowired
	CarreteiroDao dao;
	
	@RequestMapping("removeCarreteiro")
	public String remove(Carreteiro carreteiro) {
		dao.remove(carreteiro);
		return "redirect:AdminCarreteiro";
	}

	@RequestMapping("mostraCarreteiro")
	public String mostra(Long idCarreteiro, Model model) {
		model.addAttribute("carreteiro", dao.buscaPorId(idCarreteiro));
		return "jsp/mostra-carreteiro";
	}
	
	@RequestMapping("alteraCarreteiro")
	public String altera(Carreteiro carreteiro){
		dao.altera(carreteiro);
		return "redirect:AdminCarreteiro";
	}

	@RequestMapping("AdminCarreteiro")
	public String adminLista(Model model) {
		model.addAttribute("carreteiros", dao.lista());
		return "jsp/admin-carreteiro";
	}

	@RequestMapping("novoCarreteiro")
	public String form() {
		return "jsp/adiciona-carreteiro";
	}

	
	@RequestMapping("adicionaCarreteiro")
	public String adiciona(@Valid Carreteiro carreteiro, Endereco endereco, BindingResult result) {

		if (result.hasFieldErrors("nome")) {
			return "jsp/adiciona-carreteiro";
		}

		dao.adiciona(carreteiro, endereco);
		return "jsp/adicionada";
	}

}
