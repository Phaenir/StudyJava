/**
 * Created by RSadykov on 26.01.2017.
 */
public class Tiger extends Animal {
    @Override
    public void MakeNoise() {
        System.out.printf("Tiger made noise");
    }

    @Override
    public void Eat() {
        System.out.printf("Tiger eats");
    }

    @Override
    public void Roam() {
        System.out.printf("Tiger roams");
    }
}
