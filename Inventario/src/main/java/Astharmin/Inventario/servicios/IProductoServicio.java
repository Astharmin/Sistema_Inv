package Astharmin.Inventario.servicios;

import Astharmin.Inventario.modelo.Producto;

import java.util.List;

public interface IProductoServicio {
    public List<Producto> listarProductos();

    public Producto buscarProductoId(Integer idProducto);

    public Producto guardarProducto(Producto producto);

    public void eliminarProductoId(Integer idProducto);
}
