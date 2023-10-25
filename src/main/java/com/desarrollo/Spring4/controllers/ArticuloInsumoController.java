package com.desarrollo.Spring4.controllers;

import com.desarrollo.Spring4.entities.ArticuloInsumo;
import com.desarrollo.Spring4.services.ArticuloInsumoServiceImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/articuloinsumo")
public class ArticuloInsumoController extends BaseControllerImpl<ArticuloInsumo, ArticuloInsumoServiceImpl>{

    @GetMapping("/search")
    public ResponseEntity<?> search(@RequestParam String filtro) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.search(filtro));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" +e.getMessage() + "\"}"));
        }
    }

    @GetMapping("/searchPaged")
    public ResponseEntity<?>search(@RequestParam String filtro, Pageable pageable) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.search(filtro,pageable));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" +e.getMessage() + "\"}"));
        }
    }
}