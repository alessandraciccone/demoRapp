package aciccone.demo.entities;


import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="users")
public class User{

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
private String name;
private String email;
private String password;
@OneToMany(mappedBy = "user")
    private Set<RapportoIntervento> rapporti;


public User(){};
    public User(Long id, String name, String email, String password, Set<RapportoIntervento> rapporti) {
        Id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.rapporti = rapporti;
    }



    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<RapportoIntervento> getRapporti() {
        return rapporti;
    }

    public void setRapporti(Set<RapportoIntervento> rapporti) {
        this.rapporti = rapporti;
    }

    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
