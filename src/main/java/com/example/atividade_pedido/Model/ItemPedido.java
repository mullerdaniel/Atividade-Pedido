package com.example.atividade_pedido.Model;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "item_pedido")
public class ItemPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_produto", nullable = false)
    private String nomeProduto;

    @Column(nullable = false)
    private Integer quantidade;

    @Column(name = "preco_unitario", nullable = false)
    private Double precoUnitario;

    @ManyToOne
    @JoinColumn(name = "id_pedido")
    private Pedido pedido;
}