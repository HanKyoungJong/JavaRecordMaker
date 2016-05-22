package com.nhn.hkj.recordmaker.employee;
import java.util.ArrayList;
import java.util.List;

import com.nhn.hkj.recordmaker.tool.RandomNumGenerator;
import com.nhn.hkj.recordmaker.util.CommonUtil;

public class EmployeeRepo {
	//����� �������丮
	private static final String PRIMARY_DOMAIN = "NT";

	private List<Employee> employeeList;
	private RandomNumGenerator generator;
	
	public EmployeeRepo(int size) {
		generator = new RandomNumGenerator();
		employeeList = createEmployeeList(size);
	}
	//��� list�� ����� �����ȣ��, ������ ����Ʈ�� ����
	private List<Employee> createEmployeeList(int size) {
		List<Employee> employeeList = new ArrayList<Employee>();
		for (int i = 0; i < size; i++) {
			String primaryKey = PRIMARY_DOMAIN + CommonUtil.getDigitNumber(i);
			int score = generator.getRandomNum(100);
			Employee e = new Employee(primaryKey, score);
			employeeList.add(e);
		}
		return employeeList;
	}

	public List<Employee> getDummyEmployeeList() {
		return employeeList;
	}
}
