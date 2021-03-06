package pl.agawesolowska.students.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import pl.agawesolowska.students.dao.StudentDao;
import pl.agawesolowska.students.entity.Student;

/**
 * Service layer that simply delegates calls to the Student Data Access Object.
 * 
 * @author Aga
 *
 */
@Service
public class StudentService {

	private StudentDao studentDao;

	@Autowired
	public StudentService(@Qualifier("dataAccess") StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	@Transactional
	public int addStudent(Student student) {
		return studentDao.insertStudent(student);
	}

	@Transactional
	public List<Student> getAllStudents() {
		return studentDao.selectAllStudents();
	}

	@Transactional
	public Optional<Student> getStudentById(UUID id) {
		return studentDao.selectStudentById(id);
	}

	@Transactional
	public int correctStudentById(UUID id, Student updatedStudent) {
		return studentDao.updateStudentById(id, updatedStudent);
	}

	@Transactional
	public int removeStudentById(UUID id) {
		return studentDao.deleteStudentById(id);
	}

}
