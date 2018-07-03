import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';

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
  globalArray: any;

  constructor(public navCtrl: NavController, public navParams: NavParams) {
  }

  ionViewDidLoad() {
    let array: Array<number> = [234,4,23,34];    
    for(let i =0; i<4; i++){
      this.globalArray.push({value1:array[i]});
    }
  }

}
