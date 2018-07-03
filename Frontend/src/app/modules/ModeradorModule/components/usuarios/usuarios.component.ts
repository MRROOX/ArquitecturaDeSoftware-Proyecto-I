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

}