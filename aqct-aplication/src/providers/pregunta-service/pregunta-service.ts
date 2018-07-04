import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { GLOBAL } from '../networkConst';
import { Pregunta } from '../../model/pregunta';
import { Observable } from 'rxjs/Observable';
import { map } from 'rxjs/operators';
import { Token } from '../../model/token';

@Injectable()
export class PreguntaServiceProvider {

  constructor(public http: HttpClient) {
    
  }


  createAuthorizationHeader(): HttpHeaders{    
    let jsonToken = window.localStorage.getItem('aqct_token');
    let token = new Token(JSON.parse(jsonToken));        
    return new HttpHeaders({
      'Content-Type': 'application/json; charset=utf-8',
      'Authorization': token.token
    });
  }

  public query(): Observable<Pregunta[]> {      
                     
      return this.http.get<Pregunta[]>(GLOBAL.url + "pregunta", {
                headers:this.createAuthorizationHeader()
              })
          .pipe(map(preguntas => preguntas.map(pregunta => new Pregunta(pregunta))));
  }

  public queryAprobados(): Observable<Pregunta[]> {    
      return this.http.get<Pregunta[]>(GLOBAL.url + "pregunta/aprobados", {
            headers:this.createAuthorizationHeader()
          })
          .pipe(map(preguntas => preguntas.map(pregunta => new Pregunta(pregunta))));
  }

  public queryNoAprobados(): Observable<Pregunta[]> {    
    return this.http.get<Pregunta[]>(GLOBAL.url + "pregunta/noaprobados", {
            headers:this.createAuthorizationHeader()
          })
          .pipe(map(preguntas => preguntas.map(pregunta => new Pregunta(pregunta))));
  }

  public get(id: number): Observable<Pregunta> {    
      return this.http.get<Pregunta>(GLOBAL.url + "pregunta/" + id, {headers:this.createAuthorizationHeader()})
          .pipe(map(pregunta => new Pregunta(pregunta)));
  }

  public save(pregunta: Pregunta): Observable<number> {    
      return this.http.post<number>(GLOBAL.url + "pregunta", pregunta, {headers:this.createAuthorizationHeader()});
  }

  public delete(id: number): Observable<any> {  
      return this.http.delete(GLOBAL.url + "pregunta/" + id, {headers:this.createAuthorizationHeader()});
  }

}
