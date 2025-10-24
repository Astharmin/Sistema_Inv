package Astharmin.Inventario.controlador;

import Astharmin.Inventario.excepcion.RecursoNoEncontrado;
import Astharmin.Inventario.modelo.Producto;
import Astharmin.Inventario.servicios.ProductoServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//http://localhost:8080/inventario_app
@RequestMapping("inventario-app")
@CrossOrigin(value = "http://localhost:4200")
public class ProductoControlador {
    private static final Logger logger =
            LoggerFactory.getLogger(ProductoControlador.class);

    @Autowired
    private ProductoServicio productoServicio;

    //http://localhost:8080/inventario-app/productos
    @GetMapping("/productos")
    public List<Producto> obtenerProductos(){
        List<Producto> productos = this.productoServicio.listarProductos();
        logger.info("Productos obtenidos:");
        productos.forEach((producto -> logger.info(producto.toString())));
        return productos;
    }

    @PostMapping("/productos")
    public Producto agregarProducto(@RequestBody Producto producto){
        logger.info("Producto agregado: " + producto);
        return this.productoServicio.guardarProducto(producto);
    }

    @GetMapping("/productos/{id}")
    public ResponseEntity<Producto> obtenerProductoId(
            @PathVariable int id){
        Producto producto =
                this.productoServicio.buscarProductoId(id);
        if (producto != null)
            return ResponseEntity.ok(producto);
        else
           throw new RecursoNoEncontrado("no se encontro el producto" + id);
    }

    @PutMapping("/productos/{id}")
    public ResponseEntity<Producto> actualizarProducto(
            @PathVariable int id,
            @RequestBody Producto detallesProducto){
        Producto producto = this.productoServicio.
                buscarProductoId(id);
        producto.setDescripcion(detallesProducto.getDescripcion());
        producto.setPrecio(detallesProducto.getPrecio());
        producto.setExistencia(detallesProducto.getExistencia());
        this.productoServicio.
                guardarProducto(producto);
        return ResponseEntity.ok(producto);
    }

}
