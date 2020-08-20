package org.ecuadorjug.customers.traditional.data.model;

import lombok.*;

import javax.persistence.*;

@Entity(name = "customer")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;
    @Column
    private Integer score;
}