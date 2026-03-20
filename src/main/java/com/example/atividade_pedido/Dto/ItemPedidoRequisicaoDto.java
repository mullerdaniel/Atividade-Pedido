package com.example.atividade_pedido.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemPedidoRequisicaoDto {

    private String nomeProduto;
    private Integer quantidade;
    private Double precoUnitario;
    private Long pedidoId;
}