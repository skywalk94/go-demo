package org.example.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.example.pojo.Student;

import java.util.List;


public interface StudentMapper {

    //   查询所有
    @Select("select * from student")
    List<Student> selectAll();

    //    查看详情
    Student selectById(int id);

    //   多条件查询
    List<Student> selectByCondition(@Param("name") String name, @Param("sex") String sex);

    //    单条件查询
    List<Student> selectByConditionSingle(Student student);

    //   添加
    void add(Student student);

    //    修改
    int update(Student student);

    //    删除
    void deleteById(int id);

    //    批量删除
    void deleteByIds(@Param("ids") int[] ids);
}
