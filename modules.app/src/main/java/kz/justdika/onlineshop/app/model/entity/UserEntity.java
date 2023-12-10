package kz.justdika.onlineshop.app.model.entity;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table
@NoArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    @Column(name = "user_name")
    public String name;

    @Column(name = "phone_number")
    public String phoneNumber;

}
