package test;

import org.junit.Assert;
import org.junit.Test;
import student.Student;

public class StudentObjectServiceTest {
	
	@Test
	public void shouldCreateStudentAndReturnName() {
		//Given
		String name = "Antony";
		
		//When
		Student stud = new Student(name);
		
		//Then
		Assert.assertTrue(stud.getName().equals(name));
	} 
}
