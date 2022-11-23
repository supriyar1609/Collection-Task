package com.axis.app
import com.axis.model.Employee
import com.axis.service.EmployeeService
import com.axis.utility.EmployeeUtil

fun main(args: Array<String>) {

    var employeeService=EmployeeService()

    //Adding Employee
    var employee=Employee(6,"Pratyusha",30000,"TR")
    employeeService.addNewEmployee(employee)

    employeeService.viewAllEmployees()
}
