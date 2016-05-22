package com.nhn.hkj.recordmaker.employee;

import java.util.List;

public class EmployeeManager {
	// �����ȣ, ���� ���� LIST�� �����ȣ �ߺ��Ǵ� ���� ����, ����ϴ� Ŭ����
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
