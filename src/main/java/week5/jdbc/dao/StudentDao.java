package week5.jdbc.dao;


import week5.jdbc.vo.StudentVO;

import java.util.List;

public interface StudentDao {

    public void add(StudentVO studentVO);

    public void addX(StudentVO studentVO);

    public void modify(StudentVO studentVO);

    public void delete(int id);

    public StudentVO get(int id);

    public List<StudentVO> getList();

    public void batchAdd(List<StudentVO> list);

}
