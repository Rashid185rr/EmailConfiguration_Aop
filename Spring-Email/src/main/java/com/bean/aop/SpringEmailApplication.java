package com.bean.aop;

import java.io.File;
import java.util.Properties;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.configuration.reloading.FileChangedReloadingStrategy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Primary;



@SpringBootApplication
@EnableAspectJAutoProxy
public class SpringEmailApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEmailApplication.class, args);
	}

	 

}
