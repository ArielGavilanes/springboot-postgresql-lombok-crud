package com.insti.primer_crud.products.dto;

import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UpdateProductDTO {

    @Size(min = 5, message = "El nombre deberia tener al menos 5 caracteres")
    private String nombre;

    @Positive(message = "El precio debe ser mayor que 0")
    private Integer precio;
}
