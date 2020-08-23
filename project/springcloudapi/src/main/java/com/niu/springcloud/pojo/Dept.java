package com.niu.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Description ：
 * @Author tj
 * @Date 2020/8/20
 */
@Data
@NoArgsConstructor
@Accessors(chain = true) //链式写法
public class Dept implements Serializable {
    private Long deptno;//主键
    private String dname;
    //这个数据存在那个数据库的字段 微服务一个服务相对应一个数据库，同一个信息可能存在不同的数据库
    private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }
    /**
     * 链式写法:
     * Dept dept = new Dept();
     *
     * dept.setDeptN0(1).setName....
     */
}
