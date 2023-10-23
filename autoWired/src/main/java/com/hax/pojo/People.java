package com.hax.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

public class People {
    /**
     * Resource注解和AutoWired注解的区别： Resouce默认是byName匹配的，在匹配不到的情况下，可以手动传入name或者type来匹配
     * AutoWired默认byType匹配的，在匹配不到的情况下，可以手动传入name来匹配
     */
    @Resource
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