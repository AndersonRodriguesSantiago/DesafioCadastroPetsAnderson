//import java.util.Arrays;
import java.util.Scanner;
//import java.io.PrintWriter;
import java.io.File;

public class DesafioCadastroPets
{
    
    public static void main(String[] args) throws Exception
    {
        System.out.println("-----------------------------Start program---------------------------------------------------------");

        File f1 = new File("formulario.txt");
        Scanner read = new Scanner(f1);
        String n1 = null;
        String [] vet1 = new String[7];

        for(int cont = 0;cont<7;cont++)
        {
            n1 = read.nextLine();
            vet1[cont] = n1;
            System.out.println("cont = "+cont);
            System.out.println("cont = "+vet1[cont]+"\n");

        }


        System.out.println("Vetor:");
        for(int cont = 0;cont<7;cont++)
        {
            System.out.println(vet1[cont]);
        }
        read.close();

    

		System.out.println("-----------------------------End program---------------------------------------------------------");
    }
    
} 
