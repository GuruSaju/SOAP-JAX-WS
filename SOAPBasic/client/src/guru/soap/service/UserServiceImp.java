/**
 * UserServiceImp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package guru.soap.service;

public interface UserServiceImp extends java.rmi.Remote {
    public guru.soap.model.User getUser(int id) throws java.rmi.RemoteException;
    public boolean deleteUser(int id) throws java.rmi.RemoteException;
    public boolean addUser(guru.soap.model.User user) throws java.rmi.RemoteException;
    public guru.soap.model.User[] getAllPersons() throws java.rmi.RemoteException;
}
