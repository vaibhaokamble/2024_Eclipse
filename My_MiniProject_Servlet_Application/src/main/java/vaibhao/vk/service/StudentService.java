package vaibhao.vk.service;

import java.util.List;

import vaibhao.vk.modul.Student;

public interface StudentService {

	public boolean isAddNewStudent(Student  student);
	public List<Student> getAllStudentRecords();
	public boolean isDeleteRecord(int id);
}
