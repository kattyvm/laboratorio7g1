package clase10.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class main {

    @GetMapping("")
    public String ws4(){
        return "obtenerEmployee";
    }
}
