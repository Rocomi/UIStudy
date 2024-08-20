package com.kh.model.vo;

import java.io.Serializable;

public class User implements Serializable {
	
	private String nickName;
	private int score;
	
	public User() {
		super();
	}

	public User(String nickName) {
		this.nickName = nickName;
		this.score = 0;
	}
	
	public User(String nickName, int score) {
		super();
		this.nickName = nickName;
		this.score = score;
	}
	
	public String toString() {
		return String.format("%s님의 점수는 %d", nickName, score);
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	

}
