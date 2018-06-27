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

public class RespuestaCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression usuarioId;
	public final AssociationExpression usuario;
	public final TimestampExpression created_at;
	public final IntegerExpression respuesta;
	public final BooleanExpression aprobado;
	
	public RespuestaCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		usuarioId = new IntegerExpression("usuario.id", this);
		usuario = new AssociationExpression("usuario", this);
		created_at = new TimestampExpression("created_at", this);
		respuesta = new IntegerExpression("respuesta", this);
		aprobado = new BooleanExpression("aprobado", this);
	}
	
	public RespuestaCriteria(PersistentSession session) {
		this(session.createCriteria(Respuesta.class));
	}
	
	public RespuestaCriteria() throws PersistentException {
		this(ProyectoVPPPersistentManager.instance().getSession());
	}
	
	public UsuarioCriteria createUsuarioCriteria() {
		return new UsuarioCriteria(createCriteria("usuario"));
	}
	
	public Respuesta uniqueRespuesta() {
		return (Respuesta) super.uniqueResult();
	}
	
	public Respuesta[] listRespuesta() {
		java.util.List list = super.list();
		return (Respuesta[]) list.toArray(new Respuesta[list.size()]);
	}
}

