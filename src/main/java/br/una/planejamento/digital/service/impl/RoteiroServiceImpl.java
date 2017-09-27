package br.una.planejamento.digital.service.impl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.una.planejamento.digital.model.Roteiro;
import br.una.planejamento.digital.repository.Roteiros;
import br.una.planejamento.digital.service.RoteiroService;

@Service
public class RoteiroServiceImpl implements RoteiroService {
	@Autowired
	private Roteiros roteiros;
	
	@Override
	public List<Roteiro> listar() {
		return roteiros.findAll();
	}

	@Override
	public Roteiro buscar(Long id) throws NoSuchElementException {
		Roteiro roteiro = roteiros.findOne(id);
		if (roteiro == null) {
			throw new NoSuchElementException();
		}
		return roteiro;
	}

	@Override
	public Roteiro criar(Roteiro roteiro) 
			throws IllegalArgumentException {
		
		if (roteiro == null || roteiro.getId() != null) {
			throw new IllegalArgumentException("Roteiro inválido");
		}
		
		return roteiros.save(roteiro);
	}

	@Override
	public Roteiro atualizar(Roteiro roteiro) 
			throws IllegalArgumentException {
		Roteiro atual = roteiros.findOne(roteiro.getId());
		if (atual == null) {
			throw new IllegalArgumentException("Roteiro nao existe");
		}
		return roteiros.save(roteiro);
	}

	@Override
	public void remover(Long idRoteiro) throws IllegalArgumentException {
		roteiros.delete(idRoteiro);
	}

}
