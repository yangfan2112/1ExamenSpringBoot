package edu.cesur.fullstack.services;

import java.util.ArrayList;

import edu.cesur.fullstack.models.ArtworkDTO;

public interface ArtworkService {

	ArrayList< ArtworkDTO > getAllArtworks(); //Retorna una lista con todas las obras de arte.
	void createArtwork(ArtworkDTO artworkDTO); //Guarda una nueva obra de arte basada en los datos de artworkDTO.
}
