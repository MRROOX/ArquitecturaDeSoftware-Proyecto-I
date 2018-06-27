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

public class Sensor {
	public Sensor() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_SENSOR_MEDIDA) {
			return ORM_medida;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int id;
	
	private String direccion;
	
	private String ciudad;
	
	private java.util.Set ORM_medida = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setDireccion(String value) {
		this.direccion = value;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setCiudad(String value) {
		this.ciudad = value;
	}
	
	public String getCiudad() {
		return ciudad;
	}
	
	private void setORM_Medida(java.util.Set value) {
		this.ORM_medida = value;
	}
	
	private java.util.Set getORM_Medida() {
		return ORM_medida;
	}
	
	public final model.MedidaSetCollection medida = new model.MedidaSetCollection(this, _ormAdapter, ORMConstants.KEY_SENSOR_MEDIDA, ORMConstants.KEY_MEDIDA_SENSOR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
