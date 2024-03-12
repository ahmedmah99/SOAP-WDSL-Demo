package com.soapui.SoapClient;

import com.soapui.SoapPublisher.LabInterface;
import jakarta.xml.ws.Service;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;

public class SoapClient {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:8070/wsDoc/helloword?wsdl");
        QName qname = new QName("http://SoapPublisher.soapui.com/", "LabImplService");
        Service service = Service.create(url, qname);

        Iterator<?> portsIterator = service.getPorts();

        LabInterface port = service.getPort(LabInterface.class);
        System.out.println(port.sayHello("Soap Client "));
    }
}
