import { ModuleWithProviders } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UsuarioComponent } from './usuario.component';
import { UsuarioGuard } from '../../guards/usuario.guard';
import { ResponderPreguntasComponent } from '../../components/responderpreguntas/responderpreguntas.component';
import { MedidasComponent } from '../../components/medidas/medidas.component';

const appRoutes: Routes = [
    {
        path: 'usr',
        component: UsuarioComponent,
        //canActivate: [UsuarioGuard],
        children: [
            {
                path: 'responderpreguntas',
                component: ResponderPreguntasComponent
            },
            {
                path: 'medidas',
                component: MedidasComponent
            }
        ]
    }
];

export const appRoutingProviders: any[] = [];
export const routing: ModuleWithProviders = RouterModule.forRoot(appRoutes);