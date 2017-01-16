package ae.ih.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ae.ih.domain.DataSource;
import ae.ih.domain.JmsBroker;

@RestController
@RequestMapping(value="/system")
public class SystemConfigController {
	@Autowired
	private JmsBroker jmsBroker;
	
/*	@Autowired
	private DataSource dataSource;*/
	
	@Value("${msg}")
	private String propertyMessage;
	
	@RequestMapping(value="/config")
	@ResponseBody
	public String getSystemConfig(){
		return jmsBroker.toString();
	}
	
/*	@RequestMapping(value="/datasource")
	@ResponseBody
	public String getDataSource(){
		return dataSource.getURL();
	}*/
	
	@RequestMapping(value="/property")
	@ResponseBody
	public String getProperty(){
		return propertyMessage;
	}
}
