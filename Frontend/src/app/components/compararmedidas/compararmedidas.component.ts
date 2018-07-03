import { Component, ViewChild } from "@angular/core";
import { GraficoLineasComponent } from "../graficolineas/graficolineas.component";
import { MedidaService } from "../../services/medida.service";
import { Range } from "../../models/range";

@Component({
    selector: 'compararmedidas',
    templateUrl: 'compararmedidas.component.html'
})
export class CompararMedidasComponent {

    @ViewChild("primerGrafico")
    public primerGraficoLineasComponent: GraficoLineasComponent;

    @ViewChild("segundoGrafico")
    public segundoGraficoLineasComponent: GraficoLineasComponent;

    // Primera fecha (gráfico izquierda)
    public primeraFechaA: string;

    // Segunda fecha (gráfico izquierda)
    public segundaFechaA: string;

    // Primera fecha (gráfico derecha)
    public primeraFechaB: string;

    // Segunda fecha (gráfico derecha)
    public segundaFechaB: string;

    public constructor(
        private medidaService: MedidaService
    ) {

    }

    public onSubmit() {
        let primeraFechaA: Date = new Date(this.primeraFechaA);
        let segundaFechaA: Date = new Date(this.segundaFechaA);
        let primeraFechaB: Date = new Date(this.primeraFechaB);
        let segundaFechaB: Date = new Date(this.segundaFechaB);

        // Validar fechas
        if (this.primeraFechaA != null && this.segundaFechaA != null && this.primeraFechaB != null && this.segundaFechaB != null) {

            // Ajustar horas
            primeraFechaA.setUTCHours(0);
            primeraFechaA.setUTCMinutes(0);

            segundaFechaA.setUTCHours(23);
            segundaFechaA.setUTCMinutes(59);

            primeraFechaB.setUTCHours(0);
            primeraFechaB.setUTCMinutes(0);

            segundaFechaB.setUTCHours(23);
            segundaFechaB.setUTCMinutes(59);

            // Crear rangos de fecha
            let rangoA: Range = new Range();

            rangoA.from = primeraFechaA;
            rangoA.to = segundaFechaA;

            let rangoB: Range = new Range();

            rangoB.from = primeraFechaB;
            rangoB.to = segundaFechaB;

            // Solicitar medidas en gráfico de la izquierda
            this.medidaService.queryOf(rangoA).subscribe(
                Response => {
                    // Actualizar gráfico de la izquierda
                    this.primerGraficoLineasComponent.setMedidas(Response);
                }
            );

            // Solicitar medidas en gráfico de la derecha
            this.medidaService.queryOf(rangoB).subscribe(
                Response => {
                    // Actualizar gráfico de la derecha
                    this.segundoGraficoLineasComponent.setMedidas(Response);
                }
            );

        }
    }

}