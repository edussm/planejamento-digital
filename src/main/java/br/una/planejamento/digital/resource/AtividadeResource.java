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

import br.una.planejamento.digital.model.Atividade;
import br.una.planejamento.digital.service.AtividadeService;

@RestController
@RequestMapping("/api/v1/atividades")
public class AtividadeResource {
	
	@Autowired
	private AtividadeService atividadeService;
	
	@GetMapping
	public List<Atividade> listar() {
		return atividadeService.listar();
	}
	
	@GetMapping("/{id}")
	public Atividade buscar(@PathVariable Long id) {
		return atividadeService.buscar(id);
	}
	
	@PostMapping
	public Atividade criar(@RequestBody Atividade atividade) {
		return atividadeService.criar(atividade);
	}
	
	@PutMapping("/{id}")
	public Atividade alterar(@PathVariable Long id, @RequestBody Atividade atividade) {
		return atividadeService.atualizar(atividade);
	}
	
	@DeleteMapping("/{id}")
	public void remover(@PathVariable Long id) {
		atividadeService.remover(id);
	}
}
