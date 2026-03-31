package com.programacion4.unidad4ej5.config.validators;

import com.programacion4.unidad4ej5.config.anotations.olderThanEigthteen;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class olderThanEigthteenValidator implements ConstraintValidator<olderThanEigthteen, Date> {

    @Override
    public boolean isValid(Date value, ConstraintValidatorContext context) {
        if (value == null) {
            return true; // dejás que @NotNull se encargue si querés obligar valor
        }

        LocalDate fechaNacimiento = value.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();

        LocalDate hoy = LocalDate.now();

        return fechaNacimiento.plusYears(18).isBefore(hoy)
                || fechaNacimiento.plusYears(18).isEqual(hoy);
    }
}
