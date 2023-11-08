package edu.cesur.fullstack.controllers;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import edu.cesur.fullstack.models.ArtworkDTO;
import edu.cesur.fullstack.services.ArtworkService;

@RestController
@RequestMapping("/arts")
public class ArtworkRestController {

	@Autowired
	ArtworkService artworkService;
	
	@GetMapping()
	public ResponseEntity<?> getAllArtworks(){
		return ResponseEntity.ok(artworkService.getAllArtworks());
	}
	
	@PostMapping()
	public ResponseEntity<?> createArtwork(@RequestBody @Validated ArtworkDTO artwork){ //ResponseEntity<?> se usa para manejar el codigo de estado //Se usa tambien @Validated porque en este método se gestiona validaciones
		
		artworkService.createArtwork(artwork);
		
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(artwork.getId())
				.toUri();
		
		return ResponseEntity.created(location).build();
	}
}
