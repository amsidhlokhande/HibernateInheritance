package com.amsidh.mvc.entities.join;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class MainApp {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		ServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		SessionFactory sessionFactory=configuration.buildSessionFactory(serviceRegistry);
		
		
		Vehicle vehicle=new Vehicle();
		vehicle.setVehicleName("Vehicle");
		
		TwoWheeler twoWheeler=new TwoWheeler();
		twoWheeler.setVehicleName("CB-Shine");
		twoWheeler.setSteringHandler("Stering Handler for Bike");
		
		
		FourWheeler fourWheeler=new FourWheeler();
		fourWheeler.setVehicleName("Wangon-R");
		fourWheeler.setWheelHandler("Wheel Handler for Car");
		
		
		
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(vehicle);
		session.save(twoWheeler);
		session.save(fourWheeler);
		
		session.flush();
		
		session.getTransaction().commit();
		session.close();
		
		
		sessionFactory.close();

	}

}
