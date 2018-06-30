import { Sensor } from "./sensor";

export class Medida {

    public id: number;
    public created_at: Date;
    public saturacion: number;
    public temperatura: number;

    public sensor: Sensor;

    public constructor(json?: any) {

        Object.assign(this, json);

        if (this.created_at) { this.created_at = new Date(this.created_at) };

    }

    public getJSON(): any {
        return {
            id: this.id,
            created_at: this.created_at,
            saturacion: this.saturacion,
            temperatura: this.temperatura,
            sensor: this.sensor != null ? this.sensor.getJSON() : null
        }
    }

}