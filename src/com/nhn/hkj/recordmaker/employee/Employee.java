package com.nhn.hkj.recordmaker.employee;

public class Employee {
	//사원번호, 점수 관리
	private String primaryKey;
	private int score;

	public Employee() {
		super();
	}
	//
	public Employee(String primaryKey, int score) {
		super();
		this.primaryKey = primaryKey;
		this.score = score;
	}

	public String getPrimaryKey() {
		return primaryKey;
	}

	public void setPrimaryKey(String primaryKey) {
		this.primaryKey = primaryKey;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return  primaryKey + " " + score ;
	}
}
