import { Component } from '@angular/core';
import { Producto } from '../producto';
import { ProductoService } from '../producto.service';

@Component({
  selector: 'app-producto-lista',
  standalone: false,
  templateUrl: './producto-lista.component.html'
})
export class ProductoListaComponent {
  poductos: Producto[];
  constructor(private productoServicio: ProductoService) { }
  ngOnInit(){
    this.obtenerProductos();
  }
  private obtenerProductos(){
    this.productoServicio.obtenerProductos().subscribe(
      (datos => {
        this.poductos = datos;
      })
    );
  }
}
