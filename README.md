# Tema Cinco Java Básico

## Enunciado del ejercicio:
- Crear una interfaz CocheCRUD.
- Crear una implementación CocheCRUDImpl que implemente la interfaz CocheCRUD.
- Como métodos de CocheCRUD podemos poner:
- save() findAll() delete() que simplemente impriman por consola el nombre del propio método.
- Desde una clase Main, Crear un objeto de tipo CocheCRUDImpl y llamar a cada uno de los métodos.

```sh
    ICocheCrud icocheCrud = new CocheCrud();
        System.out.println(String.format("el tamanio de la lista es: %d", icocheCrud.findAll().size()));
        icocheCrud.save(new Coche(4l, "nana", "hsgshgs", "gaaga"));
        System.out.println(String.format("el tamanio de la lista es: %d", icocheCrud.findAll().size()));
```