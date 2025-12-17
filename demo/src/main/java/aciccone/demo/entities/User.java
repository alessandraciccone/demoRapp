package aciccone.demo.entities;


import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;
    @OneToMany(mappedBy = "user")
    private Set<RapportoIntervento> rapporti;


    public User() {
    }

    ;

    public User(Long id, String name, String email, String password, Role role,  Set<RapportoIntervento> rapporti) {

        this.name = name;
        this.email = email;
        this.password = password;
        this.role=role;
        this.rapporti = rapporti;
    }


    public Long getId() {
        return id;
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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
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
                "Id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                ", rapporti=" + rapporti +
                '}';
    }
}

