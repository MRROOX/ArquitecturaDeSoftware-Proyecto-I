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

public class PreguntaDAO {
	public static Pregunta loadPreguntaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = ProyectoVPPPersistentManager.instance().getSession();
			return loadPreguntaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pregunta getPreguntaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = ProyectoVPPPersistentManager.instance().getSession();
			return getPreguntaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pregunta loadPreguntaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoVPPPersistentManager.instance().getSession();
			return loadPreguntaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pregunta getPreguntaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoVPPPersistentManager.instance().getSession();
			return getPreguntaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pregunta loadPreguntaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Pregunta) session.load(model.Pregunta.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pregunta getPreguntaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Pregunta) session.get(model.Pregunta.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pregunta loadPreguntaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Pregunta) session.load(model.Pregunta.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pregunta getPreguntaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Pregunta) session.get(model.Pregunta.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPregunta(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoVPPPersistentManager.instance().getSession();
			return queryPregunta(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPregunta(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoVPPPersistentManager.instance().getSession();
			return queryPregunta(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pregunta[] listPreguntaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoVPPPersistentManager.instance().getSession();
			return listPreguntaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pregunta[] listPreguntaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoVPPPersistentManager.instance().getSession();
			return listPreguntaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPregunta(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.Pregunta as Pregunta");
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
	
	public static List queryPregunta(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.Pregunta as Pregunta");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Pregunta", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pregunta[] listPreguntaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPregunta(session, condition, orderBy);
			return (Pregunta[]) list.toArray(new Pregunta[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pregunta[] listPreguntaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPregunta(session, condition, orderBy, lockMode);
			return (Pregunta[]) list.toArray(new Pregunta[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pregunta loadPreguntaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoVPPPersistentManager.instance().getSession();
			return loadPreguntaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pregunta loadPreguntaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoVPPPersistentManager.instance().getSession();
			return loadPreguntaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pregunta loadPreguntaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Pregunta[] preguntas = listPreguntaByQuery(session, condition, orderBy);
		if (preguntas != null && preguntas.length > 0)
			return preguntas[0];
		else
			return null;
	}
	
	public static Pregunta loadPreguntaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Pregunta[] preguntas = listPreguntaByQuery(session, condition, orderBy, lockMode);
		if (preguntas != null && preguntas.length > 0)
			return preguntas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePreguntaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoVPPPersistentManager.instance().getSession();
			return iteratePreguntaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePreguntaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoVPPPersistentManager.instance().getSession();
			return iteratePreguntaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePreguntaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.Pregunta as Pregunta");
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
	
	public static java.util.Iterator iteratePreguntaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.Pregunta as Pregunta");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Pregunta", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pregunta createPregunta() {
		return new model.Pregunta();
	}
	
	public static boolean save(model.Pregunta pregunta) throws PersistentException {
		try {
			ProyectoVPPPersistentManager.instance().saveObject(pregunta);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(model.Pregunta pregunta) throws PersistentException {
		try {
			ProyectoVPPPersistentManager.instance().deleteObject(pregunta);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.Pregunta pregunta)throws PersistentException {
		try {
			if (pregunta.getUsuario() != null) {
				pregunta.getUsuario().preguntas.remove(pregunta);
			}
			
			return delete(pregunta);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.Pregunta pregunta, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (pregunta.getUsuario() != null) {
				pregunta.getUsuario().preguntas.remove(pregunta);
			}
			
			try {
				session.delete(pregunta);
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
	
	public static boolean refresh(model.Pregunta pregunta) throws PersistentException {
		try {
			ProyectoVPPPersistentManager.instance().getSession().refresh(pregunta);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(model.Pregunta pregunta) throws PersistentException {
		try {
			ProyectoVPPPersistentManager.instance().getSession().evict(pregunta);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pregunta loadPreguntaByCriteria(PreguntaCriteria preguntaCriteria) {
		Pregunta[] preguntas = listPreguntaByCriteria(preguntaCriteria);
		if(preguntas == null || preguntas.length == 0) {
			return null;
		}
		return preguntas[0];
	}
	
	public static Pregunta[] listPreguntaByCriteria(PreguntaCriteria preguntaCriteria) {
		return preguntaCriteria.listPregunta();
	}
}
