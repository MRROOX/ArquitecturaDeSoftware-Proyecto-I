import { Respuesta } from "./respuesta";
import { Usuario } from "./usuario";

export class Pregunta {

    public id: number;
    public created_at: Date;
    public pregunta: string;
    public descripcion: string;
    public aprobado: boolean;

    public respuestas: Respuesta[];
    public usuario: Usuario;

    public constructor(json?: any) {

        Object.assign(this, json);

        if (this.created_at) { this.created_at = new Date(this.created_at) };
        if (this.respuestas) { this.respuestas = this.respuestas.map(respuesta => new Respuesta(respuesta)) };
        if (this.usuario) { this.usuario = new Usuario(this.usuario) };

    }

    public getJSON(): any {
        return {
            id: this.id,
            created_at: this.created_at,
            pregunta: this.pregunta,
            descripcion: this.descripcion,
            aprobado: this.aprobado
        };
    }

}