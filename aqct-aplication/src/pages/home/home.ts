import { Component } from '@angular/core';
import { NavController, AlertController, LoadingController } from 'ionic-angular';
import { Pregunta } from '../../model/pregunta';
import { PreguntaServiceProvider } from '../../providers/pregunta-service/pregunta-service';

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage {

  private pregunta:Pregunta;

  constructor(public navCtrl: NavController, private preguntaService:PreguntaServiceProvider,
              private alertCtrl: AlertController, private loadingCtrl: LoadingController) {
    this.pregunta = new Pregunta();
  }

  ingresarPregunta(){
    //Spiner bonito para mostrar espera de carga
    let loading = this.loadingCtrl.create({
      content: 'Por favor espera...'
    });  
    loading.present();

    if(this.pregunta.descripcion!=null && this.pregunta.pregunta!=null){

      this.preguntaService.save(this.pregunta).subscribe(
        Response => {
          let alert = this.alertCtrl.create({
            title: 'Pregunta enviada',
            subTitle: 'Su pregunta se ha enviado para revisión y será visible prontamente.',
            buttons: ['Ok']
          });
          alert.present();

          this.pregunta.pregunta = null;

          this.pregunta.descripcion = null;
        },

        Error => {
          let alert = this.alertCtrl.create({
            title: 'Respuesta no enviada!',
            subTitle: 'Error de conexión, por favor intente más tarde.',
            buttons: ['Ok']
          });
          alert.present();
        }
        
      );

    }

    loading.dismiss();

  }

}
