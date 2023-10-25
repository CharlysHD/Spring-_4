<<<<<<< HEAD
package com.desarrollo.Spring3.controllers;

import com.desarrollo.Spring3.entities.Empleado;
import com.desarrollo.Spring3.services.EmpleadoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/empleado")
public class EmpleadoController extends BaseControllerImpl<Empleado, EmpleadoServiceImpl>{
}
=======
package com.desarrollo.Spring3.controllers;

import com.desarrollo.Spring3.entities.Empleado;
import com.desarrollo.Spring3.services.EmpleadoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/empleado")
public class EmpleadoController extends BaseControllerImpl<Empleado, EmpleadoServiceImpl>{
}
>>>>>>> e6cc6e5 (agrego controladores y servicios y las querys)
