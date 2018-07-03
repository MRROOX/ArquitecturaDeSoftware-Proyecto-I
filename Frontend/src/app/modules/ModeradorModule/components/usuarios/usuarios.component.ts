import { Component } from "@angular/core";
import { UsuarioService } from "../../../../services/usuario.service";
import { Usuario } from "../../../../models/usuario";

@Component({
    selector: 'usuarios',
    templateUrl: 'usuarios.component.html'
})
export class UsuariosComponent {

    // Lista de usuarios
    public usuarios: Usuario[];

    public constructor(
        private usuarioService: UsuarioService
    ) {
        // Obtener lista de usuarios
        this.usuarioService.query().subscribe(
            Response => {
                this.usuarios = Response;
            }
        );
    }

    public deleteUsuario(usuario: Usuario) {
        // Eliminar usuario indicado
        this.usuarioService.delete(usuario.id).subscribe(
            Response => {
                // Buscar indice de usuario
                let index = this.usuarios.indexOf(usuario);

                // Si el usuario está en la lista
                if ( index >= 0 ) {
                    // Quitar de la lista
                    this.usuarios.splice(index, 1);

                    alert("El usuario '" + usuario.nombre + "' ha sido eliminado");
                }
            }
        );
    }

}