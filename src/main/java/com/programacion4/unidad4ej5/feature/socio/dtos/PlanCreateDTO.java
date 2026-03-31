package com.programacion4.unidad4ej5.feature.socio.dtos;

import jakarta.validation.constraints.*;

import java.util.List;

public class PlanCreateDTO {

    @NotBlank
    @NotNull
    @Size(min = 10, max = 200)
    private String objective;

    @NotNull
    @Min(1)
    @Max(7)
    private int freqWeek;

    @NotNull
    @Min(30)
    @Max(250)
    private double weigth;

    @NotNull
    @Min(1)
    @DecimalMax(inclusive = true, value = "2.5")
    private double heigth;

    @NotNull
    @NotEmpty
    @Size(min = 3)
    private List<String> exercise;
}
