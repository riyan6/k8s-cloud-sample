package cc.mesa.sample.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/c")
@RequiredArgsConstructor
public class CController {

    private final RestTemplate restTemplate;

    @GetMapping("/info")
    public String getInfo() {
        return "info:a";
    }

    @GetMapping("/test")
    public String test() {
        String result = restTemplate.getForObject("http://service-b:28810/api/b/info", String.class);
        return "service-b get: " + result;
    }

}
