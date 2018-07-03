import { Sensor } from "./sensor";

export class Medida {

    public id: number;
    public createdAt: Date;
    public saturacion: number;
    public temperatura: number;

    public sensor: Sensor;

    public constructor(json?: any) {

        Object.assign(this, json);

        if (this.createdAt) { this.createdAt = new Date(this.createdAt) };

    }

    public getJSON(): any {
        return {
            id: this.id,
            createdAt: this.createdAt,
            saturacion: this.saturacion,
            temperatura: this.temperatura,
            sensor: this.sensor != null ? this.sensor.getJSON() : null
        }
    }

}