import { Respuesta } from "./respuesta";
import { Usuario } from "./usuario";

export class Pregunta {

    public id: number;
    public createdAt: Date;
    public pregunta: string;
    public descripcion: string;
    public aprobado: boolean;

    public respuestas: Respuesta[];
    public usuario: Usuario;

    public constructor(json?: any) {

        Object.assign(this, json);

        if (this.createdAt) { this.createdAt = new Date(this.createdAt) };
        if (this.respuestas) { this.respuestas = this.respuestas.map(respuesta => new Respuesta(respuesta)) };
        if (this.usuario) { this.usuario = new Usuario(this.usuario) };

    }

    public getJSON(): any {
        return {
            id: this.id,
            createdAt: this.createdAt,
            pregunta: this.pregunta,
            descripcion: this.descripcion,
            aprobado: this.aprobado
        };
    }

}