import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { GLOBAL } from '../../providers/networkConst';
import { Usuario } from '../../model/usuario';
import { Observable } from 'rxjs/observable';
import { Token } from '../../model/token';
import { map } from 'rxjs/operators';


/*
  Generated class for the AuthProvider provider.

  See https://angular.io/guide/dependency-injection for more info on providers
  and Angular DI.
*/
@Injectable()
export class AuthProvider {


  constructor(public http: HttpClient) {
    console.log('Hello AuthProvider Provider');
  }

  createAuthorizationHeader(headers : HttpHeaders){
    headers.append('Authorization', window.localStorage.getItem('aqct_token'));
  }
  

  public login(usuario: Usuario) : Observable<Token>{     
      return this.http.post(GLOBAL.url + 'login', usuario).pipe(map(token => new Token(token)));            
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
