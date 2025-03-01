package in.vk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

    @RequestMapping("/aaa")
    public ModelAndView handleRequest() {
        return new ModelAndView("hello");
    }
}
