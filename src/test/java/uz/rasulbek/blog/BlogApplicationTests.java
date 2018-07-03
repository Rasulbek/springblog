package uz.rasulbek.blog;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

public class BlogApplicationTests {

	@Test
	public void testConfig(){
		String pass = "admin";
		System.out.println(new BCryptPasswordEncoder().encode(pass));
	}

}
