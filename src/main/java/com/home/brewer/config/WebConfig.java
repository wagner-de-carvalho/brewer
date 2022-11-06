package com.home.brewer.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.home.brewer.controller.CervejasController;

@Configuration
@ComponentScan(basePackageClasses = CervejasController.class)
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {

}
