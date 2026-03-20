package com.example.atividade_pedido.Repository;

import com.example.atividade_pedido.Model.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Long> {
}