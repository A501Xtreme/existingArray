import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    String[] barryRoster = new String[10]; //for Mr. Barry's roster we should expect 10 names from the user
    String[] barryRoster = new String[12]; //Ms. Benny's roster will expect 10 names from Mr. Barry's roster plus 2 more students. 
    Scanner scan = new Scanner(System.in);

    for(int i = 0; i < 10; i++){
      System.out.print("Name: "); //enter your name in the roster

     barryRoster[i] = scan.next();//the scanner will scan the user's imput

     bennyRoster[i] = barryRoster[i]; // saving Mr.Benny's roster into Ms. Benny's roster so they have the same kids
     System.out.println(bennyRoster[i]);

    }
    bennyRoster[10] = "Robert"; //Adding two more students into Ms. Benny's roster
    bennyRoster[11] = "Billy";
    //print out Ms. Benny's roster with the two new names : Robert and Billy
    System.out.println(bennyRoster[10]);
    System.out.println(bennyRoster[11]);
  }
}