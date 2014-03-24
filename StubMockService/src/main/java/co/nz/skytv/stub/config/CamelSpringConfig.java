package co.nz.skytv.stub.config;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.apache.camel.CamelContext;
import org.apache.camel.component.cxf.CxfEndpoint;
import org.apache.camel.impl.SimpleRegistry;
import org.apache.camel.spring.CamelBeanPostProcessor;
import org.apache.camel.spring.SpringCamelContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CamelSpringConfig {

	@Resource
	private CxfEndpoint transformEndpoint;

	@Inject
	private ApplicationContext context;

	@Bean
	public CamelBeanPostProcessor camelBeanPostProcessor() {
		CamelBeanPostProcessor camelBeanPostProcessor = new CamelBeanPostProcessor();
		camelBeanPostProcessor.setApplicationContext(context);
		return camelBeanPostProcessor;
	}

	@Bean
	public CamelContext camelContext() throws Exception {
		SpringCamelContext camelContext = new SpringCamelContext(context);
		SimpleRegistry registry = new SimpleRegistry();
		registry.put("transformEndpoint", transformEndpoint);
		camelContext.setRegistry(registry);
		return camelContext;
	}

}
