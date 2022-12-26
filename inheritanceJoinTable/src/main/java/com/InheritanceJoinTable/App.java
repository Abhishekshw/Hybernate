package com.InheritanceJoinTable;

import com.vehicle.daoImpl.DaoImpl;

public class App 
{
    public static void main( String[] args )
    {
       DaoImpl daop = new DaoImpl();
       daop.addVehicle();
    }
}
