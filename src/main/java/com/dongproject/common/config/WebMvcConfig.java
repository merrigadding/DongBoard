package com.dongproject.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.dongproject.common.interceptor.CommonInterCeptor;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		registry.addInterceptor(new CommonInterCeptor())
				.addPathPatterns("/**");
//				.excludePathPatterns("/api/v1/board/selectBoard");
	}
}
