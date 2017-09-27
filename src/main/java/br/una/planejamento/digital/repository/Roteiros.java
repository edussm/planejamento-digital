package br.una.planejamento.digital.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.una.planejamento.digital.model.Roteiro;

public interface Roteiros extends JpaRepository<Roteiro, Long> {
}
