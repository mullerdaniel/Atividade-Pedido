package com.example.atividade_pedido.Dto;

import jakarta.validation.constraints.NotNull;

import java.util.Date;

public class PedidoRequisicao {

    @NotNull(message = "O pedido deve ter uma data")
    Date data_pedido;
}
