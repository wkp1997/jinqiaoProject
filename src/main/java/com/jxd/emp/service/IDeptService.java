package com.jxd.emp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jxd.emp.model.Dept;

import java.util.List;

public interface IDeptService extends IService<Dept> {
    List<Dept> selectDeptWithPublic();
}
