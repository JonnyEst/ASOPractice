package facade.mapper.impl;

import business.dto.DatosEntrada;
import business.dto.DatosSalida;
import business.dto.DatosUsuario;
import facade.dto.DatosCuentaFacade;
import facade.dto.DatosEntradaFacade;
import facade.dto.DatosSalidaFacade;
import facade.mapper.InterfaceFacadeMapper;

public class ImplementacionFacadeMapper implements InterfaceFacadeMapper {
    @Override
    public DatosEntrada MapeoEntrada(DatosEntradaFacade datosEntrada) {
        DatosUsuario datosUsuario = new DatosUsuario();
        datosUsuario.setUsuario(datosEntrada.getUsuario());
        datosUsuario.setContraseña(datosEntrada.getContraseña());
        datosUsuario.setBanco("BBVA");

        DatosEntrada datosEntrada1 = new DatosEntrada();
        datosEntrada1.setDatosUsuario(datosUsuario);

        return datosEntrada1;
    }

    @Override
    public DatosSalidaFacade MapeoSalida(DatosSalida datosSalida) {
        DatosCuentaFacade datosCuenta = new DatosCuentaFacade();
        datosCuenta.setUsuario(datosSalida.getDatosCuenta().getUsuario());
        datosCuenta.setNumeroCuenta(datosSalida.getDatosCuenta().getNumeroCuenta());
        datosCuenta.setFechaCracion(datosSalida.getDatosCuenta().getFechaCreacion());

        DatosSalidaFacade datosSalida1 = new DatosSalidaFacade();
        datosSalida1.setDatosCuenta(datosCuenta);
        datosSalida1.setBanco(datosSalida.getBanco());

        return datosSalida1;
    }




}
