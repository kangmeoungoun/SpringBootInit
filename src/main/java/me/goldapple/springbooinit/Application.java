package me.goldapple.springbooinit;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;


public class Application{
	public static void main(String[] args) throws LifecycleException, IOException{
		Tomcat tomcat = new Tomcat();
		tomcat.setPort(8080);
		String docBase = Files.createTempDirectory("tomcat-basedir").toString();
		Context context = tomcat.addContext("/", docBase);

		HttpServlet servlet = new HttpServlet(){
			@Override
			protected void doGet(HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException{
				PrintWriter writer = resp.getWriter();
				writer.println("<html><head><title>");
				writer.println("Hey Tomcat");
				writer.println("</title></head>");
				writer.println("<body><h1>Hello Tomcat</h1></body>");
				writer.println("</html>");
			}
		};
		String servletName = "helloServlet";
		tomcat.addServlet("/" , servletName , servlet);
		context.addServletMappingDecoded("/",servletName);
		tomcat.getConnector();
		tomcat.start();
		tomcat.getServer().await();
	}

}
