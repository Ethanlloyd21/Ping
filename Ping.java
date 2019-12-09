/**
 * Ping class receives an output String and outputs it as a String of the IP address.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ping {
	
	private String Ip;
  
	public Ping(String address) {
		
		Ip = address;
	}

	
	public String getIPAddress() {
		return Ip;
	}
	
	public String getPingCommand() {
		String command = "ping " + getIPAddress();
		return command;
	}


	public String setIPAddress(String ip) {
		return Ip;
	}
}
