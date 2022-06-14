package com.examproject.ordermanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class OrderManagerApplication implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	public static void main(String[] args) {
		SpringApplication.run(OrderManagerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String sql = "INSERT INTO agents VALUES ('Prova', 'AAAAA', 'AAAA', '402', '000-432432', '')";

		int rows = jdbcTemplate.update(sql);
		if (rows > 0) {
			System.out.println("A new row has been inserted.");
		}
	}

}
