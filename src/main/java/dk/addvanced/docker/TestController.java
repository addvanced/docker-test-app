package dk.addvanced.docker;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public @ResponseBody String helloWorld() {
        return "Hello there, how are you?";
    }

    @GetMapping("/{name}")
    public @ResponseBody String hello(@PathVariable("name") String name) {
        return "Hello, "+name.trim();
    }
}
