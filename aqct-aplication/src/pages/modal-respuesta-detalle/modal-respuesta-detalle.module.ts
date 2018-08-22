import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { ModalRespuestaDetallePage } from './modal-respuesta-detalle';

@NgModule({
  declarations: [
    ModalRespuestaDetallePage,
  ],
  imports: [
    IonicPageModule.forChild(ModalRespuestaDetallePage),
  ],
})
export class ModalRespuestaDetallePageModule {}
