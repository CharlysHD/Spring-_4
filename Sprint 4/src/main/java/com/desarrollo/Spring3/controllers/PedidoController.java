<<<<<<< HEAD
package com.desarrollo.Spring3.controllers;

import com.desarrollo.Spring3.entities.Pedido;
import com.desarrollo.Spring3.services.PedidoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/pedido")
public class PedidoController extends BaseControllerImpl<Pedido, PedidoServiceImpl>{
}
=======
package com.desarrollo.Spring3.controllers;

import com.desarrollo.Spring3.entities.Pedido;
import com.desarrollo.Spring3.services.PedidoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/pedido")
public class PedidoController extends BaseControllerImpl<Pedido, PedidoServiceImpl>{
}
>>>>>>> e6cc6e5 (agrego controladores y servicios y las querys)
