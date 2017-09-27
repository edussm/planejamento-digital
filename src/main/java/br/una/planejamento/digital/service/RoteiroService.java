package br.una.planejamento.digital.service;

import java.util.List;
import java.util.NoSuchElementException;

import br.una.planejamento.digital.model.Roteiro;

public interface RoteiroService {
	
	public List<Roteiro> listar();
	
	public Roteiro buscar(Long id) throws NoSuchElementException;
	
	public Roteiro criar(Roteiro roteiro) throws IllegalArgumentException;
	
	public Roteiro atualizar(Roteiro roteiro) throws IllegalArgumentException;
	
	public void remover(Long idRoteiro) throws IllegalArgumentException;

}
