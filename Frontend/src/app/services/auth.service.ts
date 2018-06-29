import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { Usuario } from "../models/usuario";
import { Observable } from "rxjs";
import { GLOBAL } from "./global";
import { JwtHelperService } from "@auth0/angular-jwt";

@Injectable({
    providedIn: 'root'
})
export class AuthService {

    public constructor(
        private http: HttpClient,
        private jwt: JwtHelperService
    ) {

    }

    public isAuthenticated(): boolean {
        // Obtener token
        let token: string = this.getToken();

        // Validar que no sea nulo
        if ( token != null ) {
            return !this.jwt.isTokenExpired( token );
        }

        return false;
    }

    public login(usuario: Usuario): Observable<any> {
        return this.http.post(GLOBAL.url + "login", usuario);
    }

    public setToken(token: string): void {
        localStorage.setItem("aqct_token", JSON.stringify(token));
    }

    public getToken(): string {
        return JSON.parse( localStorage.getItem("aqct_token") );
    }

    public removeToken(): void {
        localStorage.removeItem("aqct_token");
    }

}