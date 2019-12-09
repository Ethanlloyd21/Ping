import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.Scanner;

pulbic class PingCommand {

  public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
    
    Scanner input = new Scanner(System.in);
    String IpAddress = input.next();
    
    System.out.println(getPingIp(IpAddress));
    
    
    
  }
}

public void getPingIp(String s) {
		
		String ipadd = s;
		
		Ping winCom = new Ping(ipadd);
			
		winCom.setIPAddress(ipadd);
			
		try {
			
			Process sysProcess = Runtime.getRuntime().exec(winCom.getPingCommand());
			
			BufferedReader streamReader = new BufferedReader(new InputStreamReader(sysProcess.getInputStream()));
			
			//standard request is 4
			int pings = 0;
			int timeouts = 0;
			int other = 0;
			
			//read the input line by line.
			String line;
			
			txtPing.append("\n" + d + " " + thisDate + "\n");
			while ((line = streamReader.readLine()) != null) {
				
				txtPing.append(line + "\n");
				if (line.startsWith("Reply from") || line.startsWith("64 bytes from")) {
					pings++;
				} 
				else {
					if(line.startsWith("Request timed out")) {
						timeouts++;
					} 
					else {
						other++;
					}
				}
			}//while
			
			if(pings == 4) {
			
				txtPing.append("Ping Passed..." + "\n");
				//color = true;
			}
			else
				
				txtPing.append("One or more ping timeouts... (" + timeouts + " timeouts) PING FAILED" + "\n");
				
		} catch (IOException ex) {
			txtPing.append(ex.getMessage());
		}
		
	}
}
