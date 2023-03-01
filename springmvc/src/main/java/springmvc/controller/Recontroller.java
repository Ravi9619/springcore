package springmvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class Recontroller {
	
	@RequestMapping("/one")
	public RedirectView one()
	{
		System.out.println("This is one handler");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("two");
		return redirectView;
//		return "redirect:/two";
	
	}
	
	@RequestMapping("/two")
	public String two()
	{
		System.out.println("This is second handler[two]");
		return "contact";
	}
}
