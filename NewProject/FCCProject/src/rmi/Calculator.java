package rmi;

import java.rmi.Remote;

public interface Calculator extends Remote{
    int add(int a, int b) throws RemoteException;
}
