package com.hax.pojo;

import java.util.*;

public class Student {
    private String name;

    private Address address;

    private Map<String, String> map;

    private Set<String> set;

    private List<String> list;

    private String[] stringList;

    private Properties properties;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public String[] getStringList() {
        return stringList;
    }

    public void setStringList(String[] stringList) {
        this.stringList = stringList;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", map=" + map +
                ", set=" + set +
                ", list=" + list +
                ", stringList=" + Arrays.toString(stringList) +
                ", properties=" + properties +
                '}';
    }
}