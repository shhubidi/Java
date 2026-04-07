package rmi;

import java.rmi.registry.LocateRegistry;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
   public static void main(String[]args){
        try{
            

            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            Calculator stub = (Calculator) registry.lookup("CalcService");            

            int result = stub.add(5, 3);
            System.out.println("Result: " + result);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

