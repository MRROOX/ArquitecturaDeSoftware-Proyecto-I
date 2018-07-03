
export class Range {

    public from: Date;
    public to: Date;

    public constructor(json?: any) {

        Object.assign(this, json);

    }

}