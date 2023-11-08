package edu.cesur.fullstack.validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ArtworkDescripcionValid implements ConstraintValidator<ArtworkDescriptionValidator, String> {

	@Override
	public void initialize(ArtworkDescriptionValidator constraintAnnotation) {
	}	

	@Override
	public boolean isValid(String valor, ConstraintValidatorContext context) {
		if (valor == null || valor.trim().isEmpty()) {

			return false;

			}

			String[] palabras = valor.trim().split("\\s+");

			return palabras.length >= 5;
	}
}
