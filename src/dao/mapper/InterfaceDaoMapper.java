package dao.mapper;

import business.dto.DatosEntrada;
import business.dto.DatosSalida;

import java.util.Date;

public interface InterfaceDaoMapper {
    DatosSalida mapeoResultado(DatosEntrada datosEntrada, int numeroCuenta, Date fechaActual);
}
