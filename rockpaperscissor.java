import java.util.*;
 class rockpaperscissor 
 {
        public static void main(String[] args)    
        {        
            Scanner sc = new Scanner(System.in);        
            Random r = new Random();        
            String again;        
            
            do        
            {            
                System.out.println("\nRock Paper Scissor:");            
                System.out.println("1.Rock");            
                System.out.println("2.Paper");            
                System.out.println("3.Scissor");            
                System.out.print("Enter Your Choice:");            
                int user = sc.nextInt();            
                if(user < 1 || user > 3)            
                    {                
                        System.out.println("Invalid choice. Try again.");                
                        again = "y";                
                        continue;            
                    }            
                    int computer = r.nextInt(3) + 1;            
                    String[] names = {"", "Rock", "Paper", "Scissor"};            
                    System.out.println("Computer choice: " + names[computer]);            
                    if(user == computer)            
                        {                
                            System.out.println("Match Draw");            
                        }            
                        else if((user == 1 && computer == 3) ||                    
                        (user == 2 && computer == 1) ||                    
                        (user == 3 && computer == 2))            
                        {                
                            System.out.println("Player Wins");            
                        }            
                        else            
                            {                
                                System.out.println("Computer Wins");            
                            }            
                            System.out.print("\nPlay again? (y = yes, n = exit): ");        
                        }            
                        again = sc.next();        
                        while(again.equalsIgnoreCase("y"));        
                        System.out.println("Thanks for playing!");        
                        sc.close();    
                    } 
                }