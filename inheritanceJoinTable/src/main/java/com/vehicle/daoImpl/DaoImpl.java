package com.vehicle.daoImpl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.vehicle.configure.HibernateUtil;
import com.vehicle.dao.Dao;
import com.vehicle.entity.FourWheels;
import com.vehicle.entity.TwoWheels;

public class DaoImpl implements Dao{
	
	public void addVehicle() {
		Session session = HibernateUtil.activateSession();
		Transaction t = session.beginTransaction();
		TwoWheels tw = new TwoWheels();
		
		tw.setFule("petrol");
		tw.setEnginePower("500cc");
		tw.setSpeed(200);
		tw.setVtype("Bike");
		tw.setPrice(20000);
		tw.setModelno(1234);
		tw.setModelname("Hero");
		tw.setAbs(true);
		tw.setTyretype(114);
		tw.setBtype("sports bike");
		
		FourWheels fw = new FourWheels();
		
		fw.setFule("ELECTRIC");
		fw.setEnginePower("1000cc");
		fw.setSpeed(400);
		fw.setVtype("CAR");
		fw.setPrice(85122000);
		fw.setModelno(2525);
		fw.setModelname("SWIFT");
		fw.setMusicSystem(true);
		fw.setEtype("Auto");
		fw.setAc(false);
		
		session.save(tw);
		session.save(fw);
		
		t.commit();
		
		System.out.println("  Joining DONE* ");
	}


	}
	
	
	

}
