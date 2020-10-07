package com.fileupload.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.fileupload.dao.IFileUploadDao;
import com.fileupload.entity.UploadFile;
@Repository
@Transactional
public class FileUploadDaoImpl implements IFileUploadDao {
	
	@Autowired
	HibernateTemplate ht;

	@Override
	public void saveFile(UploadFile uploadFile) {
		// TODO Auto-generated method stub
		ht.save(uploadFile);
	}

	@Override
	public List<Object[]> getFileIdsAndNames() {
		// TODO Auto-generated method stub
		List<Object[]> list=(List<Object[]>)ht.find("select uf.fileId ,uf.fileName from UploadFile uf");
		return list;
	}

	@Override
	public UploadFile loadFile(Integer fileId) {
		// TODO Auto-generated method stub
		return ht.get(UploadFile.class,fileId);
	}

}
