package br.com.soulwebdesign.spring.jetty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by felipeweb on 11/04/15.
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public ModelAndView index() {
        return new ModelAndView("home", "oi", "Funciona!!!!");
    }
}
