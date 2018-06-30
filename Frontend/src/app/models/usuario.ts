import { Rol } from "./rol";

export class Usuario {

    public id: number;
    public created_at: Date;
    public nombre: string;
    public password: string;
    public correo: string;

    public rol: Rol;

    public constructor(json?: any) {

        Object.assign(this, json);

        if (this.created_at) { this.created_at = new Date(this.created_at) };
        if (this.rol) { this.rol = new Rol(this.rol) };

    }

    public getJSON(): any {
        return {
            id: this.id,
            created_at: this.created_at,
            nombre: this.nombre,
            password: this.password,
            correo: this.correo
        };
    }

}