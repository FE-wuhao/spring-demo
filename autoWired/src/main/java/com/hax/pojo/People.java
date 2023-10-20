package com.hax.pojo;

public class People {
    private Dog dog;

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