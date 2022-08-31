package dao.impl;

import business.dto.DatosEntrada;
import business.dto.DatosSalida;
import dao.InterfaceDao;
import dao.mapper.impl.ImplementacionDaoMapper;

import java.util.Date;

public class ImplementacionDao implements InterfaceDao {

    ImplementacionDaoMapper implementacionDaoMapper = new ImplementacionDaoMapper();
    @Override
    public DatosSalida datosOut(DatosEntrada datosEntrada) {
        DatosSalida datosSalida = implementacionDaoMapper.mapeoResultado(datosEntrada,llenarDatos(),ModelDate());
        return datosSalida;
    }



    public static int llenarDatos(){
        int cuenta=12345;
        return cuenta;
    }

    public static Date ModelDate(){
        Date localDate = new Date();

        return localDate;
    }
}
