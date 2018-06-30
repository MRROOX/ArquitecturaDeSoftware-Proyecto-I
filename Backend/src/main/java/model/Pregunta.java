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

public class Pregunta {
	public Pregunta() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_PREGUNTA_RESPUESTAS) {
			return ORM_respuestas;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_PREGUNTA_USUARIO) {
			this.usuario = (model.Usuario) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private model.Usuario usuario;
	
	private java.sql.Timestamp created_at;
	
	private String pregunta;
	
	private String descripcion;
	
	private boolean aprobado;
	
	private java.util.Set ORM_respuestas = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setCreated_at(java.sql.Timestamp value) {
		this.created_at = value;
	}
	
	public java.sql.Timestamp getCreated_at() {
		return created_at;
	}
	
	public void setPregunta(String value) {
		this.pregunta = value;
	}
	
	public String getPregunta() {
		return pregunta;
	}
	
	public void setDescripcion(String value) {
		this.descripcion = value;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setAprobado(boolean value) {
		this.aprobado = value;
	}
	
	public boolean getAprobado() {
		return aprobado;
	}
	
	public void setUsuario(model.Usuario value) {
		if (usuario != null) {
			usuario.preguntas.remove(this);
		}
		if (value != null) {
			value.preguntas.add(this);
		}
	}
	
        @com.fasterxml.jackson.annotation.JsonManagedReference
	public model.Usuario getUsuario() {
		return usuario;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Usuario(model.Usuario value) {
		this.usuario = value;
	}
	
	private model.Usuario getORM_Usuario() {
		return usuario;
	}
	
	private void setORM_Respuestas(java.util.Set value) {
		this.ORM_respuestas = value;
	}
	
	private java.util.Set getORM_Respuestas() {
		return ORM_respuestas;
	}
	
        @com.fasterxml.jackson.annotation.JsonManagedReference
	public final model.RespuestaSetCollection respuestas = new model.RespuestaSetCollection(this, _ormAdapter, ORMConstants.KEY_PREGUNTA_RESPUESTAS, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
