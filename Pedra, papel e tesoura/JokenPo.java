import java.util.Scanner;

public record JokenPo(Player user,Player IA,int rounds)
{
    
    public void toPlay(){
        System.out.println("\n ***** Bem vindo *****, " + user.getName() +" ******\n");
        int choiceUser =  choiceUser();
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
