package com.company;

import java.util.ArrayList;
import java.util.List;

public class Generic {
    List<Show> list = new ArrayList<>();

    public Generic() {
    }

    public List<Show> getList() {
        return list;
    }

    public void setList(List<Show> list) {
        this.list = list;
    }

    public void addProduct(Show product){
        this.list.add(product);
    }

    public void print(){
        System.out.println("На полці зберігаються:");
        list.forEach(p->p.showProduct());
    }}
