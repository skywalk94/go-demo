package org.example.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.mapper.StudentMapper;
import org.example.pojo.Student;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {

    @Test
    public void testSelectAll() throws IOException {
//        获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

//        获取sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

//        获取Mapper接口的代理对象
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

//        执行方法
        List<Student> students = studentMapper.selectAll();
        System.out.println(students);

//        释放资源
        sqlSession.close();
    }

    @Test
    public void testSelectById() throws IOException {
        int id = 1;
//        获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

//        获取sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

//        获取Mapper接口的代理对象
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

//        执行方法
        Student student = studentMapper.selectById(id);
        System.out.println(student);

//        释放资源
        sqlSession.close();
    }


    @Test
    public void testSelectByCondition() throws IOException {
        String name = "杰";
        String sex = "";

        name = "%" + name + "%";

//        获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

//        获取sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

//        获取Mapper接口的代理对象
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

//        执行方法
        List<Student> student = studentMapper.selectByCondition(name, sex);
        System.out.println(student);

//        释放资源
        sqlSession.close();
    }

    @Test
    public void testSelectByConditionSingle() throws IOException {
        String name = "杰";
        String sex = "男";

        name = "%" + name + "%";

        Student student = new Student();
        student.setName(name);
        student.setSex(sex);

//        获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

//        获取sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

//        获取Mapper接口的代理对象
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

//        执行方法
        List<Student> students = studentMapper.selectByConditionSingle(student);
        System.out.println(students);

//        释放资源
        sqlSession.close();
    }


    @Test
    public void testAdd() throws IOException {
        String name = "杰杰哥1";
        String sex = "男";
        int age = 18;

        Student student = new Student();
        student.setName(name);
        student.setSex(sex);
        student.setAge(age);

//        获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

//        获取sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

//        获取Mapper接口的代理对象
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

//        执行方法
        studentMapper.add(student);
        System.out.println(student.getId());
//        手动提交事务
//        sqlSession.commit();

//        释放资源
        sqlSession.close();
    }

    @Test
    public void testUpdate() throws IOException {
        int id = 105;
        String name = "杰杰哥2";
        String sex = "女";
        int age = 108;

        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setSex(sex);
        student.setAge(age);

//        获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

//        获取sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

//        获取Mapper接口的代理对象
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

//        执行方法
        int count = studentMapper.update(student);
        System.out.println(count);

//        释放资源
        sqlSession.close();
    }

    @Test
    public void testDelete() throws IOException {
        int id = 105;

//        获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

//        获取sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

//        获取Mapper接口的代理对象
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

//        执行方法
        studentMapper.deleteById(id);

//        释放资源
        sqlSession.close();
    }

    @Test
    public void testDeleteIds() throws IOException {
        int[] ids = {103, 104};

//        获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

//        获取sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

//        获取Mapper接口的代理对象
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

//        执行方法
        studentMapper.deleteByIds(ids);

//        释放资源
        sqlSession.close();
    }
}
