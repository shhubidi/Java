package rmi;

import java.rmi.server.UnicastRemoteObject;

public class CalculatorImpl extends UnicastRemoteObject implements Calculator{
    public CalculatorImpl() throws RemoteException{
        super();
    }

    public int add(int a, int b){
        return a+b;
    }
}
