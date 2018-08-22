import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams, ViewController } from 'ionic-angular';
import { Respuesta } from '../../model/respuesta';


@IonicPage()
@Component({
  selector: 'page-modal-respuesta-detalle',
  templateUrl: 'modal-respuesta-detalle.html',
})
export class ModalRespuestaDetallePage {

  //pregunta para mostrar detalles
  public respuesta: Respuesta;

  constructor(
    public navCtrl: NavController, 
    public navParams: NavParams,
    public viewCtrl: ViewController
  ) {    
    this.respuesta = navParams.get( 'respuesta' );
  }

  ionViewDidLoad() {
    
  }

  public dismiss(){
    this.viewCtrl.dismiss();
  }

}
