import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';
import { Pregunta } from '../../model/pregunta';
import { PreguntaServiceProvider } from '../../providers/pregunta-service/pregunta-service';

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage {

  private pregunta:Pregunta;

  constructor(public navCtrl: NavController, private preguntaService:PreguntaServiceProvider) {
    this.pregunta = new Pregunta();
  }

  ingresarPregunta(){
    console.log(this.pregunta.descripcion);

    if(this.pregunta.descripcion!=null && this.pregunta.pregunta!=null){

      this.preguntaService.save(this.pregunta).subscribe(
        Response => {
          console.log('Excito');
        }
        
      );

    }

  }

}
