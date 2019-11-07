package com.lti.hibernate_ex.student_ex;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
        Configuration conf = new Configuration().configure();
        StandardServiceRegistryBuilder build= new StandardServiceRegistryBuilder().applySettings(conf.getProperties());
        SessionFactory fact = conf.buildSessionFactory(build.build());
        Session session=fact.openSession();
        Student stu=new Student();
        //stu.setRoll_num(1);
        stu.setName("anu");
        stu.setDept("cs");
        session.beginTransaction();
        session.save(stu);
        session.getTransaction().commit();
    }
}
