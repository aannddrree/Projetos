package br.com.projccb.dados;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.projccb.model.Produto;

@Service
public class ProdutoDB implements IProdutoDB {

	@PersistenceContext
	EntityManager manager;


	public Produto buscaPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Produto> lista() {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional(propagation= Propagation.REQUIRED, rollbackFor=Exception.class) 
	public void adiciona(Produto t) {
		System.out.println("entrei");
		manager.persist(t);
		//manager.getTransaction().commit();
	}

	public void altera(Produto t) {
		// TODO Auto-generated method stub
		
	}

	public void remove(Produto t) {
		// TODO Auto-generated method stub
		
	}

	public void finaliza(Long id) {
		// TODO Auto-generated method stub
		
	}
}
