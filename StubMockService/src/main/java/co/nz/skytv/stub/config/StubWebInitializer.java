package co.nz.skytv.stub.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class StubWebInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext)
			throws ServletException {
		// Loading application context
		AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();

		rootContext.register(ApplicationConfiguration.class);

		ServletRegistration.Dynamic cxfServletDispatcher = servletContext
				.addServlet("CXFServlet", CXFServlet.class);
		cxfServletDispatcher.addMapping("/ws/*");

		// Context loader listener
		servletContext.addListener(new ContextLoaderListener(rootContext));
	}

}
