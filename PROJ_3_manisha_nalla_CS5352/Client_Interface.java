

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author manisha
 */
/* Remote interface for client */

public interface Client_Interface extends Remote{
    boolean obtain(String filename) throws RemoteException;
    void setDirectory(String sourceDirectory,String destinationDirectory) throws RemoteException;
}
