package com.muyu.utils;

import java.util.HashSet;
import java.util.Set;

/**
 * PageBean
 *
 * @author Administrator
 * @Date 2019/7/28
 * 文件说明:
 */
public class PageBean<T>{
    private int currentPage;//当前页
    private int pageNums;//每页最大记录数
    private int nums;//总记录数
    private int count;//总页数
    private int startIndex;//起始位置
    private Set<T> set = new HashSet<>();

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageNums() {
        return pageNums;
    }

    public void setPageNums(int pageNums) {
        this.pageNums = pageNums;
    }

    public int getCount() {
        if (nums%pageNums==0){
            count = nums/pageNums;
        }else {
            count = (nums/pageNums)+1;
        }
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getStartIndex() {
        if (startIndex>1){
            startIndex = (currentPage-1)*pageNums;
        }else {
            startIndex = 1;
        }
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getNums() {
        return nums;
    }

    public void setNums(int nums) {
        this.nums = nums;
    }

    public Set<T> getSet() {
        return set;
    }

    public void setSet(Set<T> set) {
        this.set = set;
    }
}
