package springsc.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@GetMapping("/")
	public String home() {
		return "Hello world";
	}
	@GetMapping("/user")
	public String user() {
		return "User account Data";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "admin account Data";
	}
	
//	@Autowired
//	private UserRepository userRepository; 
//	
//	@GetMapping("/")
//	public User home() {
//		return userRepository.findByUserName("admin");
//	}
//	
}
