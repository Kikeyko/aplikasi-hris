package com.jx.dev.hris.services.impls;

import com.jx.dev.hris.entities.EmployeeMaster;
//import com.jx.dev.hris.repositories.EmployeeMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jx.dev.hris.services.EmployeeService;

/**
 *
 * @author jx
 */
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
 
    @Override
    public Iterable <EmployeeMaster> getAllEmployees() {
        return null;
    }
 
    @Override
    public EmployeeMaster getEmployeeById(Integer id) {
        return null;
    }
    
}
