package com.monomolecular.entryteam;

public class Gun {
	private String name;
	private int ammo;
	private int rpm;
	
	public Gun(String name, int ammo, int rpm) {
		this.name = name;
		this.ammo = ammo;
		this.rpm = rpm;
	}
	
	public String getName() {
		return name;
	}
	public int getAmmo() {
		return ammo;
	}
	public int getRpm() {
		return rpm;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAmmo(int ammo) {
		this.ammo = ammo;
	}
	public void setRpm(int rpm) {
		this.rpm = rpm;
	}
	
	
}
