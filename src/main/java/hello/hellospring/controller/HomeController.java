package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    //만약 home.html이 없다면 static에 있는 index.html이 열림
    @GetMapping("/")
    public String home(){
        return "home";
    }
}
