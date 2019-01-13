package com.pf18.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pf18.dao.ManifestDao;
import com.pf18.model.Manifest;
import com.pf18.service.ManifestService;

@Service
public class ManifestServiceImpl implements ManifestService {

	@Autowired
	private ManifestDao manifestDao;
	
	@Transactional
	public void add(Manifest manifest) {
		// TODO Auto-generated method stub
		manifestDao.add(manifest);
	}

	@Transactional
	public void edit(Manifest manifest) {
		// TODO Auto-generated method stub
		manifestDao.edit(manifest);
	}

	@Transactional
	public void delete(int manifestId) {
		// TODO Auto-generated method stub
		manifestDao.delete(manifestId);
	}

	@Transactional
	public Manifest getManifest(int manifestId) {
		// TODO Auto-generated method stub
		return manifestDao.getManifest(manifestId);
	}

	@Transactional
	public List getAllManifest() {
		// TODO Auto-generated method stub
		return manifestDao.getAllManifest();
	}

}
