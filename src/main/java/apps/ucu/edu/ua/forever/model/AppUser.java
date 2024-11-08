package apps.ucu.edu.ua.forever.model;

import java.time.LocalDate;
import java.time.Period;

import lombok.Data;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Transient;

@Data
@Table
@Entity(name = "app_user")
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(unique = true)
    private String email;

    private LocalDate dob;
    @Transient 
    private Integer age;

    public int getAge() {
        return Period.between(dob, LocalDate.now()).getYears();
    }

}
