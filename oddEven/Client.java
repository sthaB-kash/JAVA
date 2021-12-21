/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oddEven;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
 
public class Client {
    public static void main(String a[])throws RemoteException{
    Client c=new Client();
    c.connectRemote();
    }
    public void connectRemote(){
    try{
    
    Scanner sc=new Scanner(System.in);
    //in order to communicate to server or machine since server is in local host machine so localhost is given else machine IP address and port number where you created the server
   Registry reg=LocateRegistry.getRegistry("localhost", 9999);
   //here client lookup the service by its name and then fetch and we have to take it to ad i.e in remote method.
   checkOddEven ad= (checkOddEven)reg.lookup("hi server");
//  Server s=new Server();
//  s.add(a,b);
   System.out.println("enter a number");
   int a=sc.nextInt();
     
   if(ad.isEven(a))
    System.out.println("even");
   else 
       System.out.println("odd");
   }
    catch(RemoteException e){
            System.out.println(e);
            }
  catch(NotBoundException e){
            System.out.println(e);
            }
    
    
    
    }
    
    }