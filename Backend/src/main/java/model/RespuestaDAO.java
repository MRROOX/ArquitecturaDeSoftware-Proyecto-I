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

public class RespuestaDAO {
	public static Respuesta loadRespuestaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = ProyectoVPPPersistentManager.instance().getSession();
			return loadRespuestaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Respuesta getRespuestaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = ProyectoVPPPersistentManager.instance().getSession();
			return getRespuestaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Respuesta loadRespuestaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoVPPPersistentManager.instance().getSession();
			return loadRespuestaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Respuesta getRespuestaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoVPPPersistentManager.instance().getSession();
			return getRespuestaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Respuesta loadRespuestaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Respuesta) session.load(model.Respuesta.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Respuesta getRespuestaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Respuesta) session.get(model.Respuesta.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Respuesta loadRespuestaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Respuesta) session.load(model.Respuesta.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Respuesta getRespuestaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Respuesta) session.get(model.Respuesta.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryRespuesta(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoVPPPersistentManager.instance().getSession();
			return queryRespuesta(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryRespuesta(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoVPPPersistentManager.instance().getSession();
			return queryRespuesta(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Respuesta[] listRespuestaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoVPPPersistentManager.instance().getSession();
			return listRespuestaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Respuesta[] listRespuestaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoVPPPersistentManager.instance().getSession();
			return listRespuestaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryRespuesta(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.Respuesta as Respuesta");
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
	
	public static List queryRespuesta(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.Respuesta as Respuesta");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Respuesta", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Respuesta[] listRespuestaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryRespuesta(session, condition, orderBy);
			return (Respuesta[]) list.toArray(new Respuesta[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Respuesta[] listRespuestaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryRespuesta(session, condition, orderBy, lockMode);
			return (Respuesta[]) list.toArray(new Respuesta[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Respuesta loadRespuestaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoVPPPersistentManager.instance().getSession();
			return loadRespuestaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Respuesta loadRespuestaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoVPPPersistentManager.instance().getSession();
			return loadRespuestaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Respuesta loadRespuestaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Respuesta[] respuestas = listRespuestaByQuery(session, condition, orderBy);
		if (respuestas != null && respuestas.length > 0)
			return respuestas[0];
		else
			return null;
	}
	
	public static Respuesta loadRespuestaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Respuesta[] respuestas = listRespuestaByQuery(session, condition, orderBy, lockMode);
		if (respuestas != null && respuestas.length > 0)
			return respuestas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateRespuestaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoVPPPersistentManager.instance().getSession();
			return iterateRespuestaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateRespuestaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoVPPPersistentManager.instance().getSession();
			return iterateRespuestaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateRespuestaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.Respuesta as Respuesta");
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
	
	public static java.util.Iterator iterateRespuestaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.Respuesta as Respuesta");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Respuesta", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Respuesta createRespuesta() {
		return new model.Respuesta();
	}
	
	public static boolean save(model.Respuesta respuesta) throws PersistentException {
		try {
			ProyectoVPPPersistentManager.instance().saveObject(respuesta);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(model.Respuesta respuesta) throws PersistentException {
		try {
			ProyectoVPPPersistentManager.instance().deleteObject(respuesta);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(model.Respuesta respuesta) throws PersistentException {
		try {
			ProyectoVPPPersistentManager.instance().getSession().refresh(respuesta);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(model.Respuesta respuesta) throws PersistentException {
		try {
			ProyectoVPPPersistentManager.instance().getSession().evict(respuesta);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Respuesta loadRespuestaByCriteria(RespuestaCriteria respuestaCriteria) {
		Respuesta[] respuestas = listRespuestaByCriteria(respuestaCriteria);
		if(respuestas == null || respuestas.length == 0) {
			return null;
		}
		return respuestas[0];
	}
	
	public static Respuesta[] listRespuestaByCriteria(RespuestaCriteria respuestaCriteria) {
		return respuestaCriteria.listRespuesta();
	}
}
