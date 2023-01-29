package day6Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ArrayListCRUD {
	private List<Employee> empList;

	public ArrayListCRUD() {
		
		this.empList = new ArrayList();
	}
	public void insert(Employee e) {
		empList.add(e);
	}
	public void display() {
		for(Employee e:empList) {
				System.out.println(e);
		}
	}
	public Employee search(int empno) {
		//System.out.println(empList);
		for(Employee e:empList) {
			if(e.getEmpno()==empno) {
				//System.out.println("Found\n"+e);
				return e;
			}			
		}
		return null;
	}
	
	
	public void delete(int empno) {
		int i;
		for(i=0;i<empList.size();i++)
			if(empList.get(i).getEmpno()==empno)
				break;
		if(i<empList.size())
			empList.remove(i);
		
	}
	public void update(int empno) {
		Employee e=search(empno);
		Scanner sc=new Scanner(System.in);
		System.out.println("Emp. name: ");
		e.setName(sc.next());
		System.out.println("Emp. salary: ");
		e.setSalary(sc.nextDouble());
		System.out.println("Updated ");
	}
	
	
}
