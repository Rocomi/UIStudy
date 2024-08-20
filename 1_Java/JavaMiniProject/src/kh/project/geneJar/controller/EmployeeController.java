package kh.project.geneJar.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

import kh.project.geneJar.model.dao.CustomerLoginDAO;
import kh.project.geneJar.model.dao.Data;
import kh.project.geneJar.model.dao.EmployeeDAO;
import kh.project.geneJar.model.vo.CustomerLogin;
import kh.project.geneJar.model.vo.Employee;

public class EmployeeController {
	private HashMap<String, CustomerLogin> cLog = new HashMap<>();
	private HashMap<String, Employee> eLog = new HashMap<>();
	private Data<CustomerLogin> cld = new CustomerLoginDAO();
	private Data<Employee> eld = new EmployeeDAO();
	private HashMap<Integer, String> foundid = new HashMap<>(); // 관리자의 경우 사원의 아이디 없이 사원정보에 접근하기 위해 Map사용 대신 객체배열 사용
	// 번호만 사용하여 id값 정보 가져올수있는 Map을 생성 -- 검색용으로 사용하고 데이터 수정에
	private static final Employee BOSS = new Employee(0, "0a", "a1234", "엄희윤", '남', "010-7440-****", "임원", 0, 0.0);

	{
		try {
			for (CustomerLogin c : cld.fileRead()) {
				cLog.put(c.getId(), c); // 프로그램 시작시 Customer용 HashMap 초기화
			}
		} catch (NullPointerException e) {
			/* 회원이 없을때 */}

		try {
			for (Employee em : eld.fileRead()) {
				eLog.put(em.getId(), em); // 프로그램 시작시 Admin용 HashMap 초기화
			}
		} catch (NullPointerException e) {

		}

		try {
			for (Employee em : eld.fileRead()) {
				foundid.put(em.getEmpNo(), em.getId()); // 프로그램 시작시 id조회용 HashMap 초기화
			}
		} catch (NullPointerException e) {

		}

		if (eLog.size() == 0) { // 데이터가 날아가면 사장 정보 초기화
			join(BOSS);
		}

	}

	public boolean join(Employee em) { // 자동으로 회원가입 절차 진행 회원가입시 Map 생성

		if (!eLog.containsKey(em.getId())) {
			if (!cLog.containsKey(em.getId())) {
				eLog.put(em.getId(), em);
				foundid.put(em.getEmpNo(), em.getId());
				eld.addData(em);

				return true;
			}
		}
		return false;
	}

	public void modify(int empNo, char gender) {

		eLog.get(foundid.get(empNo)).setGender(gender);

		Employee emp = eLog.get(foundid.get(empNo));
		eLog.put(foundid.get(empNo), emp);

		Employee[] eArr = new Employee[eLog.size()];

		Iterator it = eLog.keySet().iterator();

		for (int i = 0; it.hasNext(); i++) {

			eArr[i] = eLog.get(it.next()); // 배열에 바뀐 데이터를 포함한 모든 데이터 주입

		}

		eld.changeData(eArr);
	}

	public void modify(int empNo, String phone) {
		eLog.get(foundid.get(empNo)).setPhone(phone);
		Employee emp = eLog.get(foundid.get(empNo));

		eLog.put(foundid.get(empNo), emp);
		Employee[] eArr = new Employee[eLog.size()];

		Iterator it = eLog.keySet().iterator();

		for (int i = 0; it.hasNext(); i++) {

			eArr[i] = eLog.get(it.next()); // 배열에 바뀐 데이터를 포함한 모든 데이터 주입

		}

		eld.changeData(eArr);
	}

	public void modify(String dept, int empNo) {
		eLog.get(foundid.get(empNo)).setDept(dept);
		Employee emp = eLog.get(foundid.get(empNo));

		eLog.put(foundid.get(empNo), emp);
		Employee[] eArr = new Employee[eLog.size()];

		Iterator it = eLog.keySet().iterator();

		for (int i = 0; it.hasNext(); i++) {

			eArr[i] = eLog.get(it.next()); // 배열에 바뀐 데이터를 포함한 모든 데이터 주입

		}

		eld.changeData(eArr);
	}

	public void modify(int empNo, int salary) {
		eLog.get(foundid.get(empNo)).setSalary(salary);
		Employee emp = eLog.get(foundid.get(empNo));

		eLog.put(foundid.get(empNo), emp);
		Employee[] eArr = new Employee[eLog.size()];

		Iterator it = eLog.keySet().iterator();

		for (int i = 0; it.hasNext(); i++) {

			eArr[i] = eLog.get(it.next()); // 배열에 바뀐 데이터를 포함한 모든 데이터 주입

		}

		eld.changeData(eArr);
	}

	public void modify(int empNo, double bonus) {
		eLog.get(foundid.get(empNo)).setBonus(bonus);
		Employee emp = eLog.get(foundid.get(empNo));

		eLog.put(foundid.get(empNo), emp);
		Employee[] eArr = new Employee[eLog.size()];

		Iterator it = eLog.keySet().iterator();

		for (int i = 0; it.hasNext(); i++) {

			eArr[i] = eLog.get(it.next()); // 배열에 바뀐 데이터를 포함한 모든 데이터 주입

		}

		eld.changeData(eArr);
	}

	public Employee remove(int empNo) {

		eLog.remove(foundid.get(empNo));

		Employee[] eArr = new Employee[eLog.size()];
		Iterator it = eLog.keySet().iterator();

		for (int i = 0; it.hasNext(); i++) {

			eArr[i] = eLog.get(it.next()); // 배열에 바뀐 데이터를 포함한 모든 데이터 주입

		}
		eld.changeData(eArr);

		return eLog.get(foundid.get(empNo));
	}

	public String inform(int empNo) {

		if (eLog.get(foundid.get(empNo)) == null) {
			return null;
		}
		return eLog.get(foundid.get(empNo)).toString();
	}

	public Employee getE(int empNo) {

		return eLog.get(foundid.get(empNo));

	}

	public void allEmployee() { // -----------------------------현재 사원들이 순서대로 나오지 않고 랜덤으로 나오고 있음 이외 양호
		Employee e = new Employee();
		
		
		Iterator it = eLog.keySet().iterator();

		for (int i = 0; it.hasNext(); i++) {

			e = eLog.get(it.next()); // 객체에 바뀐 데이터를 포함한 모든 데이터 주입

			System.out.println(e);
		}
	}

	public void someEmployee() { // -----------------------------현재 사원들이 순서대로 나오지 않고 랜덤으로 나오고 있음 이외 양호
		Employee e = new Employee();

		Iterator it = eLog.keySet().iterator();

		for (int i = 0; it.hasNext(); i++) {

			e = eLog.get(it.next()); // 객체에 바뀐 데이터를 포함한 모든 데이터 주입

			System.out.println(e.sample());
		}

	}
	
	public Employee adminlogIn(String id, String password) {
		Employee em = eLog.get(id); // Map에서 데이터를 조회

		if (em != null) { // 데이터가 있다면..
			if (em.getPassword().equals(password)) { // 저장된 비밀번호와 전달된 비밀번호 비교
				return em; 
			}
		}
		return null; // 그외 null 반환
	}

	public boolean adminChangePassword(String id, String oldPW, String newPW) {
		
		Employee em = eLog.get(id); // id에 해당하는 객체 조회
		Employee[] eArr = new Employee[eLog.size()];
		if (em != null) {
			if (em.getPassword().equals(oldPW)) { // 저장된 비밀번호와 입력된 기존 비밀번호가 같다면
				em.setPassword(newPW); // 새로운 비밀번호로 변경 완료
				
				Iterator it = eLog.keySet().iterator();
				
				for(int i=0; it.hasNext(); i++) {
				
				eArr[i] = eLog.get(it.next());	// 배열에 바뀐 데이터를 포함한 모든 데이터 주입
				
				}
				
				eld.changeData(eArr);	// 바뀐 배열을 저장하기 위해 메소드 호출
				
				return true;
			}
		}
		return false;
	}

}
