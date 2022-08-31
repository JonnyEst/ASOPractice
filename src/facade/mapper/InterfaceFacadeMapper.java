package facade.mapper;

import business.dto.DatosEntrada;
import facade.dto.DatosEntradaFacade;
import facade.dto.DatosSalidaFacade;

public interface InterfaceFacadeMapper {

    DatosEntrada MapeoEntrada(DatosEntradaFacade datosEntrada);
    DatosSalidaFacade MapeoSalida(business.dto.DatosSalida datosSalida);
}
