
export class Sensor {

    public id: number;
    public direccion: string;
    public ciudad: string;

    public constructor(json?: any) {
        
        Object.assign(this, json);

    }

    public getJSON(): any {
        return {
            id: this.id,
            direccion: this.direccion,
            ciudad: this.ciudad
        };
    }

}