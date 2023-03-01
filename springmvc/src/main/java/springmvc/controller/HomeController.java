package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping(path = "/home")
	public String home(Model model)
	{
		model.addAttribute("name", "Ravi");
		model.addAttribute("id",1234);
		
		List<String> friends = new ArrayList<String>();
		friends.add("abc");
		friends.add("def");
		friends.add("xyz");
		System.out.println("This is home controller");
		model.addAttribute("f", friends);
		return "index";
	}
	
	@RequestMapping("/about")
	public String about()
	{
		System.out.println("This is about controller");
		return "about";
	}
	@RequestMapping("/help")
	public ModelAndView help()
	{
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", "Ravi");
		modelAndView.addObject("rollnumber", 456);
		
		modelAndView.setViewName("help");
		
		return modelAndView;
	}
	
	
}
