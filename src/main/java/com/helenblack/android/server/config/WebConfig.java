package com.helenblack.android.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by lena on 21.02.2017.
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.helenblack.android.server.*")
public class WebConfig extends WebMvcConfigurerAdapter {


}
