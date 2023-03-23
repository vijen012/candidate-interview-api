package com.talent_aquisition;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class, XADataSourceAutoConfiguration.class})
@ComponentScan("com.talent_aquisition.controller"+"com.talent_aquisition.dao"+"com.talent_aquisition.entities"+"com.talent_aquisition.services")
public class TalentAquisitionProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(TalentAquisitionProjectApplication.class, args);
	}

}
