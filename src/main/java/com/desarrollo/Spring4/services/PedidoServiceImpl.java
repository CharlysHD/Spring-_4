package com.desarrollo.Spring4.services;

import com.desarrollo.Spring4.entities.Pedido;
import com.desarrollo.Spring4.repositories.BaseRepository;
import com.desarrollo.Spring4.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl extends BaseServiceImpl<Pedido, Long> implements PedidoService{
    @Autowired
    private PedidoRepository pedidoRepository;
    public PedidoServiceImpl(BaseRepository<Pedido, Long> baseRepository) {
        super(baseRepository);
    }
}
