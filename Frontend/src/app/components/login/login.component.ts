import { Component } from "@angular/core";
import { Usuario } from "../../models/usuario";
import { AuthService } from "../../services/auth.service";
import { Router } from "@angular/router";

@Component({
    selector: 'login',
    templateUrl: 'login.component.html',
    styleUrls: ['login.component.css']
})
export class LoginComponent {

    // Usuario a iniciar sesión
    public usuario: Usuario = new Usuario();

    // Indicar que hay error al iniciar sesión
    public error: string;

    public constructor(
        private router: Router,
        private authService: AuthService
    ) {

    }

    public onSubmit(): void {
        // Validar las entradas
        if (this.usuario.nombre.length > 0 && this.usuario.password.length > 0) {
            // Obtener autorización
            this.authService.login(this.usuario).subscribe(
                Response => {
                    // Si hubo error al iniciar sesión
                    if (Response.error != null) {
                        // Guardar error
                        this.error = Response.error;

                    } else {
                        // Inicio de sesión exitoso
                        this.authService.setToken(Response);

                        // Redireccionar a ruta correspondiente
                        if (Response.usuario.rol.id == 1) {
                            this.router.navigate(["/usr"]);
                        } else if (Response.usuario.rol.id == 2) {
                            this.router.navigate(["/mod"]);
                        }
                    }
                },
                Error => {
                    // Error al iniciar sesión
                    this.error = Error;
                }
            );
        }

    }

}