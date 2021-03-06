package man.kuke.model;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author: kuke
 * @date: 2020/12/3 - 17:44
 * @description:
 */
public class People {
    @Autowired
    private Cat cat;
    @Autowired
    private Dog dog;

    public People() {
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
