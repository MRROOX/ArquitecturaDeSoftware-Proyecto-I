import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams, MenuController, AlertController, LoadingController } from 'ionic-angular';
import { HomePage } from '../home/home';
import { RegisterPage } from '../register/register';
import { Usuario } from '../../model/usuario';
import { AuthProvider } from '../../providers/auth/auth';

/**
 * Generated class for the LoginPage page.
 *
 * See https://ionicframework.com/docs/components/#navigation for more info on
 * Ionic pages and navigation.
 */

@IonicPage()
@Component({
  selector: 'page-login',
  templateUrl: 'login.html',
})
export class LoginPage {  

  private usuario:Usuario; 
  public error: string;

  constructor(public navCtrl: NavController, public navParams: NavParams,
              private menu: MenuController,  private authService:AuthProvider,
              private alertCtrl: AlertController, private loadingCtrl: LoadingController) {
    this.usuario = new Usuario();
    //Desactivar el menu para esta vista
    this.menu.swipeEnable(false);    
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad LoginPage');
  }

  login(){
    
    //Spiner bonito para mostrar espera de carga
    let loading = this.loadingCtrl.create({
      content: 'Por favor espera...'
    });  
    loading.present();


    if (this.usuario.nombre != null && this.usuario.password!=null) {
      // Obtener autorización
      this.authService.login(this.usuario).subscribe(
          Response => {
              // Si hubo error al iniciar sesión
              if (Response.error != null) {
                  // Guardar error                  
                  let alert = this.alertCtrl.create({
                    title: 'Inicio de sesión fallido!',
                    subTitle: 'Nombre de usuario o contraseña incorrecta.',
                    buttons: ['Ok']
                  });
                  alert.present();                  

              } else {
                  // Inicio de sesión exitoso
                  this.authService.setToken(Response);

                  // Redireccionar a ruta correspondiente
                  this.navCtrl.setRoot(HomePage);
              }
              loading.dismiss();
          },
          Error => {            
              // Error al iniciar sesión              
              let alert = this.alertCtrl.create({
                title: 'Inicio de sesión fallido!',
                subTitle: 'Error de conexión, por favor intente más tarde.',
                buttons: ['Ok']
              });
              alert.present();
              loading.dismiss();
          }
      );

      
  }
    
  }

  goRegistro(){
    this.navCtrl.push(RegisterPage);
  }

}
