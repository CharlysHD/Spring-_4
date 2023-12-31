package com.desarrollo.Spring4.controllers;

import com.desarrollo.Spring4.entities.DetalleProducto;
import com.desarrollo.Spring4.services.DetalleProductoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/detalleproducto")
public class DetalleProductoController extends BaseControllerImpl<DetalleProducto, DetalleProductoServiceImpl>{
}
