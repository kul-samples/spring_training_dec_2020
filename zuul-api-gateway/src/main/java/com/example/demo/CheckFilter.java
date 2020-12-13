package com.example.demo;

import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class CheckFilter extends ZuulFilter {

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		
		
		 RequestContext ctx =RequestContext.getCurrentContext();
         
	          if(ctx.getRequest().getRequestURI().contains("lab")) {
	          ctx.setResponseStatusCode(400);
	          ctx.setResponseBody("Zuul is preventing");
	          ctx.setSendZuulResponse(false);
	          }
	   return null;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return FilterConstants.PRE_TYPE;
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

}
