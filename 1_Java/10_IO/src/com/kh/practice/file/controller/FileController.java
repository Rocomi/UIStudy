package com.kh.practice.file.controller;

import com.kh.practice.file.model.dao.FileDAO;

public class FileController {
	
	private FileDAO fd = new FileDAO();
	
	public boolean checkName(String file) {
		
		boolean result = fd.checkName(file);	
		return result;
		// return fd.checkName(file);		//호출한 결과를 그대로 return
	}
	
	public void fileSave(String file, StringBuilder sb) {
		
		fd.fileSave(file, sb.toString());
		
	}
	
	public StringBuilder fileOpen(String file) {
		
		return fd.fileOpen(file);
	}
	
	public void fileEdit(String file, StringBuilder sb) {
		
		fd.fileEdit(file,  sb.toString());
		
	}
	
	

}
