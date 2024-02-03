package com.example.demo.entity;

import jakarta.validation.constraints.NotEmpty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="user")
public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int id;
	@Column(nullable = false)
	@NotEmpty
	private String name;
	@Column(nullable = false)
	@NotEmpty
	private String address;
	@Column(nullable = false)
	@NotEmpty
	private String tel;
}
