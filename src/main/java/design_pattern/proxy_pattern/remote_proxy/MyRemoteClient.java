package design_pattern.proxy_pattern.remote_proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/*
 * 4. RMI代理端通过RMI查询到服务端，建立联系，通过接口调用远程方法。
 */
public class MyRemoteClient {
	public String getInformationFromRemoteServer() {
		String info = null;
		try {
			MyRemote service = (MyRemote) Naming.lookup("rmi://localhost:9999/HelloRemote");
		    info = service.sayHello();
		} catch (MalformedURLException | RemoteException |NotBoundException e) {
			e.printStackTrace();
		} 
		return info;
	}
	
	public static void main(String[] args) {
		String info = new MyRemoteClient().getInformationFromRemoteServer();
		System.out.println(info);
	}

}
