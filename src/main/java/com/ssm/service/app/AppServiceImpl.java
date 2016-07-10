package com.ssm.service.app;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ssm.dao.AppDao;
import com.ssm.domain.App;

@Service
public class AppServiceImpl implements AppService{

	@Autowired
	private AppDao appDao;
	
	@Override
	public void saveApp(App app) {
		appDao.insert(app);
	}

	@Override
	public List<App> listApp() {
		return appDao.list();
	}

	@Override
	public void updateApp(App app) {
		appDao.update(app);
	}

	@Override
	public void deleteApp(int id) {
		appDao.delete(id);
	}

	@Override
	public App select(Map<String, Object> map) {
		return appDao.getByMap(map);
	}
}
