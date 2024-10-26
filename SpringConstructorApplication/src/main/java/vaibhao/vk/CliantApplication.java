package vaibhao.vk;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class CliantApplication {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("test.xml");
		BeanFactory bFactory = new XmlBeanFactory(resource);
		Test t1 = (Test) bFactory.getBean("t");

	}

}
