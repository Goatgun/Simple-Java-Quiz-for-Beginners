import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("========= SIMPLE QUIZ ========\n");
        String[] questions = {
            "Capital of PH?",
            "2 + 2?",
            "Largest planet in our solar system?",
            "How many legs does a spider have?",
            "What language is primarily spoken in Brazil?",
            "What color do you get when you mix red and white?",
            "What is the opposite of 'cold'?"
        };
        String[] answers = {
            "Manila",
            "4",
            "Jupiter",
            "8",
            "Portuguese",
            "Pink",
            "Hot"
        };
        
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
        System.out.println(questions[i]);
        String ans = input.nextLine();
        
        if (!ans.equals(answers[i])) {
       System.out.println("---------- WRONG ----------");
        System.out.println("Wrong answer, the correct answer is " + answers[i]);    
        }
        else {
       score++;    
       System.out.println("---------- CORRECT ----------");
       System.out.println("Correct answer!");
       System.out.println("You have answered the questions correct " + score + "/" + questions.length);
          }
        }
        
        System.out.println("-------------[FINAL GRADE]----------------");
        System.out.println("You scored " + score + "/" + questions.length);
        
            
	}
}