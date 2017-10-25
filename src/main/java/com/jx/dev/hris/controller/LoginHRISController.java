package com.jx.dev.hris.controller;

import com.jx.dev.hris.services.EmployeeService;
import java.util.HashMap;
import java.util.Map;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginHRISController {

   
    private EmployeeService employeeService;
 
    @Autowired
    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
   
    @RequestMapping(path="/login-hris", method=RequestMethod.GET)
    public String goEmployee() {
        return "employee";
    }
}
