
export class Rol {

    public id: number;
    public nombre: string;

    public constructor(json?: any) {

        Object.assign(this, json);

    }

    public getJSON(): any {
        return {
            id: this.id,
            nombre: this.nombre
        };
    }

}