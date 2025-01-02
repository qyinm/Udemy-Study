package com.hippoo.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    // Model
    @RequestMapping("/login")
//    public String gotoLoginPage(@RequestParam String name, Model model) {
    public String gotoLoginPage(@RequestParam String name, ModelMap model) {
//            model.addAttribute("name",name);
        model.put("name", name);
        return "login";
    }
}
