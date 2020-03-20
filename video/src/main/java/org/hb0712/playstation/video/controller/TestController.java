package org.hb0712.playstation.video.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("test")
    public Map test() {
    	return new HashMap<String, String>(){{
            put("name", "springboot");
         }};
    }
}
