package com.soapui.SoapPublisher;


import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface LabInterface {
    @WebMethod
    String sayHello(@WebParam(name = "name") String name);
}
