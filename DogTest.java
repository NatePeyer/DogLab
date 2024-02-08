// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//          
// ****************************************************************


import java.util.ArrayList;

public class DogTest
{
    public static void main(String[] args)
    {
/*	Dog dog = new Dog("Spike");
    Labrador lab = new Labrador("John", "Blue" );
    Yorkshire york = new Yorkshire("Bob", 12);
	System.out.println(dog.getName() + " says " + dog.bark()); - works because of bark method in the dog class
    System.out.println(lab.getName() + " says " + lab.bark());
    //uses the bark in the Dog class because it inherits from it and doesn't over ride the method.
    System.out.println(york.getName() + " says " + york.bark());
    york.waddle();
    //doesn't work because larador inherits from dog and not Yorkshire and the method
    is stored in the yorkshire class
    lab.waddle();

    Dog dog2 = new Dog("Spot");
    Dog lab2 = new Labrador("Jeb", "Blue" );
    Dog york2 = new Yorkshire("Bed", 12);
    Dog[] bunchOfDogs = new Dog[3];
    bunchOfDogs[0] = dog2;
    bunchOfDogs[1] = lab2;
    bunchOfDogs[2] = york2;

    for(int i = 0; i < bunchOfDogs.length; i++)
    {
        //System.out.println(i);
        System.out.println(bunchOfDogs[i].bark());
    }
    for (Dog woof:bunchOfDogs)
    {
        System.out.println(woof.bark());
    }
        // you have to cast to call the waddle method because there is no waddle method in the
        Dog class and thus it is not
        //recginized when the code is complied or ran you don't have to cast with bark because
        there is a Bark method in the
        //Dog class.
        ((Labrador) lab2).waddle();

        Dog dog3 = new Dog("Spark");
        Dog lab3 = new Labrador("Jeff", "Blue" );
        Dog york3 = new Yorkshire("Brad", 12);
        ArrayList<Dog> lotsOfDogs = new ArrayList<Dog>();
        lotsOfDogs.add(dog3);
        lotsOfDogs.add(lab3);
        lotsOfDogs.add(york3);

        for(int i = 0; i < lotsOfDogs.size(); i++)
        {
            //System.out.println(i);
            System.out.println(lotsOfDogs.get(i).bark());
        }

        for (Dog bob: lotsOfDogs)
        {
            //System.out.println();
            System.out.println(bob.bark());
        }

        ((Labrador)lab3).waddle();*/

        ArrayList<Animal>things = new ArrayList<Animal>();
        Animal dog = new Dog("Spark");
        Animal lab = new Labrador("Jason", "Brown");
        Animal york = new Yorkshire("Bryce", 12);

        things.add(dog);
        things.add(lab);
        things.add(york);

        dog.setAge(2);
        lab.setAge(3);
        york.setAge(4);

        for(int i = 0; i < things.size(); i++)
        {
            System.out.println(things.get(i).getAge());
            System.out.println(things.get(i).eat());
            //can't call bark because the array is an animal
            // array and there is no bark method in animal
            System.out.println(((Dog)things.get(i)).bark());
        }

    }
}
