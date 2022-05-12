package io.quarkus.cxf.reproducer.impl;

import io.quarkus.cxf.reproducer.api.ws.CalculatorWebService;
import javax.enterprise.context.RequestScoped;
import javax.jws.WebService;
import javax.xml.ws.BindingType;

@RequestScoped
@WebService(targetNamespace = "http://tempuri.org/", serviceName = "Calculator")
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public class CalculatorWebServiceImpl implements CalculatorWebService {
    @Override
    public int add(int intA, int intB) {
        return 0;
    }

    @Override
    public int subtract(int intA, int intB) {
        return 0;
    }

    @Override
    public int multiply(int intA, int intB) {
        return 0;
    }

    @Override
    public int divide(int intA, int intB) {
        return 0;
    }
}
