package com.dongproject.common.interceptor;


import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


@Component
public class CommonInterCeptor implements HandlerInterceptor{
	
	private final Logger LOGGER = LoggerFactory.getLogger(CommonInterCeptor.class);
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		LOGGER.info("[prehanlder] request : {}", request);
		LOGGER.info("[prehanlder] request path info: {}", request.getPathInfo());
		LOGGER.info("[prehanlder] request head name: {}", request.getHeaderNames());
		LOGGER.info("[prehanlder] request method: {}", request.getMethod());
//		LOGGER.info("[prehanlder] request parameter map: {}", request.getParameterMap());
		 Map<String, String[]> map = request.getParameterMap();
	        Set<String> keySet=  map.keySet();
	        Iterator<String> itr = keySet.iterator();
	        while(itr.hasNext()) {
	            String key = itr.next();
	            String[] values = map.get(key);
	            
	            LOGGER.info(key + " : " + Arrays.toString(values)  );
	        }

		LOGGER.info("[prehanlder] request uri: {}", request.getRequestURI());
		LOGGER.info("[prehanlder] request url: {}", request.getRequestURL());
		LOGGER.info("[prehanlder] request session: {}", request.getSession().getAttribute("userInfo"));
		LOGGER.info("[prehanlder] request session id: {}", request.getRequestedSessionId());
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}
}
