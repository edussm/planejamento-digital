package br.una.planejamento.digital.resource;

import java.util.List;

import org.springframework.beans.BeanUtils;
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
import br.una.planejamento.digital.repository.Atividades;

@RestController
@RequestMapping("/api/v1/atividades")
public class AtividadeResource {
	
	@Autowired
	private Atividades atividades;
	
	@GetMapping
	public List<Atividade> listar() {
		return atividades.findAll();
	}
	
	@GetMapping("/{id}")
	public Atividade buscar(@PathVariable Long id) {
		return atividades.findOne(id);
	}
	
	@PostMapping
	public Atividade criar(@RequestBody Atividade atividade) {
		return atividades.save(atividade);
	}
	
	@PutMapping("/{id}")
	public Atividade alterar(@PathVariable Long id, @RequestBody Atividade atividade) {
		Atividade existente = atividades.findOne(id);
		
		BeanUtils.copyProperties(atividade, existente, "id");
		
		return atividades.save(existente);
	}
	
	@DeleteMapping("/{id}")
	public void remover(@PathVariable Long id) {
		atividades.delete(atividades.findOne(id));
	}
}
