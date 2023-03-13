package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "Field cannot be blank.")
    @Size(min = 3, max = 100, message = "Location must be at least 3 characters.")
    private String location;

    @OneToMany
    @JoinColumn(name = "employer_id")
    private List<Job> jobs = new ArrayList<>();

    //Unsure whether this constructor is needed or is correct
    public Employer(String location){
        this.location = location;
    }

    public Employer() {};

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
