package assingment_october.springboot;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Akshay Hiremath", 45000));
        list.add(new Employee(2, "Rajesh Patil", 50000));
        list.add(new Employee(3, "Sneha Reddy", 48000));

        return list; // Returns JSON automatically
    }
}
