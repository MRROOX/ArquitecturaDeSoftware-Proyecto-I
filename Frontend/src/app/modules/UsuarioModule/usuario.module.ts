import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { UsuarioComponent } from './usuario.component';
import { routing, appRoutingProviders } from './usuario.routing';

@NgModule({
    declarations: [
        UsuarioComponent
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
export class UsuarioModule { }