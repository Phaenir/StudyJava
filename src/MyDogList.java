/**
 * Created by RSadykov on 26.01.2017.
 */
public class MyDogList {
    private Dog[] dogs=new Dog[5];
    private int nextIndex=0;

    public void Add(Dog dog){
        if (nextIndex<dogs.length){
            dogs[nextIndex]=dog;
            System.out.println("Dog added in cell "+nextIndex);
            nextIndex++;
        }
    }
}
