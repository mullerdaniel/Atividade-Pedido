package com.example.atividade_pedido.Controller;

import com.example.atividade_pedido.Dto.ItemPedidoRequisicaoDto;
import com.example.atividade_pedido.Dto.ItemPedidoRespostaDto;
import com.example.atividade_pedido.Model.ItemPedido;
import com.example.atividade_pedido.Service.ItemPedidoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/itens")
@RequiredArgsConstructor
public class ItemPedidoController {

    private final ItemPedidoService itemPedidoService;

    @PostMapping
    public ItemPedidoRespostaDto criarItem(
            @RequestBody ItemPedidoRequisicaoDto dto
    ){
        return itemPedidoService.criarItem(dto);
    }

    @GetMapping
    public List<ItemPedido> listarItemPedidos() {
        return itemPedidoService.listarItemPedidos();
    }

    @GetMapping("/{id}")
    public ItemPedido buscarItemPedidoPorId(@PathVariable Long id) {
        return itemPedidoService.buscarItemPedidoPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletarItemPedido(@PathVariable Long id) {
        itemPedidoService.deletarItemPedido(id);
    }
}