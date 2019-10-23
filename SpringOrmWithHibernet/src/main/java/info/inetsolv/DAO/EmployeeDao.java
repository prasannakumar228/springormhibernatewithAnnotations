package info.inetsolv.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import info.inetsolv.entity.Employee;

@Configuration
public class EmployeeDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public void save(Employee employee) {
		 hibernateTemplate.persist(employee);	
	}
	
	@Transactional
	public void delete(Employee employee) {
		hibernateTemplate.delete(employee);
	}
	
	@Transactional
	public void update(Employee employee) {
		hibernateTemplate.update(employee);
	}
	
	public Employee retriveOnerecord(int i) {
		return hibernateTemplate.get(Employee.class, i);
	}


	public List<Employee> retriveMuiltiplrrecords() {
		return hibernateTemplate.loadAll(Employee.class);
		
	}
	
}
