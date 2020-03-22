package com.scaffold.sample.web.api.common;

import com.github.pagehelper.PageInfo;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
public class PageResultMapper<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer pageNo;//当前页
    private Integer pageSize;//页容量
    private long totalCount;//总条数
    private int totalPage;//总页数
    private List<T> data = new ArrayList<T>();//数据


    public PageResultMapper(){}

    public PageResultMapper(PageInfo pageInfo){
        this.pageNo = pageInfo.getPageNum();
        this.pageSize = pageInfo.getPageSize();
        this.totalCount = (int)pageInfo.getTotal();
        this.totalPage = pageInfo.getPages();
        this.data = pageInfo.getList();
    }
}
