package rmi;

import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main(String[]args){
        try{
            Calculator obj = new CalculatorImpl();

            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("CalcService", obj);

            System.out.println("Server started....");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
