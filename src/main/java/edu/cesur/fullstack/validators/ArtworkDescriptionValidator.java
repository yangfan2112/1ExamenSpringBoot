package edu.cesur.fullstack.validators;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = ArtworkDescripcionValid.class)
public @interface ArtworkDescriptionValidator {
	String message() default "Descripción inválida." 
			+ " Debe contener al menos 5 palabras.";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	
}
