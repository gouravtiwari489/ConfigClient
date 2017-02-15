package com.configclient;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}
}

@RefreshScope
@RestController
class MessageRestController {

//    @Value("${bye}")
//    private String message;
    
//	 @Value("${doge}")
//	 private Dog dog;
	 
    @Value("${doge.wow}")
    private String wo;
    
    @Value("${doge.such}")
    private String such;
    
    @Value("${doge.very}")
    private String very;

    @RequestMapping("/messages")
    String getMessage() {
        return this.wo + this.such+this.very;
    }
}
