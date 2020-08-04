package com.uverwolf.holahumano;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {
 @RequestMapping("/")
 public String saludo(@RequestParam(value="nombre" ,required = false) String Nombre, @RequestParam(value="apellido" ,required = false) String apellido) {
	  
	 if(Nombre!=null && apellido!=null) {
		 return "<h1>Hola "+Nombre+""+apellido+"</h1> <br> <h3>Bienvenido a SpringBoot </h3>";
	 }else if(Nombre!=null && apellido==null) {
		 return "<h1>Hola "+Nombre+"</h1> <br> <h3>Bienvenido a SpringBoot </h3>";
	 }
	 else {
		 return "<h1>Hola humano </h1> <br> <h3>Bienvenido a SpringBoot </h3>";
	 }
	 
	 
 }
 

}
