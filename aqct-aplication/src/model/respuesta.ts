import { Usuario } from "./usuario";
import { Pregunta } from "./pregunta";

export class Respuesta {

    public id: number;
    public createdAt: Date;
    public respuesta: string;
    public aprobado: boolean;

    public pregunta: Pregunta;
    public usuario: Usuario;

    public constructor(json?: any) {

        Object.assign(this, json);

        if (this.createdAt) { this.createdAt = new Date(this.createdAt) };
        if (this.pregunta) { this.pregunta = new Pregunta(this.pregunta) };
        if (this.usuario) { this.usuario = new Usuario(this.usuario) };

    }

    public getJSON(): any {
        return {
            id: this.id,
            createdAt: this.createdAt,
            respuesta: this.respuesta,
            aprobado: this.aprobado
        }
    }

}