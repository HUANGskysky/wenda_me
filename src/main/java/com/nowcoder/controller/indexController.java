package com.nowcoder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Huangsky on 2018/8/4.
 */
/*@Controller*/
public class indexController {


    @RequestMapping(path = {"/index"},method = {RequestMethod.GET})
    public String index(){
        return "home";
    }

}
