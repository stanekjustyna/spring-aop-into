package pl.training.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PassengerManager {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");

        PassengerDao passengerDao = (PassengerDao) context.getBean("passengerDao");
        System.out.println(passengerDao.getPassenger(Long.valueOf(1)));
        context.close();
    }
}
