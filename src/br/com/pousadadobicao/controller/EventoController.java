package br.com.pousadadobicao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.pousadadobicao.dao.EventoDao;
import br.com.pousadadobicao.modelo.Evento;

@Transactional
@Controller
public class EventoController {

	@Autowired
	EventoDao dao;

	@RequestMapping("removeEvento")
	public String remove(Evento evento) {
		dao.remove(evento);
		return "redirect:AdminEvento";
	}

	@RequestMapping("mostraEvento")
	public String mostra(Long idEvento, Model model) {
		model.addAttribute("evento", dao.buscaPorId(idEvento));
		return "jsp/mostra-evento";
	}

	@RequestMapping("alteraEvento")
	public String altera(Evento evento) {
		dao.altera(evento);
		return "redirect:AdminEvento";
	}

	@RequestMapping("AdminEvento")
	public String adminLista(Model model) {
		model.addAttribute("eventos", dao.lista());
		return "jsp/admin-evento";
	}

	@RequestMapping("fazerEvento")
	public String form() {
		return "jsp/fazer-eventos";
	}

	@RequestMapping("adicionaEvento")
	public String adiciona(Evento evento) {
		dao.adiciona(evento);
		return "jsp/adicionada";
	}

}
