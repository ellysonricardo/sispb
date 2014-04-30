package br.com.pousadadobicao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.pousadadobicao.dao.ClienteDao;
import br.com.pousadadobicao.modelo.Cliente;
import br.com.pousadadobicao.modelo.Endereco;
import br.com.pousadadobicao.modelo.Reserva;

@Transactional
@Controller
public class CheckinController {
	
	@Autowired
	ClienteDao dao;

	@RequestMapping("buscaClientePeloNome")
	public String form() {
		return "jsp/busca-cliente";
	}
	
	@RequestMapping("consultaReserva")
	public String adminLista(Cliente cliente, Model model) {
		model.addAttribute("clientes", dao.encontrarPorNome(cliente));
		return "jsp/resultado-cliente";
	}
	
	@RequestMapping("mostraChekin")
	public String mostra(Long idCliente, Model model) {
		model.addAttribute("cliente", dao.buscaPorId(idCliente));
		return "jsp/mostra-checkin";
	}
	
	@RequestMapping("alteraCheckin")
	public String altera(Cliente cliente, Endereco endereco, Reserva reserva){
		dao.altera(cliente,endereco,reserva);
		return "jsp/mostra-checkin-endereco";
	}
	
	@RequestMapping("alteraCheckinEndereco")
	public String alteraEnde(Endereco e, Reserva r){
		dao.alteraEnd(e,r);
		return "jsp/mostra-checkin-reserva";
	}
	
	@RequestMapping("alteraCheckinReserva")
	public String alteraRese(Reserva reserva){
		dao.alteraRes(reserva);
		return "jsp/busca-cliente";
	}
}
