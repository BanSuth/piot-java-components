package programmingtheiot.gda.connection;

public class runner {
	
	public static void main(String[] args)
	{
		CoapServerGateway csg = new CoapServerGateway(); 
		csg.startServer();
	}

}
