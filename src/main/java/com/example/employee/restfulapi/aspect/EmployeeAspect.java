package com.example.employee.restfulapi.aspect;

import com.example.employee.restfulapi.service.EmployeeService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeAspect extends BaseAspect{

    public static final String EXECUTION_COM_EXAMPLE_EMPLOYEE_RESTFULAPI_CONTROLLER_EMPLOYEE_CONTROLLER
            = "execution(* com.example.employee.restfulapi.controller.EmployeeController.*(..))";
    @Autowired
    EmployeeService employeeService;

    @Pointcut(EXECUTION_COM_EXAMPLE_EMPLOYEE_RESTFULAPI_CONTROLLER_EMPLOYEE_CONTROLLER)
    public void controllerServiceAspect() {
    }

    @Around(CONTROLLER_SERVICE_ASPECT_REQUEST_MAPPING_ASPECT)
    public Object serviceCoverController(ProceedingJoinPoint joinPoint) throws Throwable {
        return serviceCoverController(employeeService,joinPoint);
    }
}
