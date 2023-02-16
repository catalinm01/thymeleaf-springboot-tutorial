package net.javaguides.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmployeeController {

    @GetMapping("/iteration")
    public String iteration(Model model){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", "Sparrow", "john@gmail.com"));
        employees.add(new Employee("Jack", "Dawson", "jack1@gmail.com"));
        employees.add(new Employee("Paul", "Newman", "pauln@gmail.com"));
        model.addAttribute("employees", employees);
        return "iteration";
    }
}
