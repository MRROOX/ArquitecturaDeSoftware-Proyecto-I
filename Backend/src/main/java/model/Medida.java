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

public class Medida {
	public Medida() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_MEDIDA_SENSOR) {
			this.sensor = (model.Sensor) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private model.Sensor sensor;
	
	private java.sql.Timestamp created_at;
	
	private int saturacion;
	
	private int temperatura;
	
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
	
	public void setSaturacion(int value) {
		this.saturacion = value;
	}
	
	public int getSaturacion() {
		return saturacion;
	}
	
	public void setTemperatura(int value) {
		this.temperatura = value;
	}
	
	public int getTemperatura() {
		return temperatura;
	}
	
	public void setSensor(model.Sensor value) {
		if (sensor != null) {
			sensor.medidas.remove(this);
		}
		if (value != null) {
			value.medidas.add(this);
		}
	}
	
	public model.Sensor getSensor() {
		return sensor;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Sensor(model.Sensor value) {
		this.sensor = value;
	}
	
	private model.Sensor getORM_Sensor() {
		return sensor;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
