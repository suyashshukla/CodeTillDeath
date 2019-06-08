package PPL;

public class MultiLevel {

    public void displayGrand(){

        System.out.println("Grand Parent");

    }
}

class Parent extends MultiLevel {

    public void displayParent(){

        System.out.println("Parent");

    }

}

class Child extends Parent{

    public void swap(Child c){

    }


    public static void main(String args[]){

        Child c = new Child();

        MultiLevel m = new Parent();

        MultiLevel m1 = new Child();

        Parent p = new Child();

        Child child = new Child();

        child.swap(child);
    }
}
