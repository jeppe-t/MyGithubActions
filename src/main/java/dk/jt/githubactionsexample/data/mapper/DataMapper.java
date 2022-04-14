package dk.jt.githubactionsexample.data.mapper;

import dk.jt.githubactionsexample.data.repository.CustomerRepository;
import dk.jt.githubactionsexample.domain.model.Userz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataMapper implements CommandLineRunner {

    @Autowired CustomerRepository customerRepository;

    @Override
    public void run(String... args) throws Exception {

        //Autowire some code here

        Userz userz = new Userz();
        userz.setName("Testuser");
        customerRepository.save(userz);


    }
}
