package com.example.employee.restfulapi.aspect;

import com.example.employee.restfulapi.service.CompanyService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;

//@Aspect
//@Component
public class CompanyAspect extends BaseAspect{
    public static final String EXECUTION_COM_EXAMPLE_EMPLOYEE_RESTFULAPI_CONTROLLER_COMPANY_CONTROLLER
            = "execution(* com.example.employee.restfulapi.controller.CompanyController.*(..))";
    @Autowired
    CompanyService companyService;

    @Pointcut(EXECUTION_COM_EXAMPLE_EMPLOYEE_RESTFULAPI_CONTROLLER_COMPANY_CONTROLLER)
    public void controllerServiceAspect() {
    }

    @Around(CONTROLLER_SERVICE_ASPECT_REQUEST_MAPPING_ASPECT)
    public Object serviceCoverController(ProceedingJoinPoint joinPoint) throws Throwable {
        return serviceCoverController(companyService,joinPoint);
    }
}
