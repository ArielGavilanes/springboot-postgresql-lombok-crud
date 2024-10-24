package com.insti.primer_crud.products.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class ProductDTO {

    @NotEmpty(message = "El nombre no puede estar vacío")
    @Size(min = 5, message = "El nombre deberia tener al menos 2 caracteres")
    private String nombre;

    @NotNull(message = "El precio no puede estar vacio")
    @Positive(message = "El precio debe ser mayor que 0")
    private Integer precio;
}
