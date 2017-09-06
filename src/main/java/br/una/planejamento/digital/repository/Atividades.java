package br.una.planejamento.digital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.una.planejamento.digital.model.Atividade;

public interface Atividades extends JpaRepository<Atividade, Long> {

}
