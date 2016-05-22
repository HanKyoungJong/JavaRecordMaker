package com.nhn.hkj.recordmaker.employee;

import java.util.List;

public class EmployeeManager {
	// 사원번호, 점수 관리 LIST에 사원번호 중복되는 값을 제거, 출력하는 클래스
	private List<Employee> employeeList;

	public EmployeeManager(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}

	public void addEmployee(Employee e) {
		employeeList.add(e);
	}

	public void removeEmployee(Employee e) {
		employeeList.remove(e);
	}

	public Employee getEmployee(int idx) {
		return employeeList.get(idx);
	}
}
