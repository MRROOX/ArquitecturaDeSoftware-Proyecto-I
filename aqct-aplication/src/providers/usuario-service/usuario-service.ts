import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { GLOBAL } from '../networkConst';
import { Observable } from 'rxjs/Observable';
import { Usuario } from '../../model/usuario';
import { map } from 'rxjs/operators';

/*
  Generated class for the UsuarioServiceProvider provider.

  See https://angular.io/guide/dependency-injection for more info on providers
  and Angular DI.
*/
@Injectable()
export class UsuarioServiceProvider {

  constructor(public http: HttpClient) {
    console.log('Hello UsuarioServiceProvider Provider');
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
