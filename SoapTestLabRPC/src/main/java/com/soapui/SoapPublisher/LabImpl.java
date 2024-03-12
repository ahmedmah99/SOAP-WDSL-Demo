package com.soapui.SoapPublisher;


import jakarta.jws.WebService;

@WebService(endpointInterface = "com.soapui.SoapPublisher.LabInterface")
public class LabImpl implements LabInterface{
    @Override
    public String sayHello(String name) {
        return "Hello " + name + " ! " + "\n Welcome to Soap Publisher !";
    }
}
