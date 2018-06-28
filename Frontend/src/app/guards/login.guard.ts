import { CanActivate, Router } from "@angular/router";
import { Injectable } from "@angular/core";

@Injectable({
    providedIn: 'root'
})
export class LoginGuard implements CanActivate {

    public constructor(
        private router: Router
    ) {

    }

    public canActivate(): boolean {

        return true;
        
    }

}