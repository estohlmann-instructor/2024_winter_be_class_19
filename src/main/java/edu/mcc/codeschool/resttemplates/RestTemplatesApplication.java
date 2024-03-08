package edu.mcc.codeschool.resttemplates;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestTemplatesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestTemplatesApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder){
		return new RestTemplateBuilder().interceptors(
				(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) -> {
					request.getHeaders().set("X-RapidAPI-Key", "test");
					request.getHeaders().set("X-RapidAPI-Host", "test");
					return execution.execute(request, body);
				}
		).build();
	}

}
