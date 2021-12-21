/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;
 
import java.net.*;
import java.util.Scanner;

public class Q3Client {
    public static void main(String a[]) throws Exception{
        DatagramSocket ds=new DatagramSocket();// to establish connection
        byte[] b="Hello server".getBytes();
        InetAddress ia=InetAddress.getLocalHost();
        DatagramPacket dp=new DatagramPacket(b,b.length,ia,9999);
        ds.send(dp); //send to server
        byte[] b1=new byte[1024];// to receive data from server again we define
        DatagramPacket dp1=new DatagramPacket(b1,b1.length);// to send data here no need to pass IP,port
      
        //while receiving
        ds.receive(dp1);
        String str=new String(dp1.getData(),0,dp1.getLength());
        System.out.println("Server says: "+str);
    }
}