/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bdrmi;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Sara Mousselmal
 */
public class implementRmi extends UnicastRemoteObject implements interface_rmi{
public implementRmi ()throws RemoteException{
super();
}

   
    @Override
    public String Delete(int id) throws RemoteException {
       try{
    
    Class.forName("com.mysql.jdbc.Driver");
        Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/users","root","");
        Statement st=(Statement) con.createStatement();
        String sql= "DELETE FROM person WHERE id ='"+id+"'";    
         st.executeUpdate(sql);
                return "Deleted";
        }
     catch(ClassNotFoundException | SQLException e)
    {
   return (e.toString());
    }
    }


    @Override
    public String Insert(int id, String name) throws RemoteException {
   try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/users","root","");
        Statement st=(Statement) con.createStatement();
        String sql= "INSERT INTO person VALUES('"+id+"','"+name+"')";
                st.executeUpdate(sql);
                return "inserted";
    }
    catch(ClassNotFoundException | SQLException e)
    {
   return (e.toString());
    }    }
}
