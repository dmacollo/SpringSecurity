package ae.ih.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import ae.ih.domain.DataSource;
import ae.ih.domain.JmsBroker;

@Configuration
@PropertySource("classpath:systemconfig.properties")
public class SystemConfig {
	@Value("${jms.server}")
	String jmsServer;
	@Value("${jms.port}")
	String jmsPort;
	@Value("${jms.username}")
	String jmsUsername;
	@Value("${jms.password}")
	String jmsPassword;
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer properties(){
		PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer=
				new PropertySourcesPlaceholderConfigurer();
		return propertySourcesPlaceholderConfigurer;
	}
	
	@Bean
	public JmsBroker jmsBroker(){
		JmsBroker jmsBroker=new JmsBroker(jmsServer,jmsPort,jmsUsername,jmsPassword);		
		return jmsBroker;
	}
	
	@Bean("dataSource")
	@Profile("production")
	public DataSource getDataSourceProduction(){
		return new DataSource("This is Production DataSource");
	}
	@Bean("dataSource")
	@Profile("qa")
	public DataSource getDataSourceQA(){
		return new DataSource("This is Quality Assurance DataSource");
	}
	@Bean("dataSource")
	@Profile("default")
	public DataSource getDataSourceDefault(){
		return new DataSource("This is Default DataSource");
	}
}
