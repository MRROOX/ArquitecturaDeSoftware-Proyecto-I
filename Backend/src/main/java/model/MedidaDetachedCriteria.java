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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class MedidaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression sensorId;
	public final AssociationExpression sensor;
	public final TimestampExpression created_at;
	public final IntegerExpression saturacion;
	public final IntegerExpression temperatura;
	
	public MedidaDetachedCriteria() {
		super(model.Medida.class, model.MedidaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		sensorId = new IntegerExpression("sensor.id", this.getDetachedCriteria());
		sensor = new AssociationExpression("sensor", this.getDetachedCriteria());
		created_at = new TimestampExpression("created_at", this.getDetachedCriteria());
		saturacion = new IntegerExpression("saturacion", this.getDetachedCriteria());
		temperatura = new IntegerExpression("temperatura", this.getDetachedCriteria());
	}
	
	public MedidaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, model.MedidaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		sensorId = new IntegerExpression("sensor.id", this.getDetachedCriteria());
		sensor = new AssociationExpression("sensor", this.getDetachedCriteria());
		created_at = new TimestampExpression("created_at", this.getDetachedCriteria());
		saturacion = new IntegerExpression("saturacion", this.getDetachedCriteria());
		temperatura = new IntegerExpression("temperatura", this.getDetachedCriteria());
	}
	
	public SensorDetachedCriteria createSensorCriteria() {
		return new SensorDetachedCriteria(createCriteria("sensor"));
	}
	
	public Medida uniqueMedida(PersistentSession session) {
		return (Medida) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Medida[] listMedida(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Medida[]) list.toArray(new Medida[list.size()]);
	}
}

