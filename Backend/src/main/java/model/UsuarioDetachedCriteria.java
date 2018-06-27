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

public class UsuarioDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression rolId;
	public final AssociationExpression rol;
	public final TimestampExpression created_at;
	public final StringExpression nombre;
	public final StringExpression password;
	public final StringExpression correo;
	public final CollectionExpression preguntas;
	
	public UsuarioDetachedCriteria() {
		super(model.Usuario.class, model.UsuarioCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		rolId = new IntegerExpression("rol.id", this.getDetachedCriteria());
		rol = new AssociationExpression("rol", this.getDetachedCriteria());
		created_at = new TimestampExpression("created_at", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		correo = new StringExpression("correo", this.getDetachedCriteria());
		preguntas = new CollectionExpression("ORM_Preguntas", this.getDetachedCriteria());
	}
	
	public UsuarioDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, model.UsuarioCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		rolId = new IntegerExpression("rol.id", this.getDetachedCriteria());
		rol = new AssociationExpression("rol", this.getDetachedCriteria());
		created_at = new TimestampExpression("created_at", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		correo = new StringExpression("correo", this.getDetachedCriteria());
		preguntas = new CollectionExpression("ORM_Preguntas", this.getDetachedCriteria());
	}
	
	public RolDetachedCriteria createRolCriteria() {
		return new RolDetachedCriteria(createCriteria("rol"));
	}
	
	public PreguntaDetachedCriteria createPreguntasCriteria() {
		return new PreguntaDetachedCriteria(createCriteria("ORM_Preguntas"));
	}
	
	public Usuario uniqueUsuario(PersistentSession session) {
		return (Usuario) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Usuario[] listUsuario(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Usuario[]) list.toArray(new Usuario[list.size()]);
	}
}

