import { Component } from "@angular/core";
import { PreguntaService } from "../../../../services/pregunta.service";
import { Pregunta } from "../../../../models/pregunta";
import { Respuesta } from "../../../../models/respuesta";
import { RespuestaService } from "../../../../services/respuesta.service";

@Component({
    selector: 'aceptarpreguntas',
    templateUrl: 'aceptarpreguntas.component.html'
})
export class AceptarPreguntasComponent {

    // Lista de preguntas no aprobadas
    public preguntas: Pregunta[];

    // Lista de respuestas no aprobadas
    public respuestas: Respuesta[];

    public constructor(
        private preguntaService: PreguntaService,
        private respuestaService: RespuestaService
    ) {
        // Obtener preguntas no aprobadas
        this.preguntaService.queryNoAprobados().subscribe(
            Response => {
                this.preguntas = Response;
            }
        );

        // Obtener respuestas no aprobadas
        this.respuestaService.queryNoAprobados().subscribe(
            Response => {
                this.respuestas = Response;
            }
        );
    }

    public aceptarPregunta(index: number) {

    }

    public rechazarPregunta(index: number) {
        
    }

    public aceptarRespuesta(index: number) {

    }

    public rechazarRespuesta(index: number) {
        
    }

}