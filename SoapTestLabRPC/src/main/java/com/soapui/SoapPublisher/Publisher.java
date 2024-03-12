package com.soapui.SoapPublisher;

import jakarta.xml.ws.Endpoint;

public class Publisher {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8070/wsDoc/helloword", new LabImpl());
        System.out.println("Publisher is ready");
    }
}
