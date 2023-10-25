<<<<<<< HEAD
package com.desarrollo.Spring3.controllers;

import com.desarrollo.Spring3.entities.DetalleFactura;
import com.desarrollo.Spring3.services.DetalleFacturaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/detallefactura")
public class DetalleFacturaController extends BaseControllerImpl<DetalleFactura, DetalleFacturaServiceImpl>{
}

=======
package com.desarrollo.Spring3.controllers;

import com.desarrollo.Spring3.entities.DetalleFactura;
import com.desarrollo.Spring3.services.DetalleFacturaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/detallefactura")
public class DetalleFacturaController extends BaseControllerImpl<DetalleFactura, DetalleFacturaServiceImpl>{
}

>>>>>>> e6cc6e5 (agrego controladores y servicios y las querys)
