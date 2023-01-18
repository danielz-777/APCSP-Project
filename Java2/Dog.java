package Java2;

public class Dog extends Review //calls upon the Review file to be used in this file
//inheritance 
{ //only function you can't call is main
    String name;
    int age;
    String breed;
    int weight;




    public static void main(String[] args){
        Dog puppy = new Dog(); //new Object
        puppy.name = "bob";
        puppy.age = 5;
        puppy.breed = "Pom";
        puppy.weight = 10;

        Dog puppy2 = new Dog(); //new Object
        puppy2.name = "bob";
        puppy2.age = 7;
        puppy2.breed = "Golden";
        puppy2.weight = 15;

    String word = "2";
    String word2 = "1";

        comparision(word, word2); //you can use the functions and methods developed in the Review file in this
//Shortcut, you can just use the functions you need to define and print out, but no need for creating new already existing functions
    boolean result = comparision(puppy.name, puppy2.name); //check to see if they are the same
//set it to a variable boolean
    if(result == true) //if comparision = true, then run this
    {
        puppy2.name = "Tom";
    }
    else{ //if false, then nothing
        //do nothing
    }
    System.out.println(puppy2.name);

    //Palindromes:
    //words that are the same if read fowards and backwards
    //example: racecar, bob, pop, 
    //later, create a program to tell if a word is a palindrome or not

    }
}
