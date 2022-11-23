package com.axis.service
import com.axis.model.Employee
import com.axis.utility.EmployeeUtil

//in service class we write the business logic
class EmployeeService {
    var employeeUtil=EmployeeUtil()

    fun viewAllEmployees(){
        var employees=employeeUtil.data()
        for(employee in employees)
            println("${employee.id} | ${employee.name}| ${employee.salary} | ${employee.dept}")
    }

    fun addNewEmployee(employee:Employee):String{
        employeeUtil.data().add(employee)
        return "Successfully Added!"
    }

}