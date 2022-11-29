import java.util.Scanner;

public record JokenPo(Player user,Player IA,int rounds)
{
    
    public void toPlay(){
        System.out.println("\n ***** Bem vindo *****, " + user.getName() +" ******\n");
        int choiceUser =  choiceUser();
        if (choiceUser < 1 || choiceUser > 3){
            System.out.println("\n Jogada invalida!");
            System.out.println("\n Ponto para " + IA.getName() +"\n");
            IA.incrementScore();
        
        }
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
