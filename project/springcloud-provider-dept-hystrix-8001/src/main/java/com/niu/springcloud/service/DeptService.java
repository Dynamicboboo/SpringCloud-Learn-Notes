package com.niu.springcloud.service;

import com.niu.springcloud.pojo.Dept;

import java.util.List;

/**
 * @Description ：
 * @Author tj
 * @Date 2020/8/21
 */
public interface DeptService {
    boolean addDept(Dept dept);

    Dept queryById(Long id);

    List<Dept> queryAll();
}
