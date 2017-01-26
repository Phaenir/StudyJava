/**
 * Created by RSadykov on 26.01.2017.
 */
public class Hippo extends Animal {

    @Override
    public void MakeNoise() {
        System.out.printf("Hippo made noise");
    }

    @Override
    public void Eat() {
        System.out.printf("Hippo eats");
    }

    @Override
    public void Roam() {
        System.out.printf("Hippo roams");
    }
}
