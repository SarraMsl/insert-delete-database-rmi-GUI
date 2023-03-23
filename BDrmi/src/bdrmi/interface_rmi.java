/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bdrmi;
import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author Sara Mousselmal
 */
public interface interface_rmi  extends Remote{
   public String Insert (int id,String name)throws  RemoteException;
   public String Delete(int id)throws RemoteException;

}
