package br.una.planejamento.digital.service;

import java.util.List;
import java.util.NoSuchElementException;

import br.una.planejamento.digital.model.Atividade;

public interface AtividadeService {
	
	public List<Atividade> listar();
	
	public Atividade buscar(Long id) throws NoSuchElementException;
	
	public Atividade criar(Atividade atividade) throws IllegalArgumentException;
	
	public Atividade atualizar(Atividade atividade) throws IllegalArgumentException;
	
	public void remover(Long idAtividade) throws IllegalArgumentException;

}
