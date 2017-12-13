package omare.com.mx.showcase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class BootstrapShowcaseApplication extends SpringBootServletInitializer {
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
		return application.sources(BootstrapShowcaseApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(BootstrapShowcaseApplication.class, args);
	}
}
