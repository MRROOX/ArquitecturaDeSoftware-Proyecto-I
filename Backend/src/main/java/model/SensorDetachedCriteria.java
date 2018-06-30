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

public class SensorDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression direccion;
	public final StringExpression ciudad;
	public final CollectionExpression medidas;
	
	public SensorDetachedCriteria() {
		super(model.Sensor.class, model.SensorCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		direccion = new StringExpression("direccion", this.getDetachedCriteria());
		ciudad = new StringExpression("ciudad", this.getDetachedCriteria());
		medidas = new CollectionExpression("ORM_Medidas", this.getDetachedCriteria());
	}
	
	public SensorDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, model.SensorCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		direccion = new StringExpression("direccion", this.getDetachedCriteria());
		ciudad = new StringExpression("ciudad", this.getDetachedCriteria());
		medidas = new CollectionExpression("ORM_Medidas", this.getDetachedCriteria());
	}
	
	public MedidaDetachedCriteria createMedidasCriteria() {
		return new MedidaDetachedCriteria(createCriteria("ORM_Medidas"));
	}
	
	public Sensor uniqueSensor(PersistentSession session) {
		return (Sensor) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Sensor[] listSensor(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Sensor[]) list.toArray(new Sensor[list.size()]);
	}
}

