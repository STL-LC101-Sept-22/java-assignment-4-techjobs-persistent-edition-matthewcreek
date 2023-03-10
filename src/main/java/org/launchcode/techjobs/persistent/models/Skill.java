package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

@Entity
public class Skill extends AbstractEntity {

    @NotBlank(message = "Field must not be blank.")
    private String description;

    public Skill(String description) {
        this.description = description;
    }

    public Skill() {}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}