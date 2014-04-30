package br.com.pousadadobicao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.pousadadobicao.dao.ValorDiariaDao;
import br.com.pousadadobicao.modelo.ValorDiaria;

@Transactional
@Controller
public class ValorDiariaController {

	@Autowired
	ValorDiariaDao dao;
	
	@RequestMapping("removeValorDiaria")
	public String remove(ValorDiaria valorDiaria) {
		dao.remove(valorDiaria);
		return "redirect:AdminValorDiaria";
	}

	
	@RequestMapping("mostraValorDiaria")
	public String mostra(Long idValorDiaria, Model model) {
		model.addAttribute("valorDiaria", dao.buscaPorId(idValorDiaria));
		return "jsp/mostra-valordiaria";
	}

	@RequestMapping("alteraValorDiaria")
	public String altera(ValorDiaria valorDiaria) {
		dao.altera(valorDiaria);
		return "redirect:AdminValorDiaria";
	}

	@RequestMapping("AdminValorDiaria")
	public String adminLista(Model model) {
		model.addAttribute("valorDiarias", dao.lista());
		return "jsp/admin-valordiaria";
	}

	@RequestMapping("NovoValorDiaria")
	public String form() {
		return "jsp/adiciona-valordiaria";
	}

	@RequestMapping("adicionaValorDiaria")
	public String adiciona(ValorDiaria valorDiaria) {
		dao.adiciona(valorDiaria);
		return "jsp/adicionada";
	}

}
