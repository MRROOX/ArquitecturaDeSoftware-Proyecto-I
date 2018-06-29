import { Component } from "@angular/core";

@Component({
    selector: 'app-root',
    templateUrl: 'usuario.component.html'
})
export class UsuarioComponent {

    // Indicar que se encuentra activa la barra izquierda
    public sidenav: boolean = false;

    public constructor() {

    }

    public toggleSidenav(): void {
        this.sidenav = !this.sidenav;
    }

}