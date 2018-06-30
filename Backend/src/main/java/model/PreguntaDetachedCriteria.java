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

public class PreguntaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression usuarioId;
	public final AssociationExpression usuario;
	public final TimestampExpression created_at;
	public final StringExpression pregunta;
	public final StringExpression descripcion;
	public final BooleanExpression aprobado;
	public final CollectionExpression respuestas;
	
	public PreguntaDetachedCriteria() {
		super(model.Pregunta.class, model.PreguntaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		usuarioId = new IntegerExpression("usuario.id", this.getDetachedCriteria());
		usuario = new AssociationExpression("usuario", this.getDetachedCriteria());
		created_at = new TimestampExpression("created_at", this.getDetachedCriteria());
		pregunta = new StringExpression("pregunta", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		aprobado = new BooleanExpression("aprobado", this.getDetachedCriteria());
		respuestas = new CollectionExpression("ORM_Respuestas", this.getDetachedCriteria());
	}
	
	public PreguntaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, model.PreguntaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		usuarioId = new IntegerExpression("usuario.id", this.getDetachedCriteria());
		usuario = new AssociationExpression("usuario", this.getDetachedCriteria());
		created_at = new TimestampExpression("created_at", this.getDetachedCriteria());
		pregunta = new StringExpression("pregunta", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		aprobado = new BooleanExpression("aprobado", this.getDetachedCriteria());
		respuestas = new CollectionExpression("ORM_Respuestas", this.getDetachedCriteria());
	}
	
	public UsuarioDetachedCriteria createUsuarioCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("usuario"));
	}
	
	public RespuestaDetachedCriteria createRespuestasCriteria() {
		return new RespuestaDetachedCriteria(createCriteria("ORM_Respuestas"));
	}
	
	public Pregunta uniquePregunta(PersistentSession session) {
		return (Pregunta) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Pregunta[] listPregunta(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Pregunta[]) list.toArray(new Pregunta[list.size()]);
	}
}

