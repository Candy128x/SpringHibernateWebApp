package com.pf18.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pf18.dao.ManifestDao;
import com.pf18.model.Manifest;

@Repository
public class ManifestDaoImpl implements ManifestDao {
	@Autowired
	private SessionFactory session;

	@Override
	public void add(Manifest manifest) {
		// TODO Auto-generated method stub
		session.getCurrentSession().save(manifest);
	}

	@Override
	public void edit(Manifest manifest) {
		// TODO Auto-generated method stub
		session.getCurrentSession().update(manifest);
	}

	@Override
	public void delete(int manifestId) {
		// TODO Auto-generated method stub
		session.getCurrentSession().delete(getManifest(manifestId));
	}

	@Override
	public Manifest getManifest(int manifestId) {
		// TODO Auto-generated method stub
		return (Manifest)session.getCurrentSession().get(Manifest.class, manifestId);
	}

	@Override
	public List getAllManifest() {
		// TODO Auto-generated method stub
		return session.getCurrentSession().createQuery("from dummy_merchant_manifest").list();
	}

}
