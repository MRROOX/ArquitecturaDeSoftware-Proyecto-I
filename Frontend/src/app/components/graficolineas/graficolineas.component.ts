import { Component } from "@angular/core";

@Component({
    selector: 'graficolineas',
    templateUrl: 'graficolineas.component.html'
})
export class GraficoLineasComponent {

    public lineChartData: Array<any>;
    public lineChartLabels: Array<any>;
    public lineChartOptions: any;
    public lineChartColors: Array<any>;
    public lineChartLegend: boolean;
    public lineChartType: string;

    public constructor() {

        this.lineChartData = [
            { data: [65, 59, 50, 81, 56, 55, 40], label: 'Temperatura (°C)' },
            { data: [18, 48, 77, 9, 100, 27, 40], label: 'Humedad (%)' }
        ];
        this.lineChartLabels = ['January', 'February', 'March', 'April', 'May', 'June', 'July'];
        this.lineChartOptions = { responsive: true };
        this.lineChartColors = [
            { // grey
                backgroundColor: 'rgba(215, 1, 1, 0.5)',
                borderColor: 'rgba(255,86,1,0.7)',
                pointBackgroundColor: 'rgba(148,159,177,1)',
                pointBorderColor: '#fff',
                pointHoverBackgroundColor: '#fff',
                pointHoverBorderColor: 'rgba(148,159,177,0.8)'
            },
            { // grey
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

    public chartClicked(e: any): void {
        console.log(e);
    }

    public chartHovered(e: any): void {
        console.log(e);
    }

}