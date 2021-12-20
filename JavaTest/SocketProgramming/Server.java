package SocketProgramming;  


import java.net.*;  
import java.io.*;  

class Server{  
public static void main(String args[])throws Exception{  
        ServerSocket serverSocket =new ServerSocket(3333);
        System.out.println("ServerSocket awaiting connections...");
        while(true){
            Socket s=serverSocket.accept(); 
            System.out.println("Connection from " + s);
            
            DataInputStream din=new DataInputStream(s.getInputStream());  
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  

            String str="",str2="";  
            while(!str.equals("stop")){  
                str=din.readUTF();  
                System.out.println("client says: "+str);  
                str2=br.readLine();  
                dout.writeUTF(str2);  
                dout.flush();  
            }  
            
            System.out.println("\rserver: Client has disconnected");
            din.close();  
            s.close();  
            serverSocket.close(); 
        } 
    }
}  