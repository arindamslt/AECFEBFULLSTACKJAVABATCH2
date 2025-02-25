package com.arindam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class BootJdbcApplication implements CommandLineRunner {
	@Autowired
private JdbcTemplate template;
	public static void main(String[] args) {
		SpringApplication.run(BootJdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		String insertsql="insert into account values('101','KAUSHIK',20000.00)";
		String selectsql="select * from account";
		int n=template.update(insertsql);
		System.out.println("NO ROWS EFFECTED:"+n);
		List aclist=template.queryForList(selectsql);
		aclist.stream().forEach(System.out::println);
	}

}
