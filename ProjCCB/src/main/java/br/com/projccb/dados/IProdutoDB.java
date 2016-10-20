package br.com.projccb.dados;

import java.util.List;

import br.com.projccb.model.Produto;

public interface IProdutoDB {
	  Produto buscaPorId(Long id);
	  List<Produto> lista();
	  void adiciona(Produto t);
	  void altera(Produto t);
	  void remove(Produto t);
	  void finaliza(Long id);
}
