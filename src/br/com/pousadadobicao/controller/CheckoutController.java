package br.com.pousadadobicao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.pousadadobicao.dao.ReservaDao;
import br.com.pousadadobicao.modelo.Reserva;

@Transactional
@Controller
public class CheckoutController {
	
	@Autowired
	ReservaDao dao;

	@RequestMapping("buscaPeloQuarto")
	public String form() {
		return "jsp/busca-quarto";
	}
	
	@RequestMapping("buscaQuarto")
	public String adminLista(Reserva reserva, Model model) {
		model.addAttribute("reservas", dao.quarto(reserva));
		return "jsp/resultado-quarto";
	}
	
	@RequestMapping("fechaReserva")
	public String fechar() {
		return "jsp/fecha-reserva";
	}
	
	@RequestMapping("mostraCheckout")
	public String mostra(Long idReserva, Model model) {
		model.addAttribute("reserva", dao.buscaPorId(idReserva));
		return "jsp/mostra-checkout";
	}
	
	@RequestMapping("fazerChekout")
	public String fechar(Reserva reserva){
		dao.altera(reserva);
		return "jsp/resultado-quarto";
	}
	
}
