package com.hax.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class People {
    @Autowired
    private Dog dog;
    @Autowired
    // 当自动装配byType匹配不到时，手动指定id，即可实现自动装配
    @Qualifier("cat111")
    private Cat cat;

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public void play() {
        getDog().shout();

        getCat().shout();
    }
}