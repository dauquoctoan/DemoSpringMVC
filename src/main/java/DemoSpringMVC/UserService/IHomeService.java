package DemoSpringMVC.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DemoSpringMVC.Dto.ProductsDto;
import DemoSpringMVC.Entity.Categorys;
import DemoSpringMVC.Entity.Menus;
import DemoSpringMVC.Entity.Slides;

@Service
public interface IHomeService {
	@Autowired
	public List<Slides> GetDataSlides();
	@Autowired
	public List<Categorys> GetDataCategorys();
	@Autowired
	public List<Menus> GetDataMenus();
	@Autowired
	public List<ProductsDto> GetDataNewProduct();
	@Autowired
	public List<ProductsDto> GetDataHighlightProduct();
}
