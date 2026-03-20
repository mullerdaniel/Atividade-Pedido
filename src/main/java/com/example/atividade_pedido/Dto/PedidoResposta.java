package com.example.atividade_pedido.Dto;

import jakarta.validation.constraints.NotNull;

import java.util.Date;

public record PedidoResposta (
        @NotNull(message = "O pedido deve ter uma data")
        Date data_pedido
){
}

