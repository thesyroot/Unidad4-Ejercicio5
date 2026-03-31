package com.programacion4.unidad4ej5.config.anotations;

import com.programacion4.unidad4ej5.config.validators.olderThanEigthteenValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = olderThanEigthteenValidator.class)
@Target({ ElementType.FIELD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface olderThanEigthteen {
    String message() default "No debe ser menor de 18 anios";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
