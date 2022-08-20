package com.temaCinco;

import com.temaCinco.model.Coche;
import com.temaCinco.service.cocheCrud.CocheCrud;
import com.temaCinco.service.cocheCrud.ICocheCrud;

public class Main {

    public static void main(String[] args) {

        ICocheCrud icocheCrud = new CocheCrud();
        System.out.println(String.format("el tamanio de la lista es: %d", icocheCrud.findAll().size()));
        icocheCrud.save(new Coche(4l, "nana", "hsgshgs", "gaaga"));
        System.out.println(String.format("el tamanio de la lista es: %d", icocheCrud.findAll().size()));
    }
}
