import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { GLOBAL } from './global';
import { Pregunta } from "../models/pregunta";

@Injectable({
    providedIn: 'root'
})
export class PreguntaService {

    public constructor(
        private http: HttpClient
    ) {

    }

    public query(): Observable<Pregunta[]> {
        return this.http.get<Pregunta[]>(GLOBAL.url + "pregunta")
            .pipe(map(preguntas => preguntas.map(pregunta => new Pregunta(pregunta))));
    }

    public queryAprobados(): Observable<Pregunta[]> {
        return this.http.get<Pregunta[]>(GLOBAL.url + "pregunta/aprobados")
            .pipe(map(preguntas => preguntas.map(pregunta => new Pregunta(pregunta))));
    }

    public queryNoAprobados(): Observable<Pregunta[]> {
        return this.http.get<Pregunta[]>(GLOBAL.url + "pregunta/noaprobados")
        .pipe(map(preguntas => preguntas.map(pregunta => new Pregunta(pregunta))));
    }

    public get(id: number): Observable<Pregunta> {
        return this.http.get<Pregunta>(GLOBAL.url + "pregunta/" + id)
            .pipe(map(pregunta => new Pregunta(pregunta)));
    }

    public save(pregunta: Pregunta): Observable<number> {
        return this.http.post<number>(GLOBAL.url + "pregunta", pregunta);
    }

    public aprobar(id: number): Observable<any> {
        return this.http.get(GLOBAL.url + "pregunta/aprobar/" + id);
    }

    public delete(id: number): Observable<any> {
        return this.http.delete(GLOBAL.url + "pregunta/" + id);
    }

}