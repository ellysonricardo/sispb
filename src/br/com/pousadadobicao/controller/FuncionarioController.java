package br.com.pousadadobicao.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.pousadadobicao.dao.FuncionarioDao;
import br.com.pousadadobicao.modelo.Endereco;
import br.com.pousadadobicao.modelo.Funcionario;

@Transactional
@Controller
public class FuncionarioController {


	@Autowired
	FuncionarioDao dao;
	
	@RequestMapping("removeFuncionario")
	public String remove(Funcionario funcionario) {
		dao.remove(funcionario);
		return "redirect:AdminFuncionario";
	}

	@RequestMapping("mostraFuncionario")
	public String mostra(Long idFuncionario, Model model) {
		model.addAttribute("funcionario", dao.buscaPorId(idFuncionario));
		return "jsp/mostra-funcionario";
	}
	
	@RequestMapping("alteraFuncionario")
	public String altera(Funcionario funcionario){
		dao.altera(funcionario);
		return "redirect:AdminFuncionario";
	}

	@RequestMapping("AdminFuncionario")
	public String adminLista(Model model) {
		model.addAttribute("funcionarios", dao.lista());
		return "jsp/admin-funcionario";
	}

	@RequestMapping("novoFuncionario")
	public String form() {
		return "jsp/adiciona-funcionario";
	}

	
	@RequestMapping("adicionaFuncionario")
	public String adiciona(@Valid Funcionario funcionario, Endereco endereco, BindingResult result) {

		if (result.hasFieldErrors("nome")) {
			return "jsp/adiciona-funcionario";
		}

		dao.adiciona(funcionario, endereco);
		return "jsp/adicionada";
	}

}
