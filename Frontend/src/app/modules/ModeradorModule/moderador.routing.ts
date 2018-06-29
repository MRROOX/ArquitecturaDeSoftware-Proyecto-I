import { ModuleWithProviders } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ModeradorComponent } from './moderador.component';
import { ModeradorGuard } from '../../guards/moderador.guard';
import { AceptarPreguntasComponent } from './components/aceptarpreguntas/aceptarpreguntas.component';
import { ResponderPreguntasComponent } from '../../components/responderpreguntas/responderpreguntas.component';
import { MedidasComponent } from '../../components/medidas/medidas.component';

const appRoutes: Routes = [
    {
        path: 'mod',
        component: ModeradorComponent,
        //canActivate: [ModeradorGuard]
        children: [
            {
                path: 'aceptarpreguntas',
                component: AceptarPreguntasComponent
            },
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