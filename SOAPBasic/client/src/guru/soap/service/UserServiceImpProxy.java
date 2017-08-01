package guru.soap.service;

public class UserServiceImpProxy implements guru.soap.service.UserServiceImp {
  private String _endpoint = null;
  private guru.soap.service.UserServiceImp userServiceImp = null;
  
  public UserServiceImpProxy() {
    _initUserServiceImpProxy();
  }
  
  public UserServiceImpProxy(String endpoint) {
    _endpoint = endpoint;
    _initUserServiceImpProxy();
  }
  
  private void _initUserServiceImpProxy() {
    try {
      userServiceImp = (new guru.soap.service.UserServiceImpServiceLocator()).getUserServiceImp();
      if (userServiceImp != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)userServiceImp)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)userServiceImp)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (userServiceImp != null)
      ((javax.xml.rpc.Stub)userServiceImp)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public guru.soap.service.UserServiceImp getUserServiceImp() {
    if (userServiceImp == null)
      _initUserServiceImpProxy();
    return userServiceImp;
  }
  
  public guru.soap.model.User getUser(int id) throws java.rmi.RemoteException{
    if (userServiceImp == null)
      _initUserServiceImpProxy();
    return userServiceImp.getUser(id);
  }
  
  public boolean deleteUser(int id) throws java.rmi.RemoteException{
    if (userServiceImp == null)
      _initUserServiceImpProxy();
    return userServiceImp.deleteUser(id);
  }
  
  public boolean addUser(guru.soap.model.User user) throws java.rmi.RemoteException{
    if (userServiceImp == null)
      _initUserServiceImpProxy();
    return userServiceImp.addUser(user);
  }
  
  public guru.soap.model.User[] getAllPersons() throws java.rmi.RemoteException{
    if (userServiceImp == null)
      _initUserServiceImpProxy();
    return userServiceImp.getAllPersons();
  }
  
  
}