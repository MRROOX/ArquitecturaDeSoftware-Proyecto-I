import { ModuleWithProviders } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ModeradorComponent } from './moderador.component';
import { ModeradorGuard } from '../../guards/moderador.guard';
import { AceptarPreguntasComponent } from './components/aceptarpreguntas/aceptarpreguntas.component';
import { PreguntasComponent } from '../../components/preguntas/preguntas.component';
import { MedidasComponent } from '../../components/medidas/medidas.component';
import { CompararMedidasComponent } from '../../components/compararmedidas/compararmedidas.component';
import { UsuariosComponent } from './components/usuarios/usuarios.component';

const appRoutes: Routes = [
    {
        path: 'mod',
        component: ModeradorComponent,
        canActivate: [ModeradorGuard],
        children: [
            {
                path: '',
                component: MedidasComponent
            },
            {
                path: 'medidas',
                component: MedidasComponent
            },
            {
                path: 'compararmedidas',
                component: CompararMedidasComponent
            },
            {
                path: 'preguntas',
                component: PreguntasComponent
            },
            {
                path: 'aceptarpreguntas',
                component: AceptarPreguntasComponent
            },
            {
                path: 'usuarios',
                component: UsuariosComponent
            }
        ]
    }
];

export const appRoutingProviders: any[] = [];
export const routing: ModuleWithProviders = RouterModule.forRoot(appRoutes);