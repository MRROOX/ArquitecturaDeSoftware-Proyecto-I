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

public class RespuestaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression usuarioId;
	public final AssociationExpression usuario;
	public final TimestampExpression created_at;
	public final StringExpression respuesta;
	public final BooleanExpression aprobado;
	
	public RespuestaDetachedCriteria() {
		super(model.Respuesta.class, model.RespuestaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		usuarioId = new IntegerExpression("usuario.id", this.getDetachedCriteria());
		usuario = new AssociationExpression("usuario", this.getDetachedCriteria());
		created_at = new TimestampExpression("created_at", this.getDetachedCriteria());
		respuesta = new StringExpression("respuesta", this.getDetachedCriteria());
		aprobado = new BooleanExpression("aprobado", this.getDetachedCriteria());
	}
	
	public RespuestaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, model.RespuestaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		usuarioId = new IntegerExpression("usuario.id", this.getDetachedCriteria());
		usuario = new AssociationExpression("usuario", this.getDetachedCriteria());
		created_at = new TimestampExpression("created_at", this.getDetachedCriteria());
		respuesta = new StringExpression("respuesta", this.getDetachedCriteria());
		aprobado = new BooleanExpression("aprobado", this.getDetachedCriteria());
	}
	
	public UsuarioDetachedCriteria createUsuarioCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("usuario"));
	}
	
	public Respuesta uniqueRespuesta(PersistentSession session) {
		return (Respuesta) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Respuesta[] listRespuesta(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Respuesta[]) list.toArray(new Respuesta[list.size()]);
	}
}

