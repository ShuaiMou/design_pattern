package design_pattern.proxy_pattern.remote_proxy;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

/**
 * 2.  远程接口的实现： service组件
 * 
 * @author moushuai
 *
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote{
	
	private static final long serialVersionUID = -2357502285202130271L;

	private MyRemoteImpl() throws RemoteException {
		super();
	}

	public String sayHello() throws RemoteException {
		return "Hello, I am Saul.";
	}
	
	/**
	 * 3. RMI服务端注册，开启服务
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MyRemote service = new MyRemoteImpl();
			LocateRegistry.createRegistry(9999);
			Naming.bind("rmi://localhost:9999/HelloRemote", service);
		} catch (RemoteException | MalformedURLException | AlreadyBoundException e) {
			e.printStackTrace();
		}
	}

}
