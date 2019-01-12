package com.pf18.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Manifest {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column
	private int oid;
	@Column
	private int pid;
	@Column
	private int merchantId;
	@Column
	private String manifestStatus;
	@Column
	private int runnerId;
	@Column
	private String runnerName;
	
	public Manifest() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(int merchantId) {
		this.merchantId = merchantId;
	}
	public String getManifestStatus() {
		return manifestStatus;
	}
	public void setManifestStatus(String manifestStatus) {
		this.manifestStatus = manifestStatus;
	}
	public int getRunnerId() {
		return runnerId;
	}
	public void setRunnerId(int runnerId) {
		this.runnerId = runnerId;
	}
	public String getRunnerName() {
		return runnerName;
	}
	public void setRunnerName(String runnerName) {
		this.runnerName = runnerName;
	}
	
}
