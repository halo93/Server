/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import Guide.ServerInterface;
import java.io.IOException;
import java.net.ServerSocket;
import java.rmi.Naming;
import java.rmi.RemoteException;

import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class ServerTurn extends UnicastRemoteObject implements ServerInterface {

    public ServerTurn() throws RemoteException {
    }

    @Override
    public String Turning(String s) throws RemoteException {
        return "rmi://localhost:1202/atm";
    }
}
