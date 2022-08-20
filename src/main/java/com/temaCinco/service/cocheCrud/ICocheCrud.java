package com.temaCinco.service.cocheCrud;

import com.temaCinco.model.Coche;

import java.util.List;

public interface ICocheCrud {
    public void save(Coche miCoche);
    public List<Coche> findAll();
    public void delete(Coche miCoche);
}
