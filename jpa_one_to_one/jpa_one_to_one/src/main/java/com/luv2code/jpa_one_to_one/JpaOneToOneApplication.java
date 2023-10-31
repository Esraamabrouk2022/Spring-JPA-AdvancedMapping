package com.luv2code.jpa_one_to_one;

import com.luv2code.jpa_one_to_one.dao.AppDao;
import com.luv2code.jpa_one_to_one.entity.Instructor;
import com.luv2code.jpa_one_to_one.entity.InstructorDetail;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaOneToOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaOneToOneApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(AppDao appDao) {
        return runner -> {
            deleteInstructorById(appDao);
            //findInInstractur(appDao);
            //createinstructor(appDao);
        };
    }

    public void createinstructor(AppDao appDao) {
        Instructor instructor = new Instructor("Esraa", "Mabrouk", "esraa@gmail.com");
        InstructorDetail instructorDetail = new InstructorDetail("youtupe", "art");
        instructor.setInstructorDetail(instructorDetail);
        appDao.save(instructor);

    }

    public void findInInstractur(AppDao appDao) {
        int id = 1;
        System.out.println("Finding Instracutor id " + id);
        Instructor tempInstracutor = appDao.findInstracturById(id);
        System.out.println("tempinstractur is " + tempInstracutor);
        System.out.println("InstructorDetails : " + tempInstracutor.getInstructorDetail());
    }

    public void deleteInstructorById(AppDao appDao) {
        int id = 1;
        System.out.println("Deleting Instructor with id " + id);
        appDao.deleteInstracturByid(id);
        System.out.println("Done");
    }

}
