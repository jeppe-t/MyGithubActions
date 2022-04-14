package dk.jt.githubactionsexample.domain.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Setter
@Getter
@Entity
public class Userz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userz_id", nullable = false)
    private int userId;
    private String name;
    private String password;

}
