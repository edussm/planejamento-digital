package br.una.planejamento.digital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.una.planejamento.digital.model.Roteiro;

public interface Roteiros extends JpaRepository<Roteiro, Long> {
}
