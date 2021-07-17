/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oddEven;

import oddEven.checkOddEven;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;

 
public class Server extends UnicastRemoteObject implements checkOddEven{
public Server() throws RemoteException{
super(); /* we throws RemoteException created by UnicastRemoteObject and to handle that exception we call the constructor of 
UnicastRemoteObject. Now when we create object of Server it will call constructor and indirectly it is calling super 
constructor of UnicastRemoteObject which is handling the Exception created by it.*/
}
   @Override
    public Boolean isEven(int num) throws RemoteException {
        if(num%2==0)
            return true;
        else 
            return false;
    }
    
    public static void main(String a[]){
    try{
        Server obj=new Server();
            // we have to create service in registry so we write as Registry reg=LocateRegistry.createRegistry(9999);
    Registry reg=LocateRegistry.createRegistry(9999);// here we create registry at port 9999
//Then we rebind the service it means we have to add Service in registry so we write
    reg.rebind("hi server", obj);// to rebind we need unique name
    System.out.println("server is ready");
    
    
    } catch (RemoteException ex) {
        System.out.println(ex);
    }
    }

    

}
