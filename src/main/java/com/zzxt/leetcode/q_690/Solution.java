package com.zzxt.leetcode.q_690;/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {

    int sum = 0;


    public int getImportance(List<Employee> employees, int id) {

        Map<Integer, Employee> employeeMap = employees.parallelStream().collect(Collectors.toMap((employee -> employee.id), (employee -> employee)));
        Employee employee = employeeMap.get(id);

        fetch(employee, employeeMap);
        return sum;
    }


    public void fetch(Employee employee, Map<Integer, Employee> employeeMap){
        sum += employee.importance;
        if (employee.subordinates == null || employee.subordinates.isEmpty()){
            return;
        }

        for (int i = 0; i < employee.subordinates.size(); i++) {
            Integer id = employee.subordinates.get(i);
            Employee next = employeeMap.get(id);
            fetch(next, employeeMap);
        }
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Employee employee = new Employee();
        employee.id = 1;
        employee.importance = 5;
        ArrayList<Integer> subordinates = new ArrayList<>();
        subordinates.add(2);
        subordinates.add(3);
        employee.subordinates = subordinates;



        Employee employee1 = new Employee();
        employee1.id = 2;
        employee1.importance = 3;
        employee1.subordinates = new ArrayList<>();

        Employee employee2 = new Employee();
        employee2.id = 3;
        employee2.importance = 3;
        employee2.subordinates = new ArrayList<>();

        employees.add(employee2);
        employees.add(employee1);
        employees.add(employee);


        System.out.println(new Solution().getImportance(employees, 1));
    }
}