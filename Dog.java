// ****************************************************************
// Dog.java
//
// A class that holds a dog's name and can make it speak.
//          
// ****************************************************************
public class Dog extends Animal
{
    protected String name;

    // ------------------------------------------------------------
    // Constructor -- store name
    // ------------------------------------------------------------
    public Dog(String name)
    {
	    super();
        this.name = name;
    }


    // ------------------------------------------------------------
    // Returns the dog's name
    // ------------------------------------------------------------
    public String getName()
    {
	return name;
    }

    @Override
    public String eat()
    {
        String food = "Yummy food.";
        return food;
    }

    // ------------------------------------------------------------
    // Returns a string with the dog's comments
    // ------------------------------------------------------------
    public String bark()
    {
	return "Dog barking";
    }

}
