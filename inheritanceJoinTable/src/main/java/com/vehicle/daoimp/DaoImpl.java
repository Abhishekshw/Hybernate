package com.vehicle.daoimp;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.vehicle.dao.Dao;
import com.vehicle.entity.FourWheeler;
import com.vehicle.entity.TwoWheeler;

public class DaoImpl implements Dao {

	public void addvehicle() {
		Session s = com.vehicle.config.hybernateUtil.ActiveSesion();
		Transaction t = s.beginTransaction();
		TwoWheeler tw = new TwoWheeler();
		tw.setFule("petrol");
		tw.setEnginePower("500cc");
		tw.setSpeed(200);
		tw.setPrice(200000);
		tw.setModelno(1234);
		tw.setModelname("abc");
		tw.setAbs(true);
		tw.setTyretype(140);
		tw.setBtype("Sports bike");

		FourWheeler fw = new FourWheeler();
		fw.setFule("electric");
		fw.setEnginePower("1000cc");
		fw.setSpeed(400);
		fw.setVtype("Car");
		fw.setPrice(8000000);
		fw.setModelno(12345);
		fw.setModelname("Swift");
		fw.setMusicSystem(true);
		fw.setEtype("auto");
		fw.setAC(true);
		s.save(tw);
		s.save(fw);
		t.commit();
		System.out.println("joining done");
	}
}
