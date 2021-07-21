package DemoSpringMVC.UserController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
	

@Controller
public class HomeController extends BaseController{

	@RequestMapping(value= {"/","/trang-chu"}, method =RequestMethod.GET)
	public ModelAndView Index() {
		_mvShare.setViewName("user/index");
		_mvShare.addObject("slides",_homeServiceImpl.GetDataSlides());
		_mvShare.addObject("categorys",_homeServiceImpl.GetDataCategorys());
		_mvShare.addObject("newproduct",_homeServiceImpl.GetDataNewProduct());
		_mvShare.addObject("highlight",_homeServiceImpl.GetDataHighlightProduct());
		return _mvShare;
	}
}
