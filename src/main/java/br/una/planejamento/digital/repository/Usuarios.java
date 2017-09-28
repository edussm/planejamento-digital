package br.una.planejamento.digital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.una.planejamento.digital.model.Usuario;

public interface Usuarios extends JpaRepository<Usuario, String> {
}
