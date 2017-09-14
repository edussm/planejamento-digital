package br.una.planejamento.digital.service.impl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.una.planejamento.digital.model.Atividade;
import br.una.planejamento.digital.repository.Atividades;
import br.una.planejamento.digital.service.AtividadeService;

@Service
public class AtividadeServiceImpl implements AtividadeService {
	@Autowired
	private Atividades atividades;
	
	@Override
	public List<Atividade> listar() {
		return atividades.findAll();
	}

	@Override
	public Atividade buscar(Long id) throws NoSuchElementException {
		Atividade atividade = atividades.findOne(id);
		if (atividade == null) {
			throw new NoSuchElementException();
		}
		return atividade;
	}

	@Override
	public Atividade criar(Atividade atividade) 
			throws IllegalArgumentException {
		
		if (atividade == null || atividade.getId() != null) {
			throw new IllegalArgumentException("Atividade inválida");
		}
		
		return atividades.save(atividade);
	}

	@Override
	public Atividade atualizar(Atividade atividade) 
			throws IllegalArgumentException {
		Atividade atual = atividades.findOne(atividade.getId());
		if (atual == null) {
			throw new IllegalArgumentException("Atividade nao existe");
		}
		return atividades.save(atividade);
	}

	@Override
	public void remover(Long idAtividade) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		atividades.delete(idAtividade);
	}

}
