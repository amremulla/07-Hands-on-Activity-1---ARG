import java.util.Scanner;
public class RunAnimal{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String opt;
	
	System.out.print("Choose an animal. Press 'B' for Bird, 'C' for Cat, and 'D' for Dog : ");
		opt = sc.nextLine();
		
		if(opt.equalsIgnoreCase("B")){
		Bird bird = new Bird();
		bird.eat(); 
		bird.sleep();
		bird.makeSound();
		}
		else if(opt.equalsIgnoreCase("C")){
		Cat cat = new Cat();
		cat.eat();
		cat.sleep();
		cat.makeSound();
		}
		else if(opt.equalsIgnoreCase("D")){
		Dog dog = new Dog();
		dog.eat();
		dog.sleep();
		dog.makeSound();
		}
		else{
			System.out.println("INVALID INPUT!");
		}
}
}