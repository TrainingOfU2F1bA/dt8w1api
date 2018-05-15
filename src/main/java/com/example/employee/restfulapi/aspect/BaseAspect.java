package com.example.employee.restfulapi.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

import java.util.Arrays;

public class BaseAspect {
    public static final String EXECUTION_ORG_SPRINGFRAMEWORK_WEB_BIND_ANNOTATION_REQUEST_MAPPING
            = "execution(@(@ org.springframework.web.bind.annotation.RequestMapping *) * *.*(..))";

    public static final String CONTROLLER_SERVICE_ASPECT_REQUEST_MAPPING_ASPECT =
            "controllerServiceAspect()&&requestMappingAspect()";

    @Pointcut(EXECUTION_ORG_SPRINGFRAMEWORK_WEB_BIND_ANNOTATION_REQUEST_MAPPING)
    public void requestMappingAspect() {
    }

    public Object serviceCoverController(Object o, ProceedingJoinPoint joinPoint) throws Throwable {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        return o.getClass().getDeclaredMethod(
                signature.getName(),
                Arrays.stream(signature.getParameterTypes()
                ).toArray(Class<?>[]::new)
        ).invoke(
                o, Arrays.stream(joinPoint.getArgs()).toArray()
        );
    }
}
