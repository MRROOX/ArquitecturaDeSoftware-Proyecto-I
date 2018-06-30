import { Usuario } from "./usuario";

export class Token {

    public error: string;
    public token: string;
    public usuario: Usuario;

    public constructor(json?: any) {

        Object.assign(this, json);

        if (this.usuario) { this.usuario = new Usuario(this.usuario) };

    }

}