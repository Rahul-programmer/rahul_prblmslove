import java.util.Scanner;
import java.util.*;
public class game{
public static void main(String []args){
Scanner sc = new Scanner(System.in);
System.out.println("Winning Rules of the Rock paper scissor game as follows: \n"
                                +"Rock vs paper->paper wins \n"
                                + "Rock vs scissor->Rock wins \n"
                                +"paper vs scissor->scissor wins \n"); 
  
int Your_point=0;
int Computer_point=0;
while(true){
System.out.println("Do you want to play a game");
char response=sc.nextChar();
if (response=='Y')
{

Random rnd = new Random();
String chars ="RPS";
System.out.println("Enter your choice");
char  Your_choice=sc.nextChar();
Your_choice=Character.toUpperCase(Your_choice);
Random rnd = new Random();
char computer_choice = chars.charAt(rnd.nextInt(chars.length()));
if(Your_choice=='R'&&computer_choice=='P')
{
Computer_point++;
System.out.println("Computer win the round");
}
else if (Your_choice=='R' && computer_choice=='S')
{
Your_point++;
System.out.println("You win the round");
}
else if(Your_choice=='P' && computer_choice=='S')
{
Computer_point++;
System.out.println("Computer wins the round");
}
else if (Your_choice=='P' && computer_choice=='R')
{
Your_point++;
System.out.println("You win the round");
}
else if (Your_choice=='S' && computer_choice=='R')
{
Computer_point++;
System.out.println("Computer win the round");
}
else if (Your_choice=='S' && computer_choice=='P')
Your_point++;
System.out.println("You wins the round");
if(Your_choice==computer_choice){
System.out.println("It's a tie");
}
}
else
{
System.out.println("Thanksfor playing");
break;
}
}
if(Computer_point>Your_point)
{
System.out.println("Computer wins the game");
}
else if(Your_point>Computer_point){
System.out.println("You win the game");
}
else
{
System.out.println("Its a tie");
}
}
}
