package sk.umb.example.library.aunt.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuntController{
    @RequestMapping("/api/addresses")
    public String redirect() {
        return "redirect:/api/addresses";
    }
}
