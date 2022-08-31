package facade;

import facade.dto.DatosEntradaFacade;
import facade.dto.DatosSalidaFacade;

public interface InterfaceFacade {
    DatosSalidaFacade datosSalida(DatosEntradaFacade datosEntrada);
}
