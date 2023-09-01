package lesson01;

public class Cat {
    private String name;
    private int age;
    private Owner owner;

    public Cat(String name, int age, Owner owner){
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public Owner getOwner(){
        return owner;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setNameOwner(Owner owner){
        this.owner = owner;
    }

    public void greet(){
        System.out.printf("Мяу. Меня зовут %s. Мне %d лет. Моего хозяина зовут %s", name, age, owner.getName());
    }
}

