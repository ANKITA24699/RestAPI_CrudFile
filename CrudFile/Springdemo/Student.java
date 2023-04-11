package com.example.bootdemo.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Student {
	 @Id
     int id;
     String name;
     String dob;
     double marks;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getDob() {
			return dob;
		}
		public void setDob(String dob) {
			this.dob = dob;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public double getMarks() {
			return marks;
		}
		public void setMarks(double marks) {
			this.marks = marks;
		}
	
     
}
