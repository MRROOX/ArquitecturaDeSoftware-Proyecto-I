import { Component } from "@angular/core";
import { AuthService } from "../../services/auth.service";
import { Router } from "@angular/router";

@Component({
    selector: 'app-root',
    templateUrl: 'moderador.component.html'
})
export class ModeradorComponent {

    // Indicar que se encuentra activa la barra izquierda
    public sidenav: boolean = false;

    public constructor(
        private authService: AuthService,
        private router: Router
    ) {

    }

    public toggleSidenav(): void {
        this.sidenav = !this.sidenav;
    }

    public cerrarSesion(): void {
        this.authService.removeToken();
        this.router.navigate(["/login"]);
    }
    
}