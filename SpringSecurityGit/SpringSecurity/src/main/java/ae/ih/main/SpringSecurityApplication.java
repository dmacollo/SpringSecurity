package ae.ih.main;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ActiveProfiles;

@SpringBootApplication
@ComponentScan({"ae.ih"})
public class SpringSecurityApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringSecurityApplication.class, args);
		String[] beanNames=context.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for (String bean:beanNames){
			System.out.println(bean);
		}
	}
}
