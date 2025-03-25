package no.hvl.dat109.lectureFeedback;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String visStartside() {
        return "start"; 
    }
}

