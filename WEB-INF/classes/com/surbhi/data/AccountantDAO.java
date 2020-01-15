package com.surbhi.data;
import java.util.List;
import com.surbhi.model.Student;
public interface AccountantDAO {
	public List<Student> getDetails() throws Exception;
	public Student viewDetail(int rollNo)throws Exception;
	public List<Student> searchDetail1(int rollNo) throws Exception;


}
