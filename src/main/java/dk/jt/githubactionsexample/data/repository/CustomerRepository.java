package dk.jt.githubactionsexample.data.repository;

import dk.jt.githubactionsexample.domain.model.Userz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Userz, Integer> {}
