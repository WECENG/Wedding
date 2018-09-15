package com.qianfeng.pojo;

import java.util.List;

public class Page<T> {
    public static final int PAGE_SIZE = 10;
    public Integer pageCount;
    public List<T> data;
    public Integer currentPage;

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }
}
