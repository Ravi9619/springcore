package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonDataForModel(Model m)
	{
		m.addAttribute("Header", "Learn with Ravi");
		m.addAttribute("Desc", "Channel for Challanger");
		System.out.println("Adding command data to model");
	}
	
	@RequestMapping("/contact")
	public String showForm(Model m)
	{
		System.out.println("creating form");
		return "contact";
	}
	
	@RequestMapping(path = "/processform",method = RequestMethod.POST)
	public String handleForm(
				@ModelAttribute User user,
				Model model)
	{
		System.out.println(user); 
		
		if(user.getUserName().isBlank()) {
			return "redirect:/contact";
		}
		
		int createdUser = this.userService.createUser(user);
		model.addAttribute("msg", "User created with id "+createdUser);
		return "success";
	}
	
		
//	@RequestMapping(path = "/processform",method = RequestMethod.POST)
//	public String handleForm(
//				@RequestParam(name ="userEmail", required = false) String userEmail,
//				@RequestParam("userName") String userName,
//				@RequestParam("userPassword") String userPassword,
//				Model model)
//	{
////		String email = request.getParameter("userEmail");
////		System.out.println("user email is "+ email);
//		
//		User user = new User();
//		user.setUserEmail(userEmail);
//		user.setUserName(userName);
//		user.setUserPassword(userPassword);
//		
//		System.out.println("user email: "+userEmail);
//		System.out.println("user name: "+userName);
//		System.out.println("user password: "+userPassword);
//		
////		model.addAttribute("name",userName);
////		model.addAttribute("email", userEmail);
////		model.addAttribute("password", userPassword);
//		
//		model.addAttribute("user",user);
//		return "success";
//	}
}
