import { Rol } from "./rol";
import { Pregunta } from "./pregunta";

export class Usuario {

    public id: number;
    public createdAt: Date;
    public nombre: string;
    public password: string;
    public correo: string;

    public rol: Rol;
    public preguntas: Pregunta[];

    public constructor(json?: any) {

        Object.assign(this, json);

        if (this.createdAt) { this.createdAt = new Date(this.createdAt) };
        if (this.rol) { this.rol = new Rol(this.rol) };
        if (this.preguntas) { this.preguntas = this.preguntas.map(pregunta => new Pregunta(pregunta)) };

    }

    public getJSON(): any {
        return {
            id: this.id,
            createdAt: this.createdAt,
            nombre: this.nombre,
            password: this.password,
            correo: this.correo
        };
    }

}