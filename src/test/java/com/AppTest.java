package com;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ssm.domain.App;
import com.ssm.service.app.AppService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value={"classpath:applicationContext.xml"})
public class AppTest {
	
	@Autowired
	private AppService appService;
	
	@Test
	//@Ignore
	public void testInsert(){
		App app = new App();
		app.setName("胡雅婷");
		appService.saveApp(app);
	}
	
	@Test
	@Ignore
	public void testlist(){
		List<App> apps = appService.listApp();
		for(App app : apps){
			System.err.println(app.getName());
		}
	}
}
