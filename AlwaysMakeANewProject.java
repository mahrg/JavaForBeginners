package alwaysmakeanewproject;

public class AlwaysMakeANewProject {

    public static void main(String[] args) {
        String colour = "Blue";
        String name = "Max";
        String street = "Hale Road";
        System.out.println(colour);
        System.out.println(name);
        System.out.println(street);
        
        int number = 5;
        int age = 17;
        int shoeSize = 12;
        System.out.println("My chosen number is: "+number);
        System.out.println("My age is: "+age);
        System.out.println("My Shoe Size is: "+shoeSize);
        
        double test = 1.5;
        double pi = 3.14;
        System.out.println(test);
        System.out.println(pi);
        //area of circle = pi*r^2
        //speed = distance/time
        System.out.println(age+shoeSize);
        System.out.println(age-shoeSize);
        System.out.println(age*shoeSize);
        System.out.println(age/shoeSize);
        
        int x = 10;
        int y = 15;
        if (x < y) {
            //if condition true
            System.out.println("x is less than y");
        }else{
            //if condition false
            System.out.println("x is greater than y");
        }
        
    }
    
}
