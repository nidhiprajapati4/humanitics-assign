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

	public Employee() {
	}

	public Employee(int employee_id, String employee_code, String name, Date date_of_birth, String gender,
			boolean is_active, Date created_at, Date updated_at, int department_id) {
		super();
		this.employee_id = employee_id;
		this.employee_code = employee_code;
		this.name = name;
		this.date_of_birth = date_of_birth;
		this.gender = gender;
		this.is_active = is_active;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.department_id = department_id;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getEmployee_code() {
		return employee_code;
	}

	public void setEmployee_code(String employee_code) {
		this.employee_code = employee_code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isIs_active() {
		return is_active;
	}

	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	public int getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}

	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", employee_code=" + employee_code + ", name=" + name
				+ ", date_of_birth=" + date_of_birth + ", gender=" + gender + ", is_active=" + is_active
				+ ", created_at=" + created_at + ", updated_at=" + updated_at + ", department_id=" + department_id
				+ "]";
	}

}