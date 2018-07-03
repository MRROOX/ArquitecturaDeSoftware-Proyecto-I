import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';
import { PreguntaServiceProvider } from '../../providers/pregunta-service/pregunta-service';
import { Pregunta } from '../../model/pregunta';
import { Usuario } from '../../model/usuario';
import { AuthProvider } from '../../providers/auth/auth';

/**
 * Generated class for the PreguntaPage page.
 *
 * See https://ionicframework.com/docs/components/#navigation for more info on
 * Ionic pages and navigation.
 */

@IonicPage()
@Component({
  selector: 'page-pregunta',
  templateUrl: 'pregunta.html',
})
export class PreguntaPage {
  public arrayPreguntaAprobada: Array<Pregunta>;    
  public arrayPreguntaNoAprobada: Array<Pregunta>;

  constructor(public navCtrl: NavController, public navParams: NavParams,
              private preguntaService: PreguntaServiceProvider,
              private authService: AuthProvider) {

  }

  ionViewDidLoad() {

    let usuario = this.authService.getToken().usuario;

    this.preguntaService.queryAprobados().subscribe(
      Response => {                
        this.arrayPreguntaAprobada = Response
        let n: number = this.arrayPreguntaAprobada.length;

        for(var i =0; i< n; i++){
            if(usuario.nombre != this.arrayPreguntaAprobada[i].usuario.nombre){
              this.arrayPreguntaAprobada.splice(i,1);
            }
        }
      }
    );

    this.preguntaService.queryNoAprobados().subscribe(
      Response => {
        this.arrayPreguntaNoAprobada = Response;
        let n: number = this.arrayPreguntaNoAprobada.length

        for(var i =0; i< n; i++){
            if(usuario.nombre != this.arrayPreguntaNoAprobada[i].usuario.nombre){
              this.arrayPreguntaNoAprobada.splice(i,1);
            }
        }
      }
    );


  }

}
