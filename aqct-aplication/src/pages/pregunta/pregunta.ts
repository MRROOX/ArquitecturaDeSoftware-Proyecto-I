import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';
import { PreguntaServiceProvider } from '../../providers/pregunta-service/pregunta-service';
import { Pregunta } from '../../model/pregunta';
import { AuthProvider } from '../../providers/auth/auth';
import { RespuestaPage } from '../respuesta/respuesta';

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
  public arrayPreguntaAprobada: Pregunta[];
  public arrayPreguntaNoAprobada: Pregunta[];
  public hasPreguntasAprobada: boolean;
  public hasPreguntasNoAprobada: boolean;

  constructor(public navCtrl: NavController, public navParams: NavParams,
    private preguntaService: PreguntaServiceProvider,
    private authService: AuthProvider) {

  }

  ionViewDidLoad() {

    this.cargarDatos();

  }

  private cargarDatos() {
    let usuario = this.authService.getToken().usuario;

    this.preguntaService.queryAprobados().subscribe(
      Response => {
        this.arrayPreguntaAprobada = Response;

        this.arrayPreguntaAprobada = this.arrayPreguntaAprobada.filter( 
          pregunta => pregunta.usuario.id == usuario.id
        );

        this.hasPreguntasAprobada = (this.arrayPreguntaAprobada.length > 0) ? true : false;
      }
    );

    this.preguntaService.queryNoAprobados().subscribe(
      Response => {
        this.arrayPreguntaNoAprobada = Response;

        this.arrayPreguntaNoAprobada = this.arrayPreguntaNoAprobada.filter(
          pregunta => pregunta.usuario.id == usuario.id
        );

        this.hasPreguntasNoAprobada = (this.arrayPreguntaNoAprobada.length > 0) ? true : false;
      }
    );
  }

  public doRefresh(refresher) {
    console.log('Begin async operation', refresher);
    this.cargarDatos();
    setTimeout(() => {
      console.log('Async operation has ended');
      refresher.complete();
    }, 2000);
  }

  preguntaSelected(pregunta: Pregunta) {

    this.navCtrl.push(RespuestaPage, {
      'pregunta': pregunta
    });

  }

}
