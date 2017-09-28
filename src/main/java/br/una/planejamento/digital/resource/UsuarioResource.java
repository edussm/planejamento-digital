package br.una.planejamento.digital.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.una.planejamento.digital.model.Usuario;
import br.una.planejamento.digital.repository.Usuarios;

@RestController
@RequestMapping("/api/v1/usuarios")
public class UsuarioResource {
	
	@Autowired
	private Usuarios usuarios;
	
	@GetMapping
	public List<Usuario> listar() {
		return usuarios.findAll();
	}
}
