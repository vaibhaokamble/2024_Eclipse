package vaibhao.vk.repository;

import java.util.List;

import vaibhao.vk.modul.Student;

public interface StudentRepository {
	public boolean  isAddNewStudent(Student student);
	public List<Student> getAllStudentRecords();
	public boolean isDeleteRecord(int id);
}
