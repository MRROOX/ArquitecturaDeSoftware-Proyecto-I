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

  constructor(public navCtrl: NavController, public navParams: NavParams) {
    this.pregunta = this.navParams.get('pregunta');
  }

  ionViewDidLoad() {
    console.log(this.pregunta);    
  }

}
