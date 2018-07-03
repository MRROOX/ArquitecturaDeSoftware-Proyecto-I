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
        // Pregunta a aceptar
        let pregunta: Pregunta = this.preguntas[index];

        // Si la pregunta es válida
        if ( pregunta != null ) {
            this.preguntaService.aprobar(pregunta.id).subscribe(
                Response => {
                    // Pregunta aprobada
                    this.preguntas.splice(index, 1);

                    alert("La pregunta ha sido aprobada.");
                }
            );
        }
    }

    public rechazarPregunta(index: number) {
        // Pregunta a rechazar
        let pregunta: Pregunta = this.preguntas[index];

        // Si la pregunta es válida
        if ( pregunta != null ) {
            this.preguntaService.delete(pregunta.id).subscribe(
                Response => {
                    // Eliminar la pregunta
                    this.preguntas.splice(index, 1);

                    alert("La pregunta ha sido eliminada.");
                }
            )
        }
    }

    public aceptarRespuesta(index: number) {
        // Respuesta a aprobar
        let respuesta: Respuesta = this.respuestas[index];

        // Si la respuesta es válida
        if ( respuesta != null ) {
            this.respuestaService.aprobar(respuesta.id).subscribe(
                Response => {
                    // Aprobar la respuesta
                    this.respuestas.splice(index, 1);

                    alert("La respuesta ha sido aprobada.");
                }
            )
        }
    }

    public rechazarRespuesta(index: number) {
        // Respuesta a rechazar
        let respuesta: Respuesta = this.respuestas[index];

        // Si la respuesta es válida
        if ( respuesta != null ) {
            this.respuestaService.delete(respuesta.id).subscribe(
                Response => {
                    // Rechazar la respuesta
                    this.respuestas.splice(index, 1);

                    alert("La respuesta ha sido eliminada.");
                }
            )
        }
    }

}