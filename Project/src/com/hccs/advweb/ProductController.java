package com.hccs.advweb;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class ProductController {

	@Autowired
	private ProductService proService;
	
	public ProductController() {
		// TODO Auto-generated constructor stub
	}
	@RequestMapping(value="/index", method= RequestMethod.GET)
	public ModelAndView getProductList(ModelAndView model) {
		ArrayList<Product> proList = proService.getProductList();
		model.addObject("index",proList);
		model.setViewName("index");
		return model;
	}
	@RequestMapping(value="/contact-us", method= RequestMethod.GET)
	public String getContactUs() {
		return "contact-us";
	}
	@RequestMapping(value="/about", method= RequestMethod.GET)
	public String getAboutUs() {
		return "about";
	}
	@RequestMapping(value="/cart", method= RequestMethod.GET)
	public String getCart() {
		return "cart";
	}
	@RequestMapping(value="/checkout", method= RequestMethod.GET)
	public String getCheckOut() {
		return "checkout";
	}
	@RequestMapping(value="/gallery", method= RequestMethod.GET)
	public String getGallery() {
		return "gallery";
	}
	@RequestMapping(value="/my-account", method= RequestMethod.GET)
	public String getMyAccount() {
		return "my-account";
	}
	@RequestMapping(value="/shop", method= RequestMethod.GET)
	public String getShop() {
		return "shop";
	}
	@RequestMapping(value="/shop-detail", method= RequestMethod.GET)
	public String getShopDetail() {
		return "shop-detail";
	}	
	@RequestMapping(value="/wishlist", method= RequestMethod.GET)
	public String getWishlist() {
		return "wishlist";
	}	
}
