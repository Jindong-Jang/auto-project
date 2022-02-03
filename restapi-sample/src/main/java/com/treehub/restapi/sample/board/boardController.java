package com.treehub.restapi.sample.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class boardController {

    @RequestMapping(value="/")
    public String index() {
        
        return "index";
}
}