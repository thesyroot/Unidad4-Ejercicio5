package com.programacion4.unidad4ej5.feature.socio.dtos;

import jakarta.validation.constraints.*;
import lombok.NonNull;

interface onCreate {}
interface onUpdate {}

public class SocioUpdateDTO {

    @Null(groups = {onCreate.class})
    @NotNull(groups = {onUpdate.class})
    private int id;

    @NotBlank
    @Pattern(regexp = "^(https?:\\/\\/)([a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,}(:\\d+)?(\\/[^\\s]*)?$")
    private String url;

    @NotBlank
    @Size(min = 3, max = 15)
    @Pattern(regexp = "^\\S+$")
    private String alias;
}
