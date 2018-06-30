import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { GLOBAL } from './global';
import { Usuario } from "../models/usuario";

@Injectable({
    providedIn: 'root'
})
export class UsuarioService {

    public constructor(
        private http: HttpClient
    ) {

    }

    public query(): Observable<Usuario[]> {
        return this.http.get<Usuario[]>(GLOBAL.url + "usuario")
            .pipe(map(usuarios => usuarios.map(usuario => new Usuario(usuario))));
    }

    public save(usuario: Usuario): Observable<number> {
        return this.http.post<number>(GLOBAL.url + "usuario", usuario.getJSON());
    }

    public get(id: number): Observable<Usuario> {
        return this.http.get<Usuario>(GLOBAL.url + "usuario/" + id);
    }

    public delete(id: number): Observable<any> {
        return this.http.get(GLOBAL.url + "usuario/" + id);
    }

}