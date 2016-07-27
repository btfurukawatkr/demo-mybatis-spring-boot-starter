package com.example;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.repository.Sample;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	Logger LOGGER = Logger.getLogger(this.getClass().getName());

	@Autowired
	Sample sample;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		LOGGER.info("ACCOUNT TBL COUNT:" + sample.countAll());
		LOGGER.info("getInfo1");
		LOGGER.info("ACCOUNT TBL INFO1:" + sample.getInfo1().getOne());
		LOGGER.info("ACCOUNT TBL INFO2:" + sample.getInfo1().getTwo());
		LOGGER.info("ACCOUNT TBL INFO3:" + sample.getInfo1().getThree());

		LOGGER.info("getInfo2");
		LOGGER.info("ACCOUNT TBL INFO1:" + sample.getInfo2().getOne());
		LOGGER.info("ACCOUNT TBL INFO2:" + sample.getInfo2().getTwo());
		LOGGER.info("ACCOUNT TBL INFO3:" + sample.getInfo2().getThree());
	}
}
