package com.modelaai.api.dtos;

public record CarDTO(
    String modelo,
    String fabricante,
    String dataFabricacao,
    int valor,
    int anoModelo
) {}
