package com.programacion4.unidad4ej5.feature.socio.dtos.request;

import jakarta.validation.constraints.*;

import java.util.Date;

public class PagoRequestDTO {

    private enum payType {
        EFECTIVO,
        DEBITO,
        CREDITO,
        TRANSFERENCIA
    }

    @Digits(integer = 9, fraction = 2)
    @DecimalMin(value = "1000.00")
    private double monto;

    @NotBlank
    @Pattern(regexp = "^PAY-[A-Z0-9]{4}-[A-Z0-9]{4}$")
    private String transactionCode;

    @Future
    private Date expireDate;

    @NotNull
    private payType tipoDePago;
}
