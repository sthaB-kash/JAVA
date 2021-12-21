/*
 Write a TCP Socket Programming to perform chat and chat end when any
one of client or server says “Bye”
 */
package lab10;

import java.io.*;
import java.net.Socket;
public class Q7Client {
    public static void main(String argv[]) throws Exception
        {
        String sentence;
        String msgFromServer;

        Socket clientSocket;
        clientSocket = new Socket("localhost", 1229);
        System.out.println("Connected to Server. Enter any message:");
        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));//taking input fromsystem or console
        
        DataOutputStream outToServer =new DataOutputStream(clientSocket.getOutputStream());//to send datastream to connected server through socket
        BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));//to read response coming from server and flow to client
        
        while(true){
            sentence = inFromUser.readLine();// reading input from user
            outToServer.writeBytes(sentence + '\n');// writing the to server

            msgFromServer = inFromServer.readLine();//reading the data
            if(msgFromServer=="bye")
                break;
            System.out.println("SERVER: " +msgFromServer);//displaying the response or modified data from the server to the clinet console
        }
    
//        String s;
//        while((s = inFromServer.readLine()) != null)
//        {
//            System.out.println("\rserver: " + s);
//            System.out.print("> ");
//        }
        clientSocket.close();
        }
}