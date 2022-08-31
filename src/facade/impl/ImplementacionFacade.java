package facade.impl;

import business.dto.DatosEntrada;
import business.dto.DatosSalida;
import business.impl.ImplementacionBusiness;
import facade.InterfaceFacade;
import facade.dto.DatosEntradaFacade;
import facade.dto.DatosSalidaFacade;
import facade.mapper.impl.ImplementacionFacadeMapper;

public class ImplementacionFacade implements InterfaceFacade {

    ImplementacionFacadeMapper implementacionFacadeMapper = new ImplementacionFacadeMapper();
    ImplementacionBusiness   implementacionBusiness = new ImplementacionBusiness();


    @Override
    public DatosSalidaFacade datosSalida(DatosEntradaFacade datosEntrada) {
        DatosEntrada datosEntrada1 = implementacionFacadeMapper.MapeoEntrada(datosEntrada);
        DatosSalida datosSalida = implementacionBusiness.datosSalida(datosEntrada1);
        DatosSalidaFacade datosSalida1 = implementacionFacadeMapper.MapeoSalida(datosSalida);
        return datosSalida1;
    }
}
