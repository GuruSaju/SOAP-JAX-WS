/**
 * UserServiceImpServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package guru.soap.service;

public class UserServiceImpServiceLocator extends org.apache.axis.client.Service implements guru.soap.service.UserServiceImpService {

    public UserServiceImpServiceLocator() {
    }


    public UserServiceImpServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public UserServiceImpServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for UserServiceImp
    private java.lang.String UserServiceImp_address = "http://localhost:8080/SOAPprovider/services/UserServiceImp";

    public java.lang.String getUserServiceImpAddress() {
        return UserServiceImp_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String UserServiceImpWSDDServiceName = "UserServiceImp";

    public java.lang.String getUserServiceImpWSDDServiceName() {
        return UserServiceImpWSDDServiceName;
    }

    public void setUserServiceImpWSDDServiceName(java.lang.String name) {
        UserServiceImpWSDDServiceName = name;
    }

    public guru.soap.service.UserServiceImp getUserServiceImp() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(UserServiceImp_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getUserServiceImp(endpoint);
    }

    public guru.soap.service.UserServiceImp getUserServiceImp(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            guru.soap.service.UserServiceImpSoapBindingStub _stub = new guru.soap.service.UserServiceImpSoapBindingStub(portAddress, this);
            _stub.setPortName(getUserServiceImpWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setUserServiceImpEndpointAddress(java.lang.String address) {
        UserServiceImp_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (guru.soap.service.UserServiceImp.class.isAssignableFrom(serviceEndpointInterface)) {
                guru.soap.service.UserServiceImpSoapBindingStub _stub = new guru.soap.service.UserServiceImpSoapBindingStub(new java.net.URL(UserServiceImp_address), this);
                _stub.setPortName(getUserServiceImpWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("UserServiceImp".equals(inputPortName)) {
            return getUserServiceImp();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.soap.guru", "UserServiceImpService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.soap.guru", "UserServiceImp"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("UserServiceImp".equals(portName)) {
            setUserServiceImpEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
