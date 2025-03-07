/* Copyright � 2015 Oracle and/or its affiliates. All rights reserved. */
package com.mahendra.employees;

import java.util.ArrayList;
import java.util.List;

// List of employees
public class EmployeeList {
    private static final List<Employee> employeeList = new ArrayList();
    
    private EmployeeList(){
    }
    
    static{
        employeeList.add(new Employee("Sivaa","Nethaji","12-12-1990","Lead","IT","sivaa.nethaji@abc.com"));
        employeeList.add(new Employee("Yaaro","Evaro","02-11-1979","Manager","IT","yaaro.evaro@etho.com"));
        employeeList.add(new Employee("Vetti","Officer","22-10-1966","VIP","VIP","vetti.officer@vip.com"));
        employeeList.add(new Employee("Joana","Sanders","11-11-1976","Manager","Marketing","joana.sanders@abc.com"));
        employeeList.add(new Employee("John","Drake","18-08-1988","Coordinator","Finance","john.drake@abc.com"));
        employeeList.add(new Employee("Samuel","Williams","22-03-1985","Coordinator","Finance","samuel.williams@abc.com"));
    }
    
    public static List <Employee> getInstance(){
        return employeeList;
    }
}
