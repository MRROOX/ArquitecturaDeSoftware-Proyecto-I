import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";

@Injectable({
    providedIn: 'root'
})
export class UsuarioService {

    public constructor(
        private http: HttpClient
    ) {

    }

}