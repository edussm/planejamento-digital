package br.una.planejamento.digital.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.una.planejamento.digital.model.Roteiro;
import br.una.planejamento.digital.service.RoteiroService;

@RestController
@RequestMapping("/api/v1/roteiros")
public class RoteiroResource {
	
	@Autowired
	private RoteiroService roteiroService;
	
	@GetMapping
	public List<Roteiro> listar() {
		return roteiroService.listar();
	}
	
	@GetMapping("/{id}")
	public Roteiro buscar(@PathVariable Long id) {
		return roteiroService.buscar(id);
	}
	
	@PostMapping
	public Roteiro criar(@RequestBody Roteiro roteiro) {
		return roteiroService.criar(roteiro);
	}
	
	@PutMapping("/{id}")
	public Roteiro alterar(@PathVariable Long id, @RequestBody Roteiro roteiro) {
		return roteiroService.atualizar(roteiro);
	}
	
	@DeleteMapping("/{id}")
	public void remover(@PathVariable Long id) {
		roteiroService.remover(id);
	}
}
