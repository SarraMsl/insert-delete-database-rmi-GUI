/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bdrmi;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Sara Mousselmal
 */
public class Client {
        public static void  main(String[] args)throws RemoteException {
Scanner s=new Scanner(System.in);
int choice;
System.out.println("**************************************************");
System.out.println("Enter your choice");
System.out.println("insert");
System.out.println("delete");
choice=s.nextInt();
switch(choice){
    case 1:
        try{
            int id;
            String name;
            interface_rmi jdbci=(interface_rmi)Naming.lookup("rmi://localhost:350/db");
              System.out.println("Enter your id:");
              id=s.nextInt();
              System.out.println("Enter your name:");
              name=s.next();
              String result =jdbci.Insert(id,name);
              System.out.println(result);
        }
        
    catch(Exception e){
         
        e.printStackTrace();
    

    
    }
    break;
           case 2:
        try{
            int id;
            interface_rmi jdbci=(interface_rmi)Naming.lookup("rmi://localhost:350/db");
               System.out.println("Enter  id of person:");
              id=s.nextInt();
             
              String result =jdbci.Delete(id);
              System.out.println(result);}
        
    catch(Exception e){
         
        e.printStackTrace();
    }
        break;
        
}          
}}
        
        
