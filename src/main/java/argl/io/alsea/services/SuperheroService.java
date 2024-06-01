package argl.io.alsea.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import argl.io.alsea.data.Superhero;

@Service
public class SuperheroService implements BaseSuperheroService{

	@Override
	public List<Superhero> getHero() throws Exception {
		// TODO Auto-generated method stub
		
		
		Superhero hero = new Superhero();
		
		List<Superhero> list = new ArrayList<>();
		
		
		
		hero.setId(1);
		hero.setName("Spiderman");
		hero.setFirstname("Peter");
		hero.setLastname("Parker");
		hero.setPlace("New York  City");
		list.add(hero);
		return list;
	}

}
