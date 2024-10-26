package vaibhao.vk.service;

import vaibhao.vk.model.Student;

public class StudentServiceImpl implements StudentService {

	StudentServiceImpl studRepo=new StudentServiceImpl();
	@Override
	public boolean isAddNewStudent(Student student) {
		return false;
	}

}
