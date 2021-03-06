package cn.edu.scau.cmi.zhangjiayi.client;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.edu.scau.cmi.zhangjiayi.hibernate.HibernateSessionFactory;
import cn.edu.scau.cmi.zhangjiayi.hibernate.domain.Course;
import cn.edu.scau.cmi.zhangjiayi.hibernate.domain.Student;

public class HibrenateClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session=HibernateSessionFactory.getSession();
		//Transaction transaction = session.beginTransaction();
		Student std = session.get(Student.class, "201527010523");
		System.out.println("姓名："+std.getName());
		System.out.println("班级："+std.getSchoolclass().getName());
		Set<Course> courseSet = std.getCourses();
		for(Course course : courseSet)
			System.out.println(course.getName());
		session.close();
	}

}
