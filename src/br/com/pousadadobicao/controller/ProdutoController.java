package br.com.pousadadobicao.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.pousadadobicao.dao.ProdutoDao;
import br.com.pousadadobicao.modelo.Produto;

@Transactional
@Controller
public class ProdutoController {

	@Autowired
	ProdutoDao dao;
	
	@RequestMapping("removeProduto")
	public String remove(Produto produto) {
		dao.remove(produto);
		return "redirect:AdminProduto";
	}

	@RequestMapping("mostraProduto")
	public String mostra(Long idProduto, Model model) {
		model.addAttribute("produto", dao.buscaPorId(idProduto));
		return "jsp/mostra-produto";
	}
	
	@RequestMapping("alteraProduto")
	public String altera(Produto produto){
		dao.altera(produto);
		return "redirect:AdminProduto";
	}

	@RequestMapping("AdminProduto")
	public String adminLista(Model model) {
		model.addAttribute("produtos", dao.lista());
		return "jsp/admin-produto";
	}

	@RequestMapping("novoProduto")
	public String form() {
		return "jsp/adiciona-produto";
	}

	
	@RequestMapping("adicionaProduto")
	public String adiciona(@Valid Produto produto, BindingResult result) {

		if (result.hasFieldErrors("nome")) {
			return "jsp/adiciona-produto";
		}

		dao.adiciona(produto);
		return "jsp/adicionada";
	}

}
