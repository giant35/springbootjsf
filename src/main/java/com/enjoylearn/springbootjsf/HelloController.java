/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enjoylearn.springbootjsf;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 *
 * @author sihai
 */
@Component("hh")
public class HelloController {
    public String getMsg(){
        return "你好啊啊";
    }
}
