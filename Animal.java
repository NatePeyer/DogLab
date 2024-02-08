public abstract class Animal {
    protected int age;

    public Animal()
    {
        age = 0;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int in)
    {
        age = in;
    }

    //has to be overiden in the child class.
    public abstract String eat();
}
