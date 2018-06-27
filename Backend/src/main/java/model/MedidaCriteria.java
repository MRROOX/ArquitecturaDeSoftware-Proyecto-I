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

public class MedidaCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression sensorId;
	public final AssociationExpression sensor;
	public final TimestampExpression created_at;
	public final IntegerExpression saturacion;
	public final IntegerExpression temperatura;
	
	public MedidaCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		sensorId = new IntegerExpression("sensor.id", this);
		sensor = new AssociationExpression("sensor", this);
		created_at = new TimestampExpression("created_at", this);
		saturacion = new IntegerExpression("saturacion", this);
		temperatura = new IntegerExpression("temperatura", this);
	}
	
	public MedidaCriteria(PersistentSession session) {
		this(session.createCriteria(Medida.class));
	}
	
	public MedidaCriteria() throws PersistentException {
		this(ProyectoVPPPersistentManager.instance().getSession());
	}
	
	public SensorCriteria createSensorCriteria() {
		return new SensorCriteria(createCriteria("sensor"));
	}
	
	public Medida uniqueMedida() {
		return (Medida) super.uniqueResult();
	}
	
	public Medida[] listMedida() {
		java.util.List list = super.list();
		return (Medida[]) list.toArray(new Medida[list.size()]);
	}
}

