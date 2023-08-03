package com.example.humanitics.Entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int employee_id;
	private String employee_code;
	private String name;
	private Date date_of_birth;
	private String gender;
	private boolean is_active;
	private Date created_at;
	private Date updated_at;
	private int department_id;

}
