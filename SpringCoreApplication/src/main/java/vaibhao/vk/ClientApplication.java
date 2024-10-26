package vaibhao.vk;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ClientApplication {

	public static void main(String[] args) {
	Resource  resource=new ClassPathResource("emoloyee.xml");
	BeanFactory bFactory=new XmlBeanFactory(resource);
	
	Object object=bFactory.getBean("e");
	Employee employee=(Employee)object;
	employee.Show();
	}

}
