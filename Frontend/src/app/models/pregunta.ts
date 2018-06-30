
export class Pregunta {

    public id: number;
    public created_at: Date;
    public pregunta: string;
    public descripcion: string;
    public aprobado: boolean;

    public constructor(json?: any) {

        Object.assign(this, json);

        if (this.created_at) { this.created_at = new Date(this.created_at) };

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