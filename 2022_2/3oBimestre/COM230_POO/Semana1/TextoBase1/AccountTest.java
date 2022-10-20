//Texto-base 1.1 - Java Como Programar (Leia p. 55-70) | Paul Deitel e Harvey Deitel
// Cria e manipula um objeto Account
import java.util.Scanner;

public class AccountTest 
{
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        //Cria um objeto Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        //Cria um objeto Account e o atribui a myAccount
        Account myAccount = new Account();

        //exibe i valor inicial do nome (null)
        System.out.printf("Initial name is %s%n%n", myAccount.getName());

        //solicita e lê o nome
        System.out.println("Please enter the name");
        String theName = input.nextLine(); // lê uma linha de texto
        myAccount.setName(theName); //insere theName em MyAccount
        System.out.println(); //gera saida de uma linha em branco

        //exibe o nome armazenadono objeto myAccount
        System.out.printf("Name in object myAccount is: %n%s%n", myAccount.getName());        
    }    
}// Fim da classe AccountTest
