package com.example.atividade_pedido.Controller;

import com.example.atividade_pedido.Dto.ItemPedidoRequisicaoDto;
import com.example.atividade_pedido.Dto.ItemPedidoRespostaDto;
import com.example.atividade_pedido.Service.ItemPedidoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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
}