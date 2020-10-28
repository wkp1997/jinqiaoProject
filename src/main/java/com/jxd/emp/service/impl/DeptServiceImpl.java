package com.jxd.emp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jxd.emp.mapper.IDeptMapper;
import com.jxd.emp.model.Class;
import com.jxd.emp.service.IDeptService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName DeptServiceImpl
 * @Description TODO
 * @Author wang kunpeng
 * @Date 2020/10/23
 * @Version 1.0
 */

@Service
public class DeptServiceImpl extends ServiceImpl<IDeptMapper, Class> implements IDeptService  {
    public List<Class> selectDeptWithPublic(){
        List<Class> list = null;
        return list;
    }
}
