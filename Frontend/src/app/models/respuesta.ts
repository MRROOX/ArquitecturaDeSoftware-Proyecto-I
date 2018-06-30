
export class Respuesta {

    public id: number;
    public created_at: Date;
    public respuesta: string;
    public aprobado: boolean;

    public constructor(json?: any) {

        Object.assign(this, json);

        if (this.created_at) { this.created_at = new Date(this.created_at) };

    }

    public getJSON(): any {
        return {
            id: this.id,
            created_at: this.created_at,
            respuesta: this.respuesta,
            aprobado: this.aprobado
        }
    }

}