import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { Observable } from "rxjs";
import { map } from 'rxjs/operators';
import { GLOBAL } from "./global";
import { JwtHelperService } from "@auth0/angular-jwt";
import { Usuario } from "../models/usuario";
import { Token } from "../models/token";

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
        let token: Token = this.getToken();

        // Validar que no sea nulo
        if ( token != null ) {
            return !this.jwt.isTokenExpired( token.token );
        }

        return false;
    }

    public login(usuario: Usuario): Observable<Token> {
        return this.http.post<Token>(GLOBAL.url + "login", usuario)
            .pipe(map(token => new Token(token)));
    }

    public setToken(token: Token): void {
        localStorage.setItem("aqct_token", JSON.stringify(token));
    }

    public getToken(): Token {

        let token: any = JSON.parse( localStorage.getItem("aqct_token") );

        if ( token != null ) {
            return new Token(token);
        }

        return null;
    }

    public removeToken(): void {
        localStorage.removeItem("aqct_token");
    }

}