package DemoSpringMVC.Dao;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Repository;

import DemoSpringMVC.Entity.MapperMenus;
import DemoSpringMVC.Entity.Menus;
@Repository
public class MenusDao extends BaseDao{
	
	public List<Menus> GetDataMenus(){
		List<Menus> list = new ArrayList<Menus>();
		list = _jdbcTemplate.query("SELECT * FROM menus", new MapperMenus());
		return list;
	}
}
