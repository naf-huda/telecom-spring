package com.skillstorm.telecom.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "PLANS")
public class Plan {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int planId;
	
	@Column
	@NotNull
	private int deviceId;
	
	@Column
	@NotNull
	private int cost;

	public Plan() {
		super();
	}

	public Plan(int planId, int deviceId, int cost) {
		super();
		this.planId = planId;
		this.deviceId = deviceId;
		this.cost = cost;
	}

	public int getPlanId() {
		return planId;
	}

	public void setPlanId(int planId) {
		this.planId = planId;
	}

	public int getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cost;
		result = prime * result + deviceId;
		result = prime * result + planId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Plan other = (Plan) obj;
		if (cost != other.cost)
			return false;
		if (deviceId != other.deviceId)
			return false;
		if (planId != other.planId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Plan [planId=" + planId + ", deviceId=" + deviceId + ", cost=" + cost + "]";
	}

}
