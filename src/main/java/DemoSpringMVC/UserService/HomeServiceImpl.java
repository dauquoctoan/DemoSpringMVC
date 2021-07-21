package DemoSpringMVC.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DemoSpringMVC.Dao.CategorysDao;
import DemoSpringMVC.Dao.MenusDao;
import DemoSpringMVC.Dao.ProductsDao;
import DemoSpringMVC.Dao.SlidesDao;
import DemoSpringMVC.Dto.ProductsDto;
import DemoSpringMVC.Entity.Categorys;
import DemoSpringMVC.Entity.Menus;
import DemoSpringMVC.Entity.Slides;

@Service
public class HomeServiceImpl implements IHomeService{	
	@Autowired
	private SlidesDao slidesDao;
	@Autowired
	private CategorysDao categorysDao;
	@Autowired
	private MenusDao menusDao;
	@Autowired
	private ProductsDao productsDao;
	
	public List<Slides> GetDataSlides() {
		return slidesDao.GetDataSlides();
	}
	
	public List<Categorys> GetDataCategorys() {	
		return categorysDao.GetDataCategorys();
	}

	public List<Menus> GetDataMenus() {
		return menusDao.GetDataMenus();
	}

	public List<ProductsDto> GetDataNewProduct() {
		return productsDao.getDataNewProducts();
	}

	public List<ProductsDto> GetDataHighlightProduct() {
		return productsDao.getDataHighlightProducts();
	}	
}
