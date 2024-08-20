package com.kh.controller;

import java.io.File;
import java.io.IOException;
import com.kh.game.list.NumBaseball;
import com.kh.game.list.RockSissorPaper;
import com.kh.game.list.UpAndDown;
import com.kh.model.dao.UserDAO;
import com.kh.model.vo.User;

public class PlayController {

	private UserDAO ud = new UserDAO();
	
	public void game01() {
		new UpAndDown(ud.getUserInfo());
	}

	public void game02() {
		new RockSissorPaper(ud.getUserInfo());
	}

	public void game03() {
		new NumBaseball(ud.getUserInfo());
	}

	public User getUserInfo() {
		return ud.getUserInfo();
	}
	
	public void fileSave(String nickName) {
		ud.fileSave(nickName);
	}
	
	public void makeNickName(String nickName) {
		File f = new File(nickName + ".txt");

		if (!f.exists()) {
			try {
				ud.UserNickName(nickName);
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else {
			ud.fileRead(nickName);
		}
	}

}
