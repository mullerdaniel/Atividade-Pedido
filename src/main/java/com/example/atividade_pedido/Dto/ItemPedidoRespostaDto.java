package com.example.atividade_pedido.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemPedidoRespostaDto {

    private Long id;
    private String nomeProduto;
    private Integer quantidade;
    private Double precoUnitario;
}