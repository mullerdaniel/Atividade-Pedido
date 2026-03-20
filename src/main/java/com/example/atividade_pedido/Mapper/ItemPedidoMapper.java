package com.example.atividade_pedido.Mapper;

import com.example.atividade_pedido.Dto.ItemPedidoRequisicaoDto;
import com.example.atividade_pedido.Dto.ItemPedidoRespostaDto;
import com.example.atividade_pedido.Model.ItemPedido;
import org.springframework.stereotype.Component;

@Component
public class ItemPedidoMapper {

    public ItemPedido toEntity(ItemPedidoRequisicaoDto dto){
        ItemPedido item = new ItemPedido();
        item.setNomeProduto(dto.getNomeProduto());
        item.setQuantidade(dto.getQuantidade());
        item.setPrecoUnitario(dto.getPrecoUnitario());
        return item;
    }

    public ItemPedidoRespostaDto toDto(ItemPedido item){
        ItemPedidoRespostaDto dto = new ItemPedidoRespostaDto();
        dto.setId(item.getId());
        dto.setNomeProduto(item.getNomeProduto());
        dto.setQuantidade(item.getQuantidade());
        dto.setPrecoUnitario(item.getPrecoUnitario());
        return dto;
    }
}