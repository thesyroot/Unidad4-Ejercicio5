package com.programacion4.unidad4ej5.feature.socio.dtos;

import com.programacion4.unidad4ej5.config.anotations.olderThanEigthteen;
import jakarta.validation.constraints.*;

import java.util.Date;

public class SocioCreateDTO {

    @NotNull
    @NotBlank
    private String nombre;

    @NotNull
    @NotBlank
    private String apellido;

    @Email
    private String email;

    @Size(min = 8, max = 8)
    private String dni;

    @Past
    @olderThanEigthteen
    private Date fechaDeNacimiento;

    @Pattern(regexp="^\\+?[1-9]\\d{1,14}$")
    private String tel;
}
