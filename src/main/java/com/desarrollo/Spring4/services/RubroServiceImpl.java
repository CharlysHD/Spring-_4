package com.desarrollo.Spring4.services;

import com.desarrollo.Spring4.entities.Rubro;
import com.desarrollo.Spring4.repositories.BaseRepository;
import com.desarrollo.Spring4.repositories.RubroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RubroServiceImpl extends BaseServiceImpl<Rubro, Long> implements RubroService{
    @Autowired
    private RubroRepository rubroRepository;
    public RubroServiceImpl(BaseRepository<Rubro, Long> baseRepository) {
        super(baseRepository);
    }
}