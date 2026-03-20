package com.example.atividade_pedido.Service;

import com.example.atividade_pedido.Dto.ItemPedidoRequisicaoDto;
import com.example.atividade_pedido.Dto.ItemPedidoRespostaDto;
import com.example.atividade_pedido.Mapper.ItemPedidoMapper;
import com.example.atividade_pedido.Model.ItemPedido;
import com.example.atividade_pedido.Model.Pedido;
import com.example.atividade_pedido.Repository.ItemPedidoRepository;
import com.example.atividade_pedido.Repository.PedidoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemPedidoService {

    private final ItemPedidoRepository repository;
    private final PedidoRepository pedidoRepository;
    private final ItemPedidoMapper mapper;

    public ItemPedidoRespostaDto criarItem(ItemPedidoRequisicaoDto dto){

        Pedido pedido = pedidoRepository.findById(dto.getPedidoId())
                .orElseThrow(() -> new RuntimeException("Pedido não encontrado"));

        ItemPedido item = mapper.toEntity(dto);
        item.setPedido(pedido);

        ItemPedido salvo = repository.save(item);

        return mapper.toDto(salvo);
    }
}