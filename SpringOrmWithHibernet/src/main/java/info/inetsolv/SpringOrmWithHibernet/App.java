package info.inetsolv.SpringOrmWithHibernet;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import info.inetsolv.DAO.EmployeeDao;
import info.inetsolv.entity.Employee;
import info.inetsolv.util.MocUtil;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {
    	

    	AnnotationConfigApplicationContext continer = new AnnotationConfigApplicationContext(MocUtil.class);
    	EmployeeDao employeeDAO = continer.getBean(EmployeeDao.class);
    	Employee employee = new Employee();
    	
    	
    	//insert record
    	
		/*
		 * employee.setEno(50); employee.setEname("prasannakumar");
		 * employee.setSal(50000d);
		 * employeeDAO.save(employee);
		 */
    	
    	//delete record
    	
		/*
		 * employee.setEno(50); employeeDAO.delete(employee);
		 */
    	
    	
    	//update record
    	
		/*
		 * employee.setEno(2); employee.setSal(2000d); employee.setEname("vineetha");
		 * employeeDAO.update(employee);
		 */
    	
    	
    	
    	//retrive one record
    	
    	
		/*
		 * Employee emp = employeeDAO.retriveOnerecord(2);
		 * System.out.println(emp.getEno()+"-"+emp.getEname()+"-"+emp.getSal());
		 * 
		 */
    	
    	
    	
    	//Retrive multiple records
    	
    	List<Employee> list = employeeDAO.retriveMuiltiplrrecords();
    	for(Employee emp:list) {
    		System.out.println(emp.getEno()+"-"+emp.getEname()+"-"+emp.getSal());
    	}
    	
    	
    	continer.close();
    }
}
