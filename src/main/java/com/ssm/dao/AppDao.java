package com.ssm.dao;
import java.util.List;
import java.util.Map;
import com.ssm.domain.App;

public interface AppDao {
	
	public void insert(App app);
	
	public List<App> list();
	
	public void update(App app);
	
	public void delete(int id);
	
	public App getByMap(Map<String,Object> map);
}
