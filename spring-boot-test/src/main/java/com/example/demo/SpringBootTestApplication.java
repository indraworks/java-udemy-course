package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootTestApplication {
    //ini adalah main start app kita yg uda wraping class kita  masuk disitu di paramyanya !
	public static void main(String[] args) {
		SpringApplication.run(SpringBootTestApplication.class, args);
	}

}

/*
@springBootApplication sudah emncakup semua yaitu autoconfigure bean danlain2 
tak ada lagi mmbutuhkan xml smua disni adalah dgn anotation !
kalau mau lihat ket didalam tinggal sorot aja atau lihat dibawah javadoc ada keterangannya 
sudah smua itu  ada @bean,ada auto-config dan scanning component

SpringApplication.run run adalah method statc ygada di SpringApplicaiton 


*/