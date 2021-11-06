
import java.util.ArrayList;
import java.util.List;

public class BolsaSupermercado<T> {
    private List<T> productos;

    public BolsaSupermercado() {
        this.productos = new ArrayList<>();
    }

    public void addProducto(T producto){
        if(productos.size()<5){
            productos.add(producto);
        }
        else{
            System.err.println("La bolsa esta llena solo puede tener 5 productos");
            System.exit(1);
        }
    }

    public List<T> getProductos(){
        return productos;
    }
}