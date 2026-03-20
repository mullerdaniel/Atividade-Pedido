package com.example.atividade_pedido.Mapper;

import com.example.atividade_pedido.Dto.PedidoRequisicaoDto;
import com.example.atividade_pedido.Dto.PedidoRespostaDto;
import com.example.atividade_pedido.Model.Pedido;

public class PedidoMapper {

    public static Pedido toModel(PedidoRequisicaoDto pedidoRequisicao) {
        Pedido pedido = new Pedido();

        pedido.setData_pedido(pedidoRequisicao.data_pedido());

        return pedido;
    }

    public static PedidoRespostaDto toResposta(Pedido pedido) {
        return new PedidoRespostaDto(
                pedido.getId(),
                pedido.getData_pedido()
        );
    }
}
