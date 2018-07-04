import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';
import { Pregunta } from '../../model/pregunta';

/**
 * Generated class for the RespuestaPage page.
 *
 * See https://ionicframework.com/docs/components/#navigation for more info on
 * Ionic pages and navigation.
 */

@IonicPage()
@Component({
  selector: 'page-respuesta',
  templateUrl: 'respuesta.html',
})
export class RespuestaPage {

  public pregunta :Pregunta;
  public mensajePregunta: string;

  constructor(public navCtrl: NavController, public navParams: NavParams) {
    this.pregunta = this.navParams.get('pregunta');
  }

  ionViewDidLoad() {
    
    if(this.pregunta.aprobado){
      //En caso de que la pregunta este aprobada, mostrar las respuestas aprobadas
      if(this.pregunta.respuestas != null && this.pregunta.respuestas.length>0){
        for(let i =0; i<this.pregunta.respuestas.length; i++){
          if(!this.pregunta.respuestas[i].aprobado){
            this.pregunta.respuestas.splice(i,1);
          }
        }
      }
    }else{
      //En caso de que aun no estan aprobadas, mostrar mensaje
      this.mensajePregunta = "Su pregunta aun se encuentra en evaluación."
    }

  }

}
