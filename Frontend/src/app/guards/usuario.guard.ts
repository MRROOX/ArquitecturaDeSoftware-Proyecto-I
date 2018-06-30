import { CanActivate, Router } from "@angular/router";
import { Injectable } from "@angular/core";
import { AuthService } from "../services/auth.service";
import { Token } from "../models/token";

@Injectable({
    providedIn: 'root'
})
export class UsuarioGuard implements CanActivate {

    public constructor(
        private router: Router,
        private authService: AuthService
    ) {

    }

    public canActivate(): boolean {

        let token: Token = this.authService.getToken();

        if (this.authService.isAuthenticated()) {

            if ( token.usuario.rol.id == 1 ) {
                return true;
            } else if ( token.usuario.rol.id == 2 ) {
                this.router.navigate(["/mod"]);
            }
            
            return false;
        }

        return true;
        
    }

}