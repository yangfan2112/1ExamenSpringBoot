package edu.cesur.fullstack.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArtworkDTO {

	private Integer id;
	private String title;
	private String description;
	private Integer artistld;
	
}
