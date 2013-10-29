package org.geymer.contactlist;

import java.util.Locale;

import org.geymer.contactlist.entity.User;
import org.geymer.contactlist.service.UserManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@Autowired
	UserManager userManager;
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		model.addAttribute("user",new User());
		model.addAttribute("userList", userManager.getUsers());
		return "home";
	}
	
	
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add(Model model) {
		
		return "redirect:/";
	}
	@RequestMapping(value = "/delete/{delete.id}", method = RequestMethod.GET)
	public String add(@PathVariable("delete.id") Integer id) {
		
		return "add";
	}
	
	
}
