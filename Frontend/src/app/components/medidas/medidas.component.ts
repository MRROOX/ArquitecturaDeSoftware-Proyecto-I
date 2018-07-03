import { Component, ViewChild } from "@angular/core";
import { MedidaService } from "../../services/medida.service";
import { Medida } from "../../models/medida";
import { GraficoLineasComponent } from "../graficolineas/graficolineas.component";
import { Range } from "../../models/range";

@Component({
    selector: 'medidas',
    templateUrl: 'medidas.component.html'
})
export class MedidasComponent {

    // Componente de gráfico de lineas
    @ViewChild(GraficoLineasComponent)
    public graficoLineasComponent: GraficoLineasComponent;

    // Lista de medidas
    public medidas: Medida[];

    // Primera fecha
    public primeraFecha: string;

    // Segunda fecha
    public segundaFecha: string;

    // Humedad mínima
    public humedadMin: number;

    // Humedad máxima
    public humedadMax: number;

    // Temperatura mínima
    public temperaturaMin: number;

    // Temperatura máxima
    public temperaturaMax: number;

    public constructor(
        private medidaService: MedidaService
    ) {

    }

    public onSubmit() {
        // Transformar fechas (de tipo string) a tipo Date
        let primeraFecha: Date = new Date(this.primeraFecha);
        let segundaFecha: Date = new Date(this.segundaFecha);

        // Verificar que sean validas
        if ( primeraFecha != null && segundaFecha != null ) {

            primeraFecha.setUTCHours(0);
            primeraFecha.setUTCMinutes(0);

            segundaFecha.setUTCHours(23);
            segundaFecha.setUTCMinutes(59);

            // Crear un rango de fechas
            let rango: Range = new Range();

            rango.from = primeraFecha;
            rango.to = segundaFecha;

            // Solicitar medidas en rango
            this.medidaService.queryOf(rango).subscribe(
                Response => {
                    // Guardar medidas
                    this.medidas = Response;

                    this.humedadMin = this.medidas.length > 0 ? this.medidas[0].saturacion : null;
                    this.humedadMax = this.medidas.length > 0 ? this.medidas[0].saturacion : null;
                    this.temperaturaMin = this.medidas.length > 0 ? this.medidas[0].temperatura : null;
                    this.temperaturaMax = this.medidas.length > 0 ? this.medidas[0].temperatura : null;

                    // Por cada medida
                    for (let i = 1; i < this.medidas.length; i++) {
                        // Medida actual
                        let medida: Medida = this.medidas[i];

                        this.humedadMin = Math.min(this.humedadMin, medida.saturacion);
                        this.humedadMax = Math.max(this.humedadMax, medida.saturacion);
                        this.temperaturaMin = Math.min(this.temperaturaMin, medida.temperatura);
                        this.temperaturaMax = Math.max(this.temperaturaMax, medida.temperatura);
                    }

                    // Actualizar medidas en grafico
                    this.graficoLineasComponent.setMedidas(this.medidas);
                }
            );

        }
    }

}