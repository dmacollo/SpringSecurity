package ae.ih;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import ae.ih.config.SystemConfig;
import ae.ih.domain.DataSource;
import ae.ih.domain.JmsBroker;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=SystemConfig.class)
@ActiveProfiles({"qa"})
public class SpringSecurityApplicationTests {
	
	@Autowired
	JmsBroker jmsBroker;
	@Autowired
	DataSource dataSource;
	
	@Test
	public void testJmsConnection() throws Exception{
		assertEquals("localhost", jmsBroker.getJmsServer());
	}	
	
	@Test
	public void testDataSource(){
		System.out.println(dataSource.getURL());
	}
}
