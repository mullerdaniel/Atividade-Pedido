package com.example.atividade_pedido.Mapper;

import com.example.atividade_pedido.Dto.PedidoRequisicao;
import com.example.atividade_pedido.Dto.PedidoResposta;
import com.example.atividade_pedido.Model.Pedido;

public class PedidoMapper {

    public static Pedido toModel(PedidoRequisicao pedidoRequisicao) {
        Pedido pedido = new Pedido();

        pedido.setData_pedido(pedidoRequisicao.data_pedido());

        return pedido;
    }

    public static PedidoResposta toResposta(Pedido pedido) {
        return new PedidoResposta(
                pedido.getId(),
                pedido.getData_pedido()
        );
    }
}
