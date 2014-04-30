package br.com.pousadadobicao.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.pousadadobicao.dao.ClienteDao;
import br.com.pousadadobicao.modelo.Cliente;
import br.com.pousadadobicao.modelo.Endereco;
import br.com.pousadadobicao.modelo.Reserva;

@Transactional
@Controller
public class ClienteController {
	
	@Autowired
	ClienteDao dao;
	
	@RequestMapping("removeCliente")
	public String remove(Cliente cliente) {
		dao.remove(cliente);
		return "redirect:AdminCliente";
	}

	@RequestMapping("mostraCliente")
	public String mostra(Long idCliente, Model model) {
		model.addAttribute("cliente", dao.buscaPorId(idCliente));
		return "jsp/mostra-cliente";
	}
	
//	@RequestMapping("alteraCliente")
//	public String altera(Cliente cliente, Endereco endereco, Reserva reserva){
//		dao.altera(cliente, endereco, reserva);
//		return "redirect:AdminCliente";
//	}

	@RequestMapping("AdminCliente")
	public String adminLista(Model model) {
		model.addAttribute("clientes", dao.lista());
		return "jsp/admin-cliente";
	}

	@RequestMapping("novoCliente")
	public String form() {
		return "jsp/adiciona-cliente";
	}

	
	@RequestMapping("adicionaCliente")
	public String adiciona(@Valid Cliente cliente, Endereco endereco, BindingResult result) {

		if (result.hasFieldErrors("nome")) {
			return "jsp/adiciona-cliente";
		}

		dao.adiciona(cliente, endereco);
		return "jsp/adicionada";
	}

}
