<<<<<<< HEAD
package com.desarrollo.Spring3.controllers;

import com.desarrollo.Spring3.entities.VentaFactura;
import com.desarrollo.Spring3.services.VentaFacturaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/ventafactura")
public class VentaFacturaController extends BaseControllerImpl<VentaFactura, VentaFacturaServiceImpl>{
}
=======
package com.desarrollo.Spring3.controllers;

import com.desarrollo.Spring3.entities.VentaFactura;
import com.desarrollo.Spring3.services.VentaFacturaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/ventafactura")
public class VentaFacturaController extends BaseControllerImpl<VentaFactura, VentaFacturaServiceImpl>{
}
>>>>>>> e6cc6e5 (agrego controladores y servicios y las querys)
