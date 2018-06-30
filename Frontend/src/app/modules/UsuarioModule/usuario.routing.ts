import { ModuleWithProviders } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UsuarioComponent } from './usuario.component';
import { UsuarioGuard } from '../../guards/usuario.guard';
import { PreguntasComponent } from '../../components/preguntas/preguntas.component';
import { MedidasComponent } from '../../components/medidas/medidas.component';
import { CompararMedidasComponent } from '../../components/compararmedidas/compararmedidas.component';

const appRoutes: Routes = [
    {
        path: 'usr',
        component: UsuarioComponent,
        canActivate: [UsuarioGuard],
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
        ]
    }
];

export const appRoutingProviders: any[] = [];
export const routing: ModuleWithProviders = RouterModule.forRoot(appRoutes);