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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class SensorCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression direccion;
	public final StringExpression ciudad;
	public final CollectionExpression medida;
	
	public SensorCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		direccion = new StringExpression("direccion", this);
		ciudad = new StringExpression("ciudad", this);
		medida = new CollectionExpression("ORM_Medida", this);
	}
	
	public SensorCriteria(PersistentSession session) {
		this(session.createCriteria(Sensor.class));
	}
	
	public SensorCriteria() throws PersistentException {
		this(ProyectoVPPPersistentManager.instance().getSession());
	}
	
	public MedidaCriteria createMedidaCriteria() {
		return new MedidaCriteria(createCriteria("ORM_Medida"));
	}
	
	public Sensor uniqueSensor() {
		return (Sensor) super.uniqueResult();
	}
	
	public Sensor[] listSensor() {
		java.util.List list = super.list();
		return (Sensor[]) list.toArray(new Sensor[list.size()]);
	}
}

