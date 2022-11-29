import java.util.Scanner;
import java.util.Random;

public record JokenPo(
    Player user,
    Player IA,
    int rounds
)
{
    
    public void toPlay(){
        for (int i = 1; i <= rounds; i=i+1){
            System.out.println("\n ***** Bem vindo *****, " + user.getName() +" ******\n");
            int choiceUser =  choiceUser();
            if (choiceUser < 1 || choiceUser > 3){
            System.out.println("\n Jogada invalida!");
            System.out.println("\n Ponto para " + IA.getName() +"\n");
            IA.incrementScore();
            continue;
        
        }
        int choiceIA = choiceIA();
        
        System.out.print("\n"+ choiceUser + "X"+ choiceIA);
        
        int result =  choiceUser - choiceIA; 
        
        winnerRound(result);
        
        }
        
        
}  private void winnerRound(int result){
        String winnerRound;
        if (result = 0){
            winnerRound = ("EMPATE");
        }
        else if{
            if (result = -1 || result = 2){
                IA().incrementScore();
                winnerRound = IA().getName();
        }
            else if{
                user.incrementScore();
                winnerRound = user.getName();
            }
            
        }



}


 private int choiceIA(){
        Random random = new Random();
        return random.nextInt(3)+1;

}

    private int choiceUser(){
        Scanner scan = new Scanner(System.in);
        System.out.println("1 - PEDRA");
        System.out.println("2 - PAPEL");
        System.out.println("3 - TESOURA");
        
        
        System.out.print("Informe sua jogada: ");
        
        return scan.nextInt();
    
    }
}
