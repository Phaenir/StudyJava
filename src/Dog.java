/**
 * Created by RSadykov on 26.01.2017.
 */
public class Dog extends Canine {
    @Override
    public void MakeNoise() {
        System.out.printf("Dog made noise");
    }

    @Override
    public void Eat() {
        System.out.printf("Dog eats");
    }
}
