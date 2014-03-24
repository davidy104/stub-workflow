package co.nz.skytv.stub.config;

import org.apache.camel.component.cxf.CxfEndpoint;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import co.nz.skytv.stub.PubOrchestrationTransformService;

@Configuration
@ImportResource({ "classpath:META-INF/cxf/cxf.xml",
		"classpath:META-INF/cxf/cxf-extension-soap.xml",
		"classpath:META-INF/cxf/cxf-servlet.xml" })
public class CamelCxfConfig {

	// http://localhost:8800/stub/ws/transform?wsdl
	
	@Bean
	public CxfEndpoint transformEndpoint() {
		CxfEndpoint cxfEndpoint = new CxfEndpoint();
		cxfEndpoint.setAddress("/transform");
		cxfEndpoint.setServiceClass(PubOrchestrationTransformService.class);
		LoggingOutInterceptor loggingOutInterceptor = new LoggingOutInterceptor();
		loggingOutInterceptor.setPrettyLogging(true);
		cxfEndpoint.getOutInterceptors().add(loggingOutInterceptor);
		return cxfEndpoint;
	}

	// @Bean
	// public LoggingOutInterceptor loggingOutInterceptor() {
	// return new LoggingOutInterceptor("target/write");
	// }

}
