package com.nhn.hkj.recordmaker.logic;

import java.util.List;
import java.util.Scanner;

import com.nhn.hkj.recordmaker.employee.Employee;
import com.nhn.hkj.recordmaker.employee.EmployeeManager;
import com.nhn.hkj.recordmaker.employee.EmployeeRepo;
import com.nhn.hkj.recordmaker.tool.RandomNumGenerator;

public class Controller {
	// 사원번호 점수 객체 관리 클래스
	// 사원수 99999명을 넘어가면 안되기 때문에 설정
	private final int EMPLOYEE_SIZE = 99999;

	private EmployeeManager employeeManager;
	private RandomNumGenerator randomNumGenerator;

	private Scanner scanner;

	public Controller() {
		scanner = new Scanner(System.in);

		EmployeeRepo employeeRepo = new EmployeeRepo(EMPLOYEE_SIZE);
		List<Employee> employeeList = employeeRepo.getDummyEmployeeList();
		employeeManager = new EmployeeManager(employeeList);

		randomNumGenerator = new RandomNumGenerator();
	}

	public void process() {
		// 사원수 입력
		System.out.println("java RecordMaker:");
		int inCnt = scanner.nextInt();

		for (int i = 0; i < inCnt; i++) {
			int randomNum = randomNumGenerator.getRandomNum(EMPLOYEE_SIZE);
			Employee employee = employeeManager.getEmployee(randomNum);
			System.out.println(employee);
		}
	}
}
