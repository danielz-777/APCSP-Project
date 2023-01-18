package Java2;

public class Riddle
{
    // write 2 instance variables for Riddle's question and answer: private type variableName;
    String question;
    String answer;

    // constructor
    public Riddle(String initQuestion, String initAnswer)
    {
        // set the instance variables to the init parameter variables
        question = initQuestion; //so they can be later called upon in the methods with the same parameters
        answer = initAnswer;
        
        
    }

    // Print riddle question
    public void printQuestion()
    {
        // print out the riddle question with System.out.println
        //question =  "What has to be broken before you can use it?";
        System.out.println(question); //sets up the print statement to be used down in the method below, so when called upon
        //it will run this 

    }

    // Print riddle answer
    public void printAnswer()
    {
        // print out the riddle answer with System.out.println
        //answer = "an egg";
        System.out.println(answer);
    }

    // main method for testing
    public static void main(String[] args)
    {
        // call the constructor to create 2 new Riddle objects
        Riddle riddle1 = new Riddle("What has to be broken before you can use it?","an egg" );//sets the question and answer to this, 
        //becuase it was set to be in these parameters and are printed by printQuestion and printAnswer
        
       // call their printQuestion() and printAnswer methods
        riddle1.printQuestion();//calls upon the parameters inside the method Riddle(), which were set up in the printQuestion and printAnswer methods
        riddle1.printAnswer();
        
        
        Riddle riddle2 = new Riddle("I’m tall when I’m young, and I’m short when I’m old. What am I?", "A candle");
        riddle2.printQuestion();
        riddle2.printAnswer();
    }
}
