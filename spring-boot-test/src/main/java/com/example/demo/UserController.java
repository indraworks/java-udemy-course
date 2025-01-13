package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//tulis restController karena kita mau ada crud di class ini 
//dan buat method utk CRUD yg layani utk endpoint http kita  
@RestController
public class UserController {
    //disni kita buat getMapping anotation dimana ini adalah shortcut dari 
	//@RequestMapping(method=RequestMethod.Get
	//jadi kita ganti ckup @GetMapping("/users") ini = endpoiny
	//utk layanan agar method kita dibawah ini kluar jika ada yg req di http://localhost:8080/users
	//utk ganti alamat port pada tomcat server dng menuju application Properties ketik server.port
	//alamat default adalah 8080 bisa kita isi mis 9090
	@GetMapping(value="/users")
	public String sayHello() {
		return "Hello this is responds!";
	}
}
