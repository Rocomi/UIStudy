package com.kh.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import com.kh.model.vo.User;

public class UserDAO {
	
	private User user = new User();
	
	public void UserNickName(String nickName) {
		user = new User(nickName);
	}

	public void fileRead(String nickName) {

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nickName + ".txt"))) {

			User u = (User) ois.readObject();
			user = u;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void fileSave(String nickName) {

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nickName + ".txt"))) {

			oos.writeObject(user);
			oos.flush();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public User getUserInfo() {
		return user;
	}

}
