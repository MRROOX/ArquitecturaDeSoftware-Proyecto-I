import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { Observable } from 'rxjs';
import { GLOBAL } from './global';
import { Respuesta } from "../models/respuesta";

@Injectable({
    providedIn: 'root'
})
export class RespuestaService {

    public constructor(
        private http: HttpClient
    ) {

    }

    public save(respuesta: Respuesta): Observable<number> {
        return this.http.post<number>(GLOBAL.url + "respuesta", respuesta);
    }

}