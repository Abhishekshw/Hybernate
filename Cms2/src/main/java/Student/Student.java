package Student;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "clgStudent")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // allows auto generation for field value
	@Column(name = "Student_id")
	private int id;
	@Column(name = "Stu_firstName", length = 20, nullable = false)
	private String firstName;
	@Column(name = "Stu_lastName", length = 20, nullable = false)
	private String lastName;
	@Column(name = "Stu_fee")
	private double fee;
	@Column(name = "phone", length = 11, unique = true)
	private long phone;
}
