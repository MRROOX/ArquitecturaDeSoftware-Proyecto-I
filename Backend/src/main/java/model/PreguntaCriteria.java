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

public class PreguntaCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression usuarioId;
	public final AssociationExpression usuario;
	public final TimestampExpression created_at;
	public final StringExpression pregunta;
	public final StringExpression descripcion;
	public final BooleanExpression aprobado;
	public final CollectionExpression respuesta;
	
	public PreguntaCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		usuarioId = new IntegerExpression("usuario.id", this);
		usuario = new AssociationExpression("usuario", this);
		created_at = new TimestampExpression("created_at", this);
		pregunta = new StringExpression("pregunta", this);
		descripcion = new StringExpression("descripcion", this);
		aprobado = new BooleanExpression("aprobado", this);
		respuesta = new CollectionExpression("ORM_Respuesta", this);
	}
	
	public PreguntaCriteria(PersistentSession session) {
		this(session.createCriteria(Pregunta.class));
	}
	
	public PreguntaCriteria() throws PersistentException {
		this(ProyectoVPPPersistentManager.instance().getSession());
	}
	
	public UsuarioCriteria createUsuarioCriteria() {
		return new UsuarioCriteria(createCriteria("usuario"));
	}
	
	public RespuestaCriteria createRespuestaCriteria() {
		return new RespuestaCriteria(createCriteria("ORM_Respuesta"));
	}
	
	public Pregunta uniquePregunta() {
		return (Pregunta) super.uniqueResult();
	}
	
	public Pregunta[] listPregunta() {
		java.util.List list = super.list();
		return (Pregunta[]) list.toArray(new Pregunta[list.size()]);
	}
}

