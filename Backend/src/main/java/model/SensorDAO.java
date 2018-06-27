/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package model;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class SensorDAO {
	public static Sensor loadSensorByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = ProyectoVPPPersistentManager.instance().getSession();
			return loadSensorByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sensor getSensorByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = ProyectoVPPPersistentManager.instance().getSession();
			return getSensorByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sensor loadSensorByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoVPPPersistentManager.instance().getSession();
			return loadSensorByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sensor getSensorByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoVPPPersistentManager.instance().getSession();
			return getSensorByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sensor loadSensorByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Sensor) session.load(model.Sensor.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sensor getSensorByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Sensor) session.get(model.Sensor.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sensor loadSensorByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Sensor) session.load(model.Sensor.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sensor getSensorByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Sensor) session.get(model.Sensor.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySensor(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoVPPPersistentManager.instance().getSession();
			return querySensor(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySensor(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoVPPPersistentManager.instance().getSession();
			return querySensor(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sensor[] listSensorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoVPPPersistentManager.instance().getSession();
			return listSensorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sensor[] listSensorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoVPPPersistentManager.instance().getSession();
			return listSensorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySensor(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.Sensor as Sensor");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySensor(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.Sensor as Sensor");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Sensor", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sensor[] listSensorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = querySensor(session, condition, orderBy);
			return (Sensor[]) list.toArray(new Sensor[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sensor[] listSensorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = querySensor(session, condition, orderBy, lockMode);
			return (Sensor[]) list.toArray(new Sensor[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sensor loadSensorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoVPPPersistentManager.instance().getSession();
			return loadSensorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sensor loadSensorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoVPPPersistentManager.instance().getSession();
			return loadSensorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sensor loadSensorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Sensor[] sensors = listSensorByQuery(session, condition, orderBy);
		if (sensors != null && sensors.length > 0)
			return sensors[0];
		else
			return null;
	}
	
	public static Sensor loadSensorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Sensor[] sensors = listSensorByQuery(session, condition, orderBy, lockMode);
		if (sensors != null && sensors.length > 0)
			return sensors[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateSensorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoVPPPersistentManager.instance().getSession();
			return iterateSensorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSensorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoVPPPersistentManager.instance().getSession();
			return iterateSensorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSensorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.Sensor as Sensor");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSensorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.Sensor as Sensor");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Sensor", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sensor createSensor() {
		return new model.Sensor();
	}
	
	public static boolean save(model.Sensor sensor) throws PersistentException {
		try {
			ProyectoVPPPersistentManager.instance().saveObject(sensor);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(model.Sensor sensor) throws PersistentException {
		try {
			ProyectoVPPPersistentManager.instance().deleteObject(sensor);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.Sensor sensor)throws PersistentException {
		try {
			model.Medida[] lMedidas = sensor.medida.toArray();
			for(int i = 0; i < lMedidas.length; i++) {
				lMedidas[i].setSensor(null);
			}
			return delete(sensor);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.Sensor sensor, org.orm.PersistentSession session)throws PersistentException {
		try {
			model.Medida[] lMedidas = sensor.medida.toArray();
			for(int i = 0; i < lMedidas.length; i++) {
				lMedidas[i].setSensor(null);
			}
			try {
				session.delete(sensor);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(model.Sensor sensor) throws PersistentException {
		try {
			ProyectoVPPPersistentManager.instance().getSession().refresh(sensor);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(model.Sensor sensor) throws PersistentException {
		try {
			ProyectoVPPPersistentManager.instance().getSession().evict(sensor);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sensor loadSensorByCriteria(SensorCriteria sensorCriteria) {
		Sensor[] sensors = listSensorByCriteria(sensorCriteria);
		if(sensors == null || sensors.length == 0) {
			return null;
		}
		return sensors[0];
	}
	
	public static Sensor[] listSensorByCriteria(SensorCriteria sensorCriteria) {
		return sensorCriteria.listSensor();
	}
}
