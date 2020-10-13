package br.com.integracao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.integracao.dao.ArtistaDAO;
import br.com.integracao.modelo.Artista;

@RestController
@CrossOrigin ("*")
public class ArtistaController {

	@Autowired
	private ArtistaDAO dao;
	
	
	
	@GetMapping("/artistas")
	public ResponseEntity<List<Artista>> exibirTodos() {
		List<Artista> lista = (List<Artista>) dao.findAll();
		if (lista.size()==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);
		
}
	@GetMapping("/artista/{id}")
	public ResponseEntity<Artista> getArtista(@PathVariable int id) {
		Artista resposta = dao.findById(id).orElse(null);
		if (resposta == null) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(resposta);
		
	}	
	@PostMapping("/novoartista")
	public ResponseEntity<Artista> cadastrar(@RequestBody Artista objeto) {
		try {
			dao.save(objeto);
			return ResponseEntity.ok(objeto);
		}catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(403).build();
		}
	}
	
	@GetMapping("/nacionalidade/{nac}")
	public ResponseEntity<List<Artista>> pesquisarNacionalidade(@PathVariable String nac) {
		List<Artista> lista = (List<Artista>) dao.findByNacionalidade(nac);
		if (lista.size()==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);
}
}
