package com.example.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfigurations {
	
	
	@Bean
	public RouteLocator gatewayRouter(RouteLocatorBuilder builder) {
		return builder.routes()
			.route(p->p.path("/Post/**").uri("lb://POST-SERVICE/Post"))
			.route(p->p.path("/Comments/**").uri("lb://COMMENT-SERVICE/Comments"))
			.build();
		
	}

}