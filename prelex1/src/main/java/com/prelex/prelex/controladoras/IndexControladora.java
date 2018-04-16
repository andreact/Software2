package com.prelex.prelex.controladoras;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @author cvem8165
 *
 */
@Controller
public class IndexControladora {
	
	@RequestMapping("/")
    public String index(Model model)
    {
        model.addAttribute("mensaje", "Bienvenido al sistema de informacion de PRELEX");
        return "index";
    }

//    @Value("${welcome.message:test}")
//    private String message = "Hello World";
//
//    @RequestMapping("/")
//    public String welcome(Map<String, Object> model) {
//        model.put("message", this.message);
//        return "welcome";
//    }

}