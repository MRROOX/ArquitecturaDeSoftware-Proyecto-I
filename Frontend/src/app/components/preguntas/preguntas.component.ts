import { Component } from "@angular/core";
import { Pregunta } from "../../models/pregunta";
import { PreguntaService } from "../../services/pregunta.service";

@Component({
    selector: 'preguntas',
    templateUrl: 'preguntas.component.html'
})
export class PreguntasComponent {

    // Lista de preguntas
    public preguntas: Pregunta[];

    public constructor(
        private preguntaService: PreguntaService
    ) {
        // Obtener lista de preguntas
        this.preguntaService.query().subscribe(
            Response => {
                this.preguntas = Response;
            }
        );
    }

}