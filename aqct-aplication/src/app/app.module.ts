import { BrowserModule } from '@angular/platform-browser';
import { ErrorHandler, NgModule } from '@angular/core';
import { IonicApp, IonicErrorHandler, IonicModule } from 'ionic-angular';

import { MyApp } from './app.component';
import { HomePage } from '../pages/home/home';

import { StatusBar } from '@ionic-native/status-bar';
import { SplashScreen } from '@ionic-native/splash-screen';
import { LoginPage } from '../pages/login/login';
import { RegisterPage} from '../pages/register/register';
import { PreguntaPage} from '../pages/pregunta/pregunta';
import { AuthProvider } from '../providers/auth/auth';
import { HttpModule } from '@angular/http';
import { HttpClientModule } from '@angular/common/http';
import { UsuarioServiceProvider } from '../providers/usuario-service/usuario-service';
import { PreguntaServiceProvider } from '../providers/pregunta-service/pregunta-service';
import { RespuestaPage } from '../pages/respuesta/respuesta';
import { ModalRespuestaDetallePage } from '../pages/modal-respuesta-detalle/modal-respuesta-detalle';




@NgModule({
  declarations: [
    MyApp,
    HomePage,    
    LoginPage,
    RegisterPage,
    PreguntaPage,
    RespuestaPage,
    ModalRespuestaDetallePage,    
  ],
  imports: [
    BrowserModule,
    HttpModule,
    HttpClientModule,
    IonicModule.forRoot(MyApp),        
  ],
  bootstrap: [IonicApp],
  entryComponents: [
    MyApp,
    HomePage,    
    LoginPage,
    RegisterPage,
    PreguntaPage,
    RespuestaPage,
    ModalRespuestaDetallePage,
  ],
  providers: [
    StatusBar,
    SplashScreen,
    {provide: ErrorHandler, useClass: IonicErrorHandler},
    AuthProvider,
    UsuarioServiceProvider,
    PreguntaServiceProvider
  ]
})
export class AppModule {}
