package apps.ucu.edu.ua.forever.model;

import java.time.LocalDate;
import java.time.Period;

import lombok.Data;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

import jakarta.persistence.Column;

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
