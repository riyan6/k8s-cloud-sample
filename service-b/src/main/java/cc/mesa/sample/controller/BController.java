package cc.mesa.sample.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/b")
@RequiredArgsConstructor
public class BController {

    private final RestTemplate restTemplate;

    @GetMapping("/info")
    public String getInfo() {
        return "info:b";
    }

    @GetMapping("/test")
    public String test() {
        String result = restTemplate.getForObject("http://service-c:28800/api/c/info", String.class);
        return "service-c get: " + result;
    }

}
