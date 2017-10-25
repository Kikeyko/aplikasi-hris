package com.jx.dev.hris.services;

import com.jx.dev.hris.entities.EmployeeMaster;

/**
 *
 * @author jx
 */
public interface EmployeeService {
    Iterable<EmployeeMaster> getAllEmployees();
    public EmployeeMaster getEmployeeById(Integer id);
}
