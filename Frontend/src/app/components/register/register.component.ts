import { Component } from "@angular/core";
import { Usuario } from "../../models/usuario";
import { UsuarioService } from "../../services/usuario.service";
import { Router } from "@angular/router";

@Component({
    selector: 'registercomponent',
    templateUrl: 'register.component.html',
    styleUrls: ['register.component.css']
})
export class RegisterComponent {

    // Modelo de usuario
    public usuario: Usuario = new Usuario();

    // Contraseña para confirmar
    public passwordConfirmar: string;

    // Error al registrarse
    public error: string;

    public constructor(
        private router: Router,
        private usuarioService: UsuarioService
    ) {

    }

    public onSubmit(): void {
        // Si los campos han sido llenados
        if ( this.usuario.nombre.length > 0 && this.usuario.correo.length > 0 && this.usuario.password.length > 0 ) {
            
            // Si las contraseñas calzan
            if (this.usuario.password == this.passwordConfirmar) {

                // Enviar usuario a backend
                this.usuarioService.save(this.usuario).subscribe(
                    Response => {
                        // El usuario se ha registrado
                        this.router.navigate(["login"]);
                    },
                    Error => {
                        // Error al registrarse
                        this.error = Error;
                    }
                );
            }

        }

    }

}