package edu.cesur.fullstack.models;

import edu.cesur.fullstack.validators.ArtworkDescriptionValidator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArtworkDTO {

	private Integer id;
	private String title;
	
	@ArtworkDescriptionValidator
	private String description;
	private Integer artistld;
	
}
