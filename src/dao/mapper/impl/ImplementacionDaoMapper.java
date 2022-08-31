package dao.mapper.impl;

import business.dto.DatosCuenta;
import business.dto.DatosEntrada;
import business.dto.DatosSalida;
import dao.mapper.InterfaceDaoMapper;

import java.util.Date;

public class ImplementacionDaoMapper implements InterfaceDaoMapper {
    @Override
    public DatosSalida mapeoResultado(DatosEntrada datosEntrada, int numeroCuenta, Date fechaActual) {
        /*DatosCuenta datosCuenta = new DatosCuenta();

        datosCuenta.setUsuario(datosEntrada.getDatosUsuario().getUsuario());
        datosCuenta.setNumeroCuenta(numeroCuenta);
        datosCuenta.setFechaCreacion(fechaActual);

        DatosSalida datosSalida = new DatosSalida();
        datosSalida.setDatosCuenta(datosCuenta);
        datosSalida.setBanco(datosEntrada.getDatosUsuario().getBanco());*/

        DatosSalida datosSalida = new DatosSalida();

        DatosCuenta datosCuenta = new DatosCuenta();
        datosCuenta.setNumeroCuenta(numeroCuenta);
        datosCuenta.setUsuario(datosEntrada.getDatosUsuario().getUsuario());
        datosCuenta.setFechaCreacion(fechaActual);
        datosSalida.setBanco(datosEntrada.getDatosUsuario().getBanco());
        datosSalida.setDatosCuenta(datosCuenta);

        return datosSalida;
    }
}
