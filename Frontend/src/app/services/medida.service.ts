import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { Range } from "../models/range";
import { Medida } from "../models/medida";
import { GLOBAL } from "./global";

@Injectable({
    providedIn: 'root'
})
export class MedidaService {

    public constructor(
        private http: HttpClient
    ) {

    }

    public queryOf(rango: Range): Observable<Medida[]> {
        return this.http.post<Medida[]>(GLOBAL.url + "medida/range", rango)
            .pipe(map(medidas => medidas.map(medida => new Medida(medida))));
    }

}