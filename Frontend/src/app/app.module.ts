import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { JwtModule, JwtModuleOptions } from '@auth0/angular-jwt';
import { NgModule } from '@angular/core';
import { ModeradorModule } from './modules/ModeradorModule/moderador.module';
import { UsuarioModule } from './modules/UsuarioModule/usuario.module';
import { routing, appRoutingProviders } from './app.routing';
import { GLOBAL } from './services/global';

import { AppComponent } from './app.component';
import { LoginComponent } from './components/login/login.component';
import { RegisterComponent } from './components/register/register.component';
import { PreguntasComponent } from './components/preguntas/preguntas.component';
import { MedidasComponent } from './components/medidas/medidas.component';
import { CompararMedidasComponent } from './components/compararmedidas/compararmedidas.component';

export function getToken(): string {

    let token: any = localStorage.getItem('aqct_token');

    if (token != null) {

        return token.token;

    }

    return null;

}

const jwtConf: JwtModuleOptions = {
    config: {
        tokenGetter: getToken,
        authScheme: '',
        whitelistedDomains: [GLOBAL.host]
    }
}

@NgModule({
    declarations: [
        AppComponent,
        LoginComponent,
        RegisterComponent,

        // Componentes compartidos
        PreguntasComponent,
        MedidasComponent,
        CompararMedidasComponent
    ],
    imports: [
        BrowserModule,
        FormsModule,
        HttpClientModule,
        ModeradorModule,
        UsuarioModule,
        routing,
        JwtModule.forRoot(jwtConf)
    ],
    providers: [
        appRoutingProviders
    ],
    bootstrap: [AppComponent]
})
export class AppModule { }
