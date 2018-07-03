import { Component, ViewChild } from "@angular/core";
import { Medida } from "../../models/medida";
import { BaseChartDirective } from "ng2-charts";

@Component({
    selector: 'graficolineas',
    templateUrl: 'graficolineas.component.html'
})
export class GraficoLineasComponent {

    @ViewChild(BaseChartDirective)
    public chart: BaseChartDirective;

    public lineChartData: Array<any>;
    public lineChartLabels: Array<any>;
    public lineChartOptions: any;
    public lineChartColors: Array<any>;
    public lineChartLegend: boolean;
    public lineChartType: string;

    public constructor() {

        this.lineChartData = [
            { data: [], label: 'Temperatura (°C)' },
            { data: [], label: 'Humedad (%)' }
        ];
        this.lineChartLabels = [];
        this.lineChartOptions = { responsive: true };
        this.lineChartColors = [
            {
                backgroundColor: 'rgba(215, 1, 1, 0.5)',
                borderColor: 'rgba(255,86,1,0.7)',
                pointBackgroundColor: 'rgba(148,159,177,1)',
                pointBorderColor: '#fff',
                pointHoverBackgroundColor: '#fff',
                pointHoverBorderColor: 'rgba(148,159,177,0.8)'
            },
            {
                backgroundColor: 'rgba(39,116,254,0.7)',
                borderColor: 'rgba(38,115,255,0.8)',
                pointBackgroundColor: 'rgba(148,159,177,1)',
                pointBorderColor: '#fff',
                pointHoverBackgroundColor: '#fff',
                pointHoverBorderColor: 'rgba(148,159,177,0.8)'
            }
        ];
        this.lineChartLegend = true;
        this.lineChartType = 'line';

    }

    public setMedidas(medidas: Medida[]) {
        // Resetear valores
        this.lineChartData[0].data = [];
        this.lineChartData[1].data = [];
        this.lineChartLabels = [];

        // Insertar nuevos registros
        for (let i = 0; i < medidas.length; i++) {
            this.lineChartData[0].data[i] = medidas[i].temperatura;
            this.lineChartData[1].data[i] = medidas[i].saturacion;
            this.lineChartLabels[i] = medidas[i].createdAt.toLocaleString("es-CL");
        }
        this.chart.chart.update();
    }

}