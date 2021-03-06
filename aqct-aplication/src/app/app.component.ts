import { Component, ViewChild } from '@angular/core';
import { Nav, Platform } from 'ionic-angular';
import { StatusBar } from '@ionic-native/status-bar';
import { SplashScreen } from '@ionic-native/splash-screen';

import { HomePage } from '../pages/home/home';
import { LoginPage} from '../pages/login/login';
import { PreguntaPage } from '../pages/pregunta/pregunta';
import { AuthProvider } from '../providers/auth/auth';

@Component({
  templateUrl: 'app.html'
})
export class MyApp {
  @ViewChild(Nav) nav: Nav;

  rootPage: any = LoginPage;

  pages: Array<{title: string, component: any}>;

  constructor(public platform: Platform, public statusBar: StatusBar, 
              public splashScreen: SplashScreen, private authService: AuthProvider) {
    this.initializeApp();

    // used for an example of ngFor and navigation
    this.pages = [      
      { title: 'Hacer preguntas', component: HomePage },
      { title: 'Preguntas y respuestas', component: PreguntaPage },
      { title: 'Logout', component: LoginPage}
    ];

  }

  initializeApp() {
    this.platform.ready().then(() => {
      // Okay, so the platform is ready and our plugins are available.
      // Here you can do any higher level native things you might need.
      this.statusBar.styleDefault();
      this.splashScreen.hide();
    });

  }

  openPage(page) {
    // Reset the content nav to have just this page
    // we wouldn't want the back button to show in this scenario
    if(page.title == 'Logout'){
      console.log("Salir");      
      this.authService.removeToken();
    }
    this.nav.setRoot(page.component);
  }
}
