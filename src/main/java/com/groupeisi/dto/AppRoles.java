package com.groupeisi.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppRoles {
    private Integer id;
    @NotNull(message = "Le nom ne doit pas etre nul!")
    private String nom;
}