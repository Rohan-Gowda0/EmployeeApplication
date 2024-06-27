package EmployeeApplication.EmployeeApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmployeeController{

    @GetMapping("/employee")
    public String getEmployee() {
        // For demonstration purposes, returning a simple string.
        // In a real application, this would typically return an Employee object or a list of employees.
        return "Employee details";
    }
}
