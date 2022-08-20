package com.temaCinco.service.cocheCrud;

import com.temaCinco.model.Coche;

import java.util.ArrayList;
import java.util.List;

public class CocheCrud implements ICocheCrud{
    private List<Coche> cocheList = new ArrayList<>();

    @Override
    public void save(Coche miCoche) {
        cocheList.add(miCoche);
    }

    @Override
    public List<Coche> findAll() {
        return cocheList;
    }

    @Override
    public void delete(Coche miCoche) {
        cocheList.remove(miCoche);

    }
}
