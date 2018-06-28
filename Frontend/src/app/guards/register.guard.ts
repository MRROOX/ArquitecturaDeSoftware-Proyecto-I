import { Injectable } from "@angular/core";
import { CanActivate } from "@angular/router";

@Injectable({
    providedIn: 'root'
})
export class RegisterGuard implements CanActivate {

    public canActivate(): boolean {
        
        return true;

    }

}