package com.fileupload.dao;

import java.util.List;

import com.fileupload.entity.UploadFile;

public interface IFileUploadDao {
	void saveFile(UploadFile uploadFile);
	List<Object[]> getFileIdsAndNames();
	UploadFile loadFile(Integer fileId);

}
