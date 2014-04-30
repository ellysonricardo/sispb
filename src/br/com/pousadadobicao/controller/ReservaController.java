package br.com.pousadadobicao.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.pousadadobicao.dao.ReservaDao;
import br.com.pousadadobicao.modelo.Cliente;
import br.com.pousadadobicao.modelo.Endereco;
import br.com.pousadadobicao.modelo.Reserva;

@Transactional
@Controller
public class ReservaController {

	@Autowired
	ReservaDao dao;
	
	@RequestMapping("removeReserva")
	public String remove(Reserva reserva) {
		dao.remove(reserva);
		return "redirect:AdminReserva";
	}

	@RequestMapping("mostraReserva")
	public String mostra(Long idReserva, Model model) {
		model.addAttribute("reserva", dao.buscaPorId(idReserva));
		return "jsp/mostra-reserva";
	}
	
	@RequestMapping("alteraReserva")
	public String altera(Reserva reserva){
		dao.altera(reserva);
		return "redirect:AdminReserva";
	}

	@RequestMapping("AdminReserva")
	public String adminLista(Model model) {
		model.addAttribute("reservas", dao.lista());
		return "jsp/admin-reserva";
	}

	@RequestMapping("novoReserva")
	public String form() {
		return "jsp/adiciona-reserva";
	}

	
	@RequestMapping("adicionaReserva")
	public String adiciona(Reserva reserva, Cliente cliente, Endereco endereco) {
		dao.adiciona(reserva, cliente, endereco);
		return "jsp/adicionada";
	}
	
	@RequestMapping("confirmarDeposito")
	public void deposito(Long idReserva, HttpServletResponse response) {
		dao.finaliza(idReserva);
		response.setStatus(200);
	}

	
	@RequestMapping("confirmarValorDeposito")
	public String confirmarDepositos(Long idReserva, Model model) {
		model.addAttribute("reserva", dao.buscaPorId(idReserva));
		return "jsp/deposito";
	}
	
	@RequestMapping("efetuarDeposito")
	public String alteraDep(Reserva reserva){
		dao.alteraDeposito(reserva);
		return "redirect:buscaClientePeloNome";
	}
}
