package vaibhao.vk.service;

import java.util.List;

import vaibhao.vk.modul.Student;
import vaibhao.vk.repository.StudentRepositoryImpl;

public class StudentServiceImpl implements StudentService {
StudentRepositoryImpl studentRepo=new StudentRepositoryImpl();
	@Override
	public boolean isAddNewStudent(Student student) {
		
		return studentRepo.isAddNewStudent(student);
	}
	@Override
	public List<Student> getAllStudentRecords() {
		
		return studentRepo.getAllStudentRecords();
	}
	@Override
	public boolean isDeleteRecord(int id) {
		
		return studentRepo.isDeleteRecord(id);
	}

}
