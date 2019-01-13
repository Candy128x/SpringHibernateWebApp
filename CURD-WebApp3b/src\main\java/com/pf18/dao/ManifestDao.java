package com.pf18.dao;

import java.util.List;
import com.pf18.model.Manifest;

public interface ManifestDao {
	public void add(Manifest manifest);
	public void edit(Manifest manifest);
	public void delete(int manifestId);
	public Manifest getManifest(int manifestId);
	public List getAllManifest();
}
