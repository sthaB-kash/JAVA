/*
 Write a complete client-server program that represents the connection to
server and sends some text to server and also receives some message from
server.
 */
package lab10;

import java.net.*;
public class Q3Server {
public static void main(String a[]) throws Exception{
DatagramSocket ds=new DatagramSocket(9999);//It attempts to create a server socket bound to the specified port.
byte[] b1=new byte[1024]; // to store data
DatagramPacket dp=new DatagramPacket(b1,b1.length);
ds.receive(dp);
String str=new String(dp.getData(),0,dp.getLength());
System.out.println("Client says: " + str);
String msg="Hi client "; // store message
byte[] b2=msg.getBytes();
InetAddress ia=InetAddress.getLocalHost();
DatagramPacket dp1=new DatagramPacket(b2, b2.length,ia,dp.getPort());
ds.send(dp1);// to send to client response
}}