import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams, MenuController, ToastController, AlertController } from 'ionic-angular';
import { Usuario } from '../../model/usuario';
import { UsuarioServiceProvider } from '../../providers/usuario-service/usuario-service';
import { LoginPage } from '../login/login';



@IonicPage()
@Component({
  selector: 'page-register',
  templateUrl: 'register.html',
})
export class RegisterPage {

  private usuario:Usuario;

  private passwordConfirmar:string;

  constructor(
    public navCtrl: NavController, 
    public navParams: NavParams,
    private menu: MenuController, 
    private usuarioService: UsuarioServiceProvider,
    private toastCtrl: ToastController,
    private alertCtrl: AlertController
  ) {
    this.usuario = new Usuario();
    //Desactivar el menu para esta vista
    this.menu.swipeEnable(false);
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad RegisterPage');
  }

  registrar(){
      console.log(this.passwordConfirmar);
      

      if(this.usuario.nombre != null && this.usuario.password && this.usuario.correo != null){
        if (this.usuario.password == this.passwordConfirmar) {

          // Enviar usuario a backend
            this.usuarioService.save(this.usuario).subscribe(
                Response => {
                    // El usuario se ha registrado
                    let toast = this.toastCtrl.create({
                      message: 'Usuario registrado excitosamente',
                      duration: 2000,
                      position: 'top'
                    });
                    toast.present();
                    this.navCtrl.setRoot(LoginPage);
                },
                Error => {
                    // Error al registrarse
                    let alert = this.alertCtrl.create({
                      title: 'Registro fallido!',
                      subTitle: 'Error al registrar, por favor intente con otros datos.',
                      buttons: ['Ok']
                    });
                    alert.present();
                    console.log(Error);
                }
            );
        }
      }        

  }

}
