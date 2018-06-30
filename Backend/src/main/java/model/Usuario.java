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

public class Usuario {
	public Usuario() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_USUARIO_PREGUNTAS) {
			return ORM_preguntas;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int id;
	
	private model.Rol rol;
	
	private java.sql.Timestamp created_at;
	
	private String nombre;
	
	private String password;
	
	private String correo;
	
	private java.util.Set ORM_preguntas = new java.util.HashSet();
	
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
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
        @com.fasterxml.jackson.annotation.JsonProperty
	public void setPassword(String value) {
		this.password = value;
	}
	
        @com.fasterxml.jackson.annotation.JsonIgnore
	public String getPassword() {
		return password;
	}
	
	public void setCorreo(String value) {
		this.correo = value;
	}
	
	public String getCorreo() {
		return correo;
	}
	
	public void setRol(model.Rol value) {
		this.rol = value;
	}
	
	public model.Rol getRol() {
		return rol;
	}
	
	private void setORM_Preguntas(java.util.Set value) {
		this.ORM_preguntas = value;
	}
	
	private java.util.Set getORM_Preguntas() {
		return ORM_preguntas;
	}
	
	public final model.PreguntaSetCollection preguntas = new model.PreguntaSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_PREGUNTAS, ORMConstants.KEY_PREGUNTA_USUARIO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
