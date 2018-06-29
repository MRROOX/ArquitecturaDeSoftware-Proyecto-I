import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { ModeradorComponent } from './moderador.component';
import { appRoutingProviders, routing } from './moderador.routing';
import { AceptarPreguntasComponent } from './components/aceptarpreguntas/aceptarpreguntas.component';
import { UsuariosComponent } from './components/usuarios/usuarios.component';

@NgModule({
    declarations: [
        ModeradorComponent,
        AceptarPreguntasComponent,
        UsuariosComponent
    ],
    imports: [
        BrowserModule,
        FormsModule,
        HttpClientModule,
        routing
    ],
    providers: [
        appRoutingProviders
    ]
})
export class ModeradorModule { }
