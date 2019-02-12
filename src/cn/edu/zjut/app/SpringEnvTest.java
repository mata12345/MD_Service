package cn.edu.zjut.app; 
import org.springframework.context.ApplicationContext; 
import org.springframework.context.support.ClassPathXmlApplicationContext; 
import cn.edu.zjut.dao.ICustomerDAO;
public class SpringEnvTest { 
	public static void main(String[] args) { 
		//创建Spring容器 
		ApplicationContext ctx = new ClassPathXmlApplicationContext( "applicationContext.xml"); 
		//获取CustomerDAO实例 
		ICustomerDAO userDao = (ICustomerDAO) ctx.getBean("userDAO"); 
		userDao.save(); 
		} 
}