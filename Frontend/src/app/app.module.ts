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
import { LoginGuard } from './guards/login.guard';
import { RegisterComponent } from './components/register/register.component';

export function getToken(): string {

    let token: any = localStorage.getItem('token');

    if (token != null) {

        return JSON.parse(localStorage.getItem('token'));

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
        RegisterComponent
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
