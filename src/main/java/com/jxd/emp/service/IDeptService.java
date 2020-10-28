package com.jxd.emp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jxd.emp.model.Class;

import java.util.List;

public interface IDeptService extends IService<Class> {
    List<Class> selectDeptWithPublic();
}
