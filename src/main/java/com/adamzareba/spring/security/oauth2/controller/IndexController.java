package com.adamzareba.spring.security.oauth2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Anil
 * Created by AH00554631 on 8/31/2018.
 */
@Controller
public class IndexController {
//    @RequestMapping("/")
//    public String index() {
//        return "index";
//    }

    @RequestMapping("/")
    public ModelAndView indext() {
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("public/index.html");
        return modelAndView;
    }
}
