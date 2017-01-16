package ae.ih.domain;

public class JmsBroker {
	private String jmsServer;
	private String jmsPort;
	private String jmsUsername;
	private String jmsPassword;
	
	public JmsBroker(){
		
	};
	
	public JmsBroker(String jmsServer, String jmsPort, String jmsUsername, String jmsPassword) {
		super();
		this.jmsServer = jmsServer;
		this.jmsPort = jmsPort;
		this.jmsUsername = jmsUsername;
		this.jmsPassword = jmsPassword;
	}
	
	public String getJmsServer() {
		return jmsServer;
	}
	public void setJmsServer(String jmsServer) {
		this.jmsServer = jmsServer;
	}
	public String getJmsPort() {
		return jmsPort;
	}
	public void setJmsPort(String jmsPort) {
		this.jmsPort = jmsPort;
	}
	public String getJmsUsername() {
		return jmsUsername;
	}
	public void setJmsUsername(String jmsUsername) {
		this.jmsUsername = jmsUsername;
	}
	public String getJmsPassword() {
		return jmsPassword;
	}
	public void setJmsPassword(String jmsPassword) {
		this.jmsPassword = jmsPassword;
	}

	@Override
	public String toString() {
		return "JmsBroker [jmsServer=" + jmsServer + ", jmsPort=" + jmsPort + ", jmsUsername=" + jmsUsername
				+ ", jmsPassword=" + jmsPassword + "]";
	}
	
	
}
