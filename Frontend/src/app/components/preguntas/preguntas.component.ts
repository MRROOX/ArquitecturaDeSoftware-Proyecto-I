import { Component } from "@angular/core";
import { Pregunta } from "../../models/pregunta";
import { PreguntaService } from "../../services/pregunta.service";
import { RespuestaService } from "../../services/respuesta.service";
import { Respuesta } from "../../models/respuesta";
import { AuthService } from "../../services/auth.service";

@Component({
    selector: 'preguntas',
    templateUrl: 'preguntas.component.html'
})
export class PreguntasComponent {

    // Lista de preguntas
    public preguntas: Pregunta[];

    // Respuesta a registrar
    public respuestas: Respuesta[];

    public constructor(
        private preguntaService: PreguntaService,
        private respuestaService: RespuestaService,
        private authService: AuthService
    ) {
        // Obtener lista de preguntas
        this.preguntaService.queryAprobados().subscribe(
            Response => {
                this.preguntas = Response;
                this.respuestas = [];

                // Por cada pregunta agregar un campo para respuestas
                for (let i = 0; i < this.preguntas.length; i++) {
                    this.respuestas[i] = new Respuesta();
                    this.respuestas[i].pregunta = this.preguntas[i];
                }
            }
        );
    }

    public onSubmit(index: number): void {
        // Obtener objeto respuesta
        let respuesta: Respuesta = this.respuestas[index];

        // Si la respuesta no es nula
        if ( respuesta != null ) {
            
            // Si la respuesta tiene longitud mayor que cero
            if (respuesta.respuesta.length > 0) {

                // Enviar respuesta
                this.respuestaService.save(respuesta).subscribe(
                    Response => {
                        this.respuestas[index] = new Respuesta();
                        this.respuestas[index].pregunta = this.preguntas[index];

                        alert("Su pregunta se ha enviado para revisión y será visible prontamente");
                    }
                );
            }
        }
    }

}