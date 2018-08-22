import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams, ModalController } from 'ionic-angular';
import { Pregunta } from '../../model/pregunta';
import { ModalRespuestaDetallePage } from '../modal-respuesta-detalle/modal-respuesta-detalle';
import { Respuesta } from '../../model/respuesta';

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

  public pregunta: Pregunta;
  public mensajePregunta: string;

  constructor(
    public navCtrl: NavController, 
    public navParams: NavParams,
    public modalCtrl: ModalController
  ) {
    this.pregunta = this.navParams.get('pregunta');
  }

  ionViewDidLoad() {

    this.cargarDatos();

  }

  private cargarDatos() {
    if (this.pregunta.aprobado) {
      //En caso de que la pregunta este aprobada, mostrar las respuestas aprobadas
      if (this.pregunta.respuestas != null && this.pregunta.respuestas.length > 0) {
        for (let i = 0; i < this.pregunta.respuestas.length; i++) {
          if (!this.pregunta.respuestas[i].aprobado) {
            this.pregunta.respuestas.splice(i, 1);
          }
        }
      }
    } else {
      //En caso de que aun no estan aprobadas, mostrar mensaje
      this.mensajePregunta = "Su pregunta aun se encuentra en evaluación."
    }

  }

  public doRefresh(refresher) {
    console.log('Begin async operation', refresher);
    this.cargarDatos();
    setTimeout(() => {
      console.log('Async operation has ended');
      refresher.complete();
    }, 2000);
  }

  public modalDetalles(respuesta:Respuesta){
    this.modalCtrl.create( ModalRespuestaDetallePage, 
      {
        respuesta: respuesta
      }
    ).present();
  }

}
