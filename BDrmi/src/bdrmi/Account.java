/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bdrmi;

/**
 *
 * @author Sara Mousselmal
 */
public class Account {

   
    
    
    int Idclient;
    String name;
   
    
    

  public Account() {
    }

    public Account(int Idclient, String name) {
        this.Idclient = Idclient;
        this.name = name;
    }

 
    public int getIdclient() {
        return Idclient;
    }

    public String getName() {
        return name;
    }

  

    public void setIdclient(int Idclient) {
        this.Idclient = Idclient;
    }

    public void setName(String name) {
        this.name = name;
    }

 


}