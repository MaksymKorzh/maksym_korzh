package com.tagsoft.korzh.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "users", schema = "public")
@NoArgsConstructor
@Data
public class UserEntity implements Serializable {

    public UserEntity(String username, String password, String mail, RoleEntity role, String country, String state) {
        this.username = username;
        this.password = password;
        this.mail = mail;
        this.role_id = role;
        this.country = country;
        this.state = state;
    }

    @Id
    @SequenceGenerator(name = "users_id_seq", sequenceName = "users_id_seq", schema = "public", initialValue = 5)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_id_seq")
    @Column(name = "id")
    private Integer id;

    @Column(name = "username", length = 15)
    private String username;

    @Column(name = "password", length = 40)
    private String password;

    @Column(name = "mail", unique = true, length = 40)
    private String mail;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "role_id")
    private RoleEntity role_id;

    @Column(name = "country")
    private String country;

    @Column(name = "state")
    private String state;
}
