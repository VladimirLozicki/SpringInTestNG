package hibernate.model;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Planet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    public Planet() {
        /*
         * must be for hibernate
         * */
    }


    public int getUserId() {
        return id;
    }

    public void setUserId(int userId) {
        this.id = userId;
    }
}
