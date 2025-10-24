import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Producto } from '../producto';
import { ProductoService } from '../producto.service';

@Component({
  selector: 'app-producto-lista',
  standalone: false,
  templateUrl: './producto-lista.component.html'
})
export class ProductoListaComponent {
  poductos: Producto[];
  constructor(private productoServicio: ProductoService, 
    private enrutador: Router) {}
  
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

  editarProducto(id: number){
    this.enrutador.navigate(['editar-producto', id]);
  }

  eliminarProducto(id: number){
    this.productoServicio.eliminarProducto(id).subscribe(
      {
        next: (datos) => this.obtenerProductos(),
        error: (errores) => console.log(errores)  
      }
    );
  }
}
