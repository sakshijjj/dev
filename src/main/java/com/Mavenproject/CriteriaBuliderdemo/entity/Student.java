package com.Mavenproject.CriteriaBuliderdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="studentdel")
@DynamicUpdate
public class Student {
 
            @Id
			private int id;
			@Column(name="name",length=100,nullable=false)
			private String name;
			@Column (name="age")
			private int age;

			public Student() {
				// TODO Auto-generated constructor stub
			}
			
			public Student(String name, int age) {
				super();
				this.name = name;
				this.age = age;
			}

			public Student(int id, String name, int age) {
				super();
				this.id = id;
				this.name = name;
				this.age = age;
			}

			public int getId() {
				return id;
			}

			public void setId(int id) {
				this.id = id;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public int getAge() {
				return age;
			}

			public void setAge(int age) {
				this.age = age;
			}
			@Override
			public String toString() {
				return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
			}
	
}
