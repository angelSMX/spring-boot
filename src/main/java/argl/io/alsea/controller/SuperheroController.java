package argl.io.alsea.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import argl.io.alsea.services.SuperheroService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class SuperheroController {
	
	
	   @Autowired
	   SuperheroService superheroService;
	
	
	 @GetMapping("/hero")
     public ResponseEntity<?> getHero(){
         try {
             return ResponseEntity.status(HttpStatus.OK).body(superheroService.getHero());
         } catch (Exception e) {
             return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. intente mas tarde.\"}");
         }
     }

}
