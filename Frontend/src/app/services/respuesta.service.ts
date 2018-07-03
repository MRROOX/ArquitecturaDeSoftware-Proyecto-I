import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
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

    public queryNoAprobados(): Observable<Respuesta[]> {
        return this.http.get<Respuesta[]>(GLOBAL.url + "respuesta/noaprobados")
            .pipe(map(respuestas => respuestas.map(respuesta => new Respuesta(respuesta))));
    }

    public save(respuesta: Respuesta): Observable<number> {
        return this.http.post<number>(GLOBAL.url + "respuesta", respuesta);
    }

}