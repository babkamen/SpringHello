package org.geymer.user.controller;

import java.util.Locale;

import org.geymer.user.entity.Note;
import org.geymer.user.entity.User;
import org.geymer.user.service.NoteManager;
import org.geymer.user.service.UserManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
public class UserController {

	@Autowired
	UserManager userManager;
	private static final Logger logger = LoggerFactory
			.getLogger(UserController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		model.addAttribute("user", new User());
		model.addAttribute("userList", userManager.getUsers());
		return "users";
	}



	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public String change(@PathVariable("id") Integer id, Model model) {
		User user = userManager.getUser(id);
		model.addAttribute("user", user);
		return "editUser";
	}

	@RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
	public String processChange(@PathVariable("id") Integer id,
			@ModelAttribute("user") User user) {
		user.setId(id);
		userManager.editUser(user);
		return "redirect:/";
	}

	@RequestMapping(value = "/add")
	public String add(@ModelAttribute("user") User user) {
		System.out.println(user);
		userManager.addUser(user);
		return "redirect:/";
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable("id") Integer id, Model model) {
		userManager.deleteUser(id);
		return "redirect:/";
	}

}
