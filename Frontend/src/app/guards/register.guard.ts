import { CanActivate, Router } from "@angular/router";
import { Injectable } from "@angular/core";
import { AuthService } from "../services/auth.service";

@Injectable({
    providedIn: 'root'
})
export class RegisterGuard implements CanActivate {

    public constructor(
        private router: Router,
        private authService: AuthService
    ) {

    }

    public canActivate(): boolean {
        
        return !this.authService.isAuthenticated();

    }

}