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

public class RolDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression nombre;
	
	public RolDetachedCriteria() {
		super(model.Rol.class, model.RolCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
	}
	
	public RolDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, model.RolCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
	}
	
	public Rol uniqueRol(PersistentSession session) {
		return (Rol) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Rol[] listRol(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Rol[]) list.toArray(new Rol[list.size()]);
	}
}

