package com.example.atividade_pedido.Service;

import com.example.atividade_pedido.Model.Pedido;
import com.example.atividade_pedido.Repository.PedidoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PedidoService {

    private final PedidoRepository pedidoRepository;

    // SALVAR O PEDIDO
    public Pedido criarPedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    // LISTAR TODOS OS PEDIDOS
    public List<Pedido> listarPedidos() {
        return pedidoRepository.findAll();
    }

    // BUSCAR PEDIDO POR ID
    public Pedido buscarPedidoPorId(Long id) {
        return pedidoRepository.findById(id).orElse(null);
    }

    // DELETAR UM PEDIDO PLR ID
    public void deletarPedido(Long id) {
        pedidoRepository.deleteById(id);
    }
}
