package com.jxd.test;

import com.jxd.emp.EmpApplication;
import com.jxd.emp.mapper.IDeptMapper;
import com.jxd.emp.mapper.IEmpMapper;
import com.jxd.emp.model.Class;
import com.jxd.emp.model.Emp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.List;

/**
 * @ClassName TestDao
 * @Description TODO
 * @Author wang kunpeng
 * @Date 2020/10/23
 * @Version 1.0
 */

@RunWith(SpringRunner.class)    //用谁作为启动器，去加载所有的底层配置
@SpringBootTest(classes = EmpApplication.class)   //启动主程序
public class TestDao {

    @Autowired
    private IEmpMapper empMapper;

    @Autowired
    private IDeptMapper deptMapper;




    @Test
    public void test(){
        List<Emp> list = empMapper.getAll();
        System.out.println("数据条数是：" + list.size());
    }

    @Test
    public void testBoot(){
        List<Class> list = deptMapper.selectList(null);
        System.out.println(list.size());
    }
}
