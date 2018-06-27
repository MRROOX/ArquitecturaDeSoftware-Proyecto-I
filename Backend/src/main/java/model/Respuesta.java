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

public class Respuesta {
	public Respuesta() {
	}
	
	private int id;
	
	private model.Usuario usuario;
	
	private java.sql.Timestamp created_at;
	
	private int respuesta;
	
	private boolean aprobado;
	
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
	
	public void setRespuesta(int value) {
		this.respuesta = value;
	}
	
	public int getRespuesta() {
		return respuesta;
	}
	
	public void setAprobado(boolean value) {
		this.aprobado = value;
	}
	
	public boolean getAprobado() {
		return aprobado;
	}
	
	public void setUsuario(model.Usuario value) {
		this.usuario = value;
	}
	
	public model.Usuario getUsuario() {
		return usuario;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
