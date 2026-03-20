package com.example.atividade_pedido.Repository;

import com.example.atividade_pedido.Model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
