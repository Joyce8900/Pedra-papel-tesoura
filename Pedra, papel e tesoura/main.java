import java.util.Scanner;

public class main
{
    public static JokenPo startGame(){
        System.out.println("***** Pedra, Papel, Tesoura! *****\n");
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe seu nome:");
        String playerName = scan.next().toUpperCase();
        String playerIA = ("IA");
        
        Player user = new Player(playerName);
        
        Player IA = new Player(playerIA);
        
        System.out.print(playerName +", informe quantos rounds voce deseja jogar:");
        int rounds = scan.nextInt();
        
        return new JokenPo(user, IA, rounds);
}
   public static void main (String[] args){
       JokenPo jokenPo = startGame();
       jokenPo.toPlay(); 
       jokenPo.showFianlResult();
    }
}
