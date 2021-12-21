/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

 
import java.io.*;
import java.net.*;
public class Q7Server {
    public static void main(String argv[]) throws Exception
    {
        String clientSentence;
        String msg;
        ServerSocket welcomeSocket = new ServerSocket(1229);//creating socket for connection
        System.out.println("ServerSocket awaiting connections...");
        while(true)
        {
            Socket connectionSocket = welcomeSocket.accept();//accepts the connection socket from client
            System.out.println("Connection from " + connectionSocket);
            BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));//to read data or request coming from client which is
            //coming as data stream through connection socket
            BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));//taking input fromsystem or console
            DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());//to write response on client through socket
            while(true){
                clientSentence = inFromClient.readLine();//reading request or data coming from client
                if(clientSentence == "bye")
                    break;
                System.out.println("\rClient: "+ clientSentence);
                msg = inFromUser.readLine();  
                outToClient.writeBytes(msg);// writing on client the modified data

            }
//            String s;
//            while((s = inFromClient.readLine()) != null)
//            {
//                System.out.println("\rclient: " + s);
//                System.out.print("> ");
//            }

            System.out.println("\rserver: Client has disconnected");
                     
            connectionSocket.close();
            welcomeSocket.close();
        }
        
}
}
//String s;
//        while((s = csock_br.readLine()) != null)
//        {
//            System.out.println("\rclient: " + s);
//            System.out.print("> ");
//        }
//
//        System.out.println("\rserver: Client has disconnected");