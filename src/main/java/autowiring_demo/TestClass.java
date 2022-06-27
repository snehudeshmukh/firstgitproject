package autowiring_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
public static void main(String[] args) {
	ApplicationContext con=new ClassPathXmlApplicationContext("applicationcontext.xml");
	Library lib=con.getBean(Library.class);
	System.out.println(lib);
}
}
