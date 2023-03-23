/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bdrmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Sara Mousselmal
 */
public class server {
    public server()throws RemoteException{
        super();
    }
    public static void main(String[] args)throws RemoteException {
    Registry reg=LocateRegistry.createRegistry(350);
    implementRmi ji=new implementRmi();
    reg.rebind("db",(Remote) ji);
    System.out.println("server is runing...");
    }
}
