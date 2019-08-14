package design_pattern.proxy_pattern.remote_proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 1. 制作远程接口：接口文件
 * 
 * @author moushuai
 *
 */
public interface MyRemote extends Remote {
	public String sayHello()throws RemoteException;
}
