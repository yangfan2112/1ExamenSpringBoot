package edu.cesur.fullstack.exceptions.handlers;

import org.springframework.web.bind.annotation.RestControllerAdvice;

import edu.cesur.fullstack.exceptions.ArtworkCreationException;

import java.net.URI;
import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalHandlerException {

	@ExceptionHandler( ArtworkCreationException.class)
	public ProblemDetail handleArtworkCreationException(ArtworkCreationException e) { 

		ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(HttpStatus.BAD_REQUEST, e.getMessage()); 
		problemDetail.setTitle("Art Exception Occurred");  
		problemDetail.setType(URI.create("http://cesurformacion.com"));
		problemDetail.setProperty("errorCategory", "Art");
		problemDetail.setProperty("timeStamp", Instant.now());

		return problemDetail;
	}
}
