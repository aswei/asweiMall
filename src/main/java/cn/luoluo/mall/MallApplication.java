package cn.luoluo.mall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MallApplication {

    @RequestMapping("/hello")
    public String greeting() {
        return "Hello World!";
    }

	public static void main(String[] args) {
		SpringApplication.run(MallApplication.class, args);
	}
}
