package com.surbhi.data;
import java.util.List;
import com.surbhi.model.Student;

public interface StudentDAO {
	public List<Student> getDetails() throws Exception;
	public void addDetail(Student detail) throws Exception;
	public void deleteDetail(int rollNo) throws Exception;
	public Student getDetail(int rollNo) throws Exception;
	public void updateDetail(Student detail) throws Exception;
	public List<Student> searchDetail(int rollNO) throws Exception;
}