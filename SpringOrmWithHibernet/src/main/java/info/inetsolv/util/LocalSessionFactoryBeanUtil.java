package info.inetsolv.util;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import info.inetsolv.entity.Employee;

@Configuration
public class LocalSessionFactoryBeanUtil {

	
	@Autowired
	private DataSource dataSource;
	
	@Bean
	public LocalSessionFactoryBean localSessionFactoryBean() {
		LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
		sessionFactoryBean.setDataSource(dataSource);
		sessionFactoryBean.setAnnotatedClasses(Employee.class);
		return sessionFactoryBean;
		
	}
	
	
}