package day13;

import java.util.*;

class Employee {
    String name;
    String id;
    String department;

    public Employee(String name, String id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return Objects.equals(id, employee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

class EmployeeManager {
    Set<Employee> sawon;

    public EmployeeManager() {
        this.sawon = new HashSet<>();
    }

    public void addEmployee(Employee employee) {
        if (!sawon.contains(employee)){
            sawon.add(employee);
            System.out.println("사원 추가 성공 이름: "+employee.name+"\t아이디: "+employee.id+"\t부서: "+employee.department);
        } else{
            System.out.println("중복된 사원이 있습니다.");
        }
    }

    public void findEmployee(String sawon_id){
        for (Employee employee : sawon){
            if (employee.id.equals(sawon_id)){
                System.out.println(employee);
                break;
            } else {
                System.out.println(sawon_id+"해당 사원이 존재하지 않습니다.");
                break;
            }
        }

    }

    public void removeEmployee(Employee employee) {
        if (sawon.contains(employee)){
            System.out.println(employee+"해당 사원의 정보가 삭제되었습니다.");
            sawon.remove(employee);
        } else{
            System.out.println(employee + "존재하지 않는 사원입니다.");
        }

    }
}

public class EmployeeManagerDemo {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        manager.addEmployee(new Employee("홍길동", "E01", "HR"));
        manager.addEmployee(new Employee("김철수", "E02", "Marketing"));
        manager.addEmployee(new Employee("홍길동", "E01", "HR")); // 중복 추가 시도

        manager.findEmployee("E01");
        manager.removeEmployee(new Employee("홍길동", "E01", "HR"));
        manager.findEmployee("E01");
    }
}