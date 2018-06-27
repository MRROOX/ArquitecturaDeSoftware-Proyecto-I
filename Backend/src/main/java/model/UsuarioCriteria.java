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

public class UsuarioCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression rolId;
	public final AssociationExpression rol;
	public final TimestampExpression created_at;
	public final StringExpression nombre;
	public final StringExpression password;
	public final StringExpression correo;
	public final CollectionExpression preguntas;
	
	public UsuarioCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		rolId = new IntegerExpression("rol.id", this);
		rol = new AssociationExpression("rol", this);
		created_at = new TimestampExpression("created_at", this);
		nombre = new StringExpression("nombre", this);
		password = new StringExpression("password", this);
		correo = new StringExpression("correo", this);
		preguntas = new CollectionExpression("ORM_Preguntas", this);
	}
	
	public UsuarioCriteria(PersistentSession session) {
		this(session.createCriteria(Usuario.class));
	}
	
	public UsuarioCriteria() throws PersistentException {
		this(ProyectoVPPPersistentManager.instance().getSession());
	}
	
	public RolCriteria createRolCriteria() {
		return new RolCriteria(createCriteria("rol"));
	}
	
	public PreguntaCriteria createPreguntasCriteria() {
		return new PreguntaCriteria(createCriteria("ORM_Preguntas"));
	}
	
	public Usuario uniqueUsuario() {
		return (Usuario) super.uniqueResult();
	}
	
	public Usuario[] listUsuario() {
		java.util.List list = super.list();
		return (Usuario[]) list.toArray(new Usuario[list.size()]);
	}
}

