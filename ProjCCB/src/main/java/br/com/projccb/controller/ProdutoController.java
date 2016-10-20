package br.com.projccb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.projccb.dados.IProdutoDB;
import br.com.projccb.model.Produto;

@Controller
public class ProdutoController {

	@Autowired
	IProdutoDB dao;

	@RequestMapping(value = "produto", method = RequestMethod.GET)
	public String form() {
		return "produto/index";
	}

	@RequestMapping(value = "addProduto", method = RequestMethod.GET)
	public String addProduto() {
		return "produto/cadastrarproduto";
	}

	@RequestMapping(value = "insertProduto")
	public String insert(Produto produto) {
		System.out.println("descricao: " + produto.getDescricao());
		System.out.println("marca: " + produto.getMarca());
		System.out.println("valor: " + produto.getValor());
		
		Produto p = new Produto();
		
		p.setDescricao(produto.getDescricao());
		p.setMarca(produto.getMarca());
		p.setValor(produto.getValor());
		
		dao.adiciona(p);
		//new ProdutoDB().adiciona(p);
		
		return "produto/index";
	}

}
