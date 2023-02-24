package com.poleszak.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import static jakarta.persistence.GenerationType.IDENTITY;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = IDENTITY, generator = "customer_id_sequence")
    @SequenceGenerator(name = "customer_id_sequence", sequenceName = "customer_id_sequence")
    private Integer id;
    private String firstname;
    private String lastname;
    private String email;
}
