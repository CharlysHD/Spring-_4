<<<<<<< HEAD
package com.desarrollo.Spring3.services;

import com.desarrollo.Spring3.entities.VentaFactura;
import com.desarrollo.Spring3.repositories.BaseRepository;
import com.desarrollo.Spring3.repositories.VentaFacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaFacturaServiceImpl extends BaseServiceImpl<VentaFactura, Long> implements VentaFacturaService{
    @Autowired
    private VentaFacturaRepository ventaFacturaRepository;
    public VentaFacturaServiceImpl(BaseRepository<VentaFactura, Long> baseRepository) {
        super(baseRepository);
    }
}
=======
package com.desarrollo.Spring3.services;

import com.desarrollo.Spring3.entities.VentaFactura;
import com.desarrollo.Spring3.repositories.BaseRepository;
import com.desarrollo.Spring3.repositories.VentaFacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaFacturaServiceImpl extends BaseServiceImpl<VentaFactura, Long> implements VentaFacturaService{
    @Autowired
    private VentaFacturaRepository ventaFacturaRepository;
    public VentaFacturaServiceImpl(BaseRepository<VentaFactura, Long> baseRepository) {
        super(baseRepository);
    }
}
>>>>>>> e6cc6e5 (agrego controladores y servicios y las querys)
