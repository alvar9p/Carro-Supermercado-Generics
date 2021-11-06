
public class ClaseMain {

    public static void main(String[] args) {
        BolsaSupermercado<Lacteo> lacteos = new BolsaSupermercado<>();
        BolsaSupermercado<Fruta> frutas = new BolsaSupermercado<>();
        BolsaSupermercado<Limpieza> limpieza = new BolsaSupermercado<>();
        BolsaSupermercado<NoPerecible> noPerecibles = new BolsaSupermercado<>();

        lacteos.addProducto(new Lacteo("leche", 75.0, 1, 11));
        lacteos.addProducto(new Lacteo("yogur", 63.0, 2, 3));
        lacteos.addProducto(new Lacteo("chocolatada", 92.0, 1, 9));
        lacteos.addProducto(new Lacteo("queso", 80.0, 1, 4));
        lacteos.addProducto(new Lacteo("ricota", 51.0, 1, 5));

        frutas.addProducto(new Fruta("manzana", 45.0, 1, "rojo"));
        frutas.addProducto(new Fruta("banana", 36.0, 1, "amarilla"));
        frutas.addProducto(new Fruta("anana", 28.0, 1, "amarilla"));
        frutas.addProducto(new Fruta("mandarina", 30.0, 1, "naranja"));
        frutas.addProducto(new Fruta("kiwi", 68.0, 1, "marron"));

        limpieza.addProducto(new Limpieza("lavandina", 130.0, "Agua,Fragancia", 2));
        limpieza.addProducto(new Limpieza("detergente", 95.0, "Etanol,Agua,Agente de limpieza", 1));
        limpieza.addProducto(new Limpieza("insecticida", 100.0, "Propelentes,Enmascarante,Agua", 0.360));
        limpieza.addProducto(new Limpieza("lavandina en gel", 123.0, "Tensioactivo anfotero,Regulador de ph,Perfume", 1.5));
        limpieza.addProducto(new Limpieza("fragancia ambiente", 79.0, "Fragancia,Agua", 3));

        noPerecibles.addProducto(new NoPerecible("arroz", 64.0, 1, 36));
        noPerecibles.addProducto(new NoPerecible("fideo", 58.0, 1, 57));
        noPerecibles.addProducto(new NoPerecible("lentejas", 43.0, 1, 9));
        noPerecibles.addProducto(new NoPerecible("maiz", 27.0, 1, 17));
        noPerecibles.addProducto(new NoPerecible("polenta", 35.0, 1, 23));

        System.out.println("Compras");
        for (Lacteo l : lacteos.getProductos()) {
            System.out.println("Nombre= " + l.getNombre() + " Precio= $" + l.getPrecio() + " Cantidad= " + l.getCantidad() + " Proteinas= " + l.getProteinas());
        }
        System.out.println();

        for (Fruta f : frutas.getProductos()) {
            System.out.println("Fruta= " + f.getNombre() + " Precio= $" + f.getPrecio() + " Kilos= " + f.getPeso() + " Color= " + f.getColor());
        }
        System.out.println();

        for (Limpieza l : limpieza.getProductos()) {
            System.out.println("Nombre= " + l.getNombre() + " Precio= $" + l.getPrecio() + " Componentes= " + l.getComponentes() + " Litros= " + l.getLitros());
        }
        System.out.println();

        for (NoPerecible p : noPerecibles.getProductos()) {
            System.out.println("Nombre= " + p.getNombre() + " Precio= $" + p.getPrecio() + " Kilos= " + p.getContenido() + " Calorias= " + p.getCalorias());
        }
    }
}
