package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {
    private Dog dog;
    private Cat cat;
    private Timer time;
    public AnimalsCage(@Qualifier("cat") Cat cat,
                       @Qualifier("dog") Dog dog,
                       Timer time){
        this.dog=dog;
        this.cat=cat;
        this.time=time;
    }

    public void whatAnimalSay () {
        System.out.println("Say:");
        System.out.println(cat.toString());
        System.out.println(dog.toString());
        System.out.println("At:");
        System.out.println(time.getTime());
        System.out.println("________________________");
    }
    public Timer getTimer(){
        return time;
    }
}
