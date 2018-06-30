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

public class MedidaDAO {
	public static Medida loadMedidaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = ProyectoVPPPersistentManager.instance().getSession();
			return loadMedidaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Medida getMedidaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = ProyectoVPPPersistentManager.instance().getSession();
			return getMedidaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Medida loadMedidaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoVPPPersistentManager.instance().getSession();
			return loadMedidaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Medida getMedidaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoVPPPersistentManager.instance().getSession();
			return getMedidaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Medida loadMedidaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Medida) session.load(model.Medida.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Medida getMedidaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Medida) session.get(model.Medida.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Medida loadMedidaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Medida) session.load(model.Medida.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Medida getMedidaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Medida) session.get(model.Medida.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMedida(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoVPPPersistentManager.instance().getSession();
			return queryMedida(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMedida(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoVPPPersistentManager.instance().getSession();
			return queryMedida(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Medida[] listMedidaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoVPPPersistentManager.instance().getSession();
			return listMedidaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Medida[] listMedidaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoVPPPersistentManager.instance().getSession();
			return listMedidaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMedida(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.Medida as Medida");
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
	
	public static List queryMedida(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.Medida as Medida");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Medida", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Medida[] listMedidaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryMedida(session, condition, orderBy);
			return (Medida[]) list.toArray(new Medida[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Medida[] listMedidaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryMedida(session, condition, orderBy, lockMode);
			return (Medida[]) list.toArray(new Medida[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Medida loadMedidaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoVPPPersistentManager.instance().getSession();
			return loadMedidaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Medida loadMedidaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoVPPPersistentManager.instance().getSession();
			return loadMedidaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Medida loadMedidaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Medida[] medidas = listMedidaByQuery(session, condition, orderBy);
		if (medidas != null && medidas.length > 0)
			return medidas[0];
		else
			return null;
	}
	
	public static Medida loadMedidaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Medida[] medidas = listMedidaByQuery(session, condition, orderBy, lockMode);
		if (medidas != null && medidas.length > 0)
			return medidas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateMedidaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoVPPPersistentManager.instance().getSession();
			return iterateMedidaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMedidaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoVPPPersistentManager.instance().getSession();
			return iterateMedidaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMedidaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.Medida as Medida");
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
	
	public static java.util.Iterator iterateMedidaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From model.Medida as Medida");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Medida", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Medida createMedida() {
		return new model.Medida();
	}
	
	public static boolean save(model.Medida medida) throws PersistentException {
		try {
			ProyectoVPPPersistentManager.instance().saveObject(medida);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(model.Medida medida) throws PersistentException {
		try {
			ProyectoVPPPersistentManager.instance().deleteObject(medida);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.Medida medida)throws PersistentException {
		try {
			if (medida.getSensor() != null) {
				medida.getSensor().medidas.remove(medida);
			}
			
			return delete(medida);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(model.Medida medida, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (medida.getSensor() != null) {
				medida.getSensor().medidas.remove(medida);
			}
			
			try {
				session.delete(medida);
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
	
	public static boolean refresh(model.Medida medida) throws PersistentException {
		try {
			ProyectoVPPPersistentManager.instance().getSession().refresh(medida);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(model.Medida medida) throws PersistentException {
		try {
			ProyectoVPPPersistentManager.instance().getSession().evict(medida);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Medida loadMedidaByCriteria(MedidaCriteria medidaCriteria) {
		Medida[] medidas = listMedidaByCriteria(medidaCriteria);
		if(medidas == null || medidas.length == 0) {
			return null;
		}
		return medidas[0];
	}
	
	public static Medida[] listMedidaByCriteria(MedidaCriteria medidaCriteria) {
		return medidaCriteria.listMedida();
	}
}
