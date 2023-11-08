package edu.cesur.fullstack.services;

import edu.cesur.fullstack.models.ArtistDTO;

public interface ArtistService {

	ArtistDTO getArtistById(Integer id); //Retorna un ArtistDTO basado en su ID o null si no existe.
}
