package com.axis.utility

import com.axis.model.Employee

class EmployeeUtil{
    var employees= mutableListOf<Employee>()
    init{
        employees.add(Employee(1,"Supriya",1200,"HR"))
        employees.add(Employee(2,"Sruti", 15000, "CS"))
        employees.add(Employee(3,"Deepti",12000,"IT"))
        employees.add(Employee(4,"Chetana",20000,"CS"))
        employees.add(Employee(5,"Aditi",40000,"HR"))
    }
    fun data():MutableList<Employee>{

        return employees
    }
}