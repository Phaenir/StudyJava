/**
 * Created by RSadykov on 26.01.2017.
 */
public abstract class Animal {
    public String Picture;
    public String Food;
    public boolean Hunger;
    public String Boundaries;
    public String Location;

    public abstract void MakeNoise();
    public abstract void Eat();
    public void Sleep(){
        System.out.println("I am going to sleep");
    }
    public abstract void Roam();
}
