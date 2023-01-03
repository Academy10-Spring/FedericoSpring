package it.sabafed.miosito.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import it.sabafed.miosito.form.FormUser;
import it.sabafed.miosito.model.User;
import it.sabafed.miosito.repository.UserRepository;

public class WebController {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/")
	public String getHome(Model model) {
		
		List<User> userList = (List<User>) userRepository.findAll();
		model.addAttribute("users", userList);
		return "home";
	}
	
	@GetMapping("/user")
	public String getFormUser(FormUser userForm, Model model) {
		model.addAttribute("userForm", userForm);
		return "user/form";
	}
	
	@PostMapping("/addUser")
	public String addUser(@Valid @ModelAttribute("userForm") FormUser userForm,
							BindingResult bindingResult,
							Model model) {
		
		if (bindingResult.hasErrors()) {
			return "author/form";
		}
		
		userRepository.save(userForm.getUser());
		return "redirect:/";
	}
}
