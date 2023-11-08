package edu.cesur.fullstack.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cesur.fullstack.exceptions.ArtworkCreationException;
import edu.cesur.fullstack.models.ArtistDTO;
import edu.cesur.fullstack.models.ArtworkDTO;


@Service
public class ArtworkServiceImpl implements ArtworkService{

	ArrayList<ArtworkDTO> obras = new ArrayList<>();

	ArtworkDTO ar = new ArtworkDTO(1, "Titulo1", "hola soy la descripción uno", 1);

	ArtworkDTO ar2 = new ArtworkDTO(2, "Titulo2", "hola soy la descripción dos", 2);

	ArtworkDTO ar3 = new ArtworkDTO(3, "Titulo3", "hola soy la descripción tres", 1);

	ArtworkDTO ar4 = new ArtworkDTO(4,"Titulo4", "hola soy la descripción cuatro",3);

	public ArtworkServiceImpl() {

	obras.add(ar);

	obras.add(ar2);

	obras.add(ar3);

	obras.add(ar4);

	}
	@Override
	public ArrayList<ArtworkDTO> getAllArtworks() {
		
		return obras;
	}

	@Autowired
	ArtistService artistService;
	@Override
	public void createArtwork(ArtworkDTO artworkDTO) {
		ArtistDTO artist = artistService.getArtistById(artworkDTO.getArtistld());
		if(artist == null) {
			throw new ArtworkCreationException("El artista no existe en la lista de elite.");
		}else {
			obras.add(artworkDTO);
		}
	}

	
}
