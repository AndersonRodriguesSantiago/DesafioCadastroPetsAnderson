import java.util.Arrays;
import java.util.Scanner;
//import java.io.PrintWriter;
import java.io.File;

public class DesafioCadastroPets
{
    

    public class pet
    {
        
        String nome;
        String sobrenome;
        public enum Tipo
        {
            CACHORRO,GATO,COELHO
        }
        public enum Sexo
        {
            MASCULINO,FEMININO
        }
        Tipo tipo;
        Sexo sexo;
        String endereco[] = new String[3];
        String bairro;
        String idade;
        String raca;

        // public pet(String nome, String sobrenome, Tipo tipo, Sexo sexo, String end1, String end2, String end3, String bairro, String idade, String raca)
        // {
        //     this.nome = nome;
        //     this.sobrenome = sobrenome;
        //     this.tipo = tipo;
        //     this.sexo = sexo;
        //     this.endereco[0] = end1;
        //     this.endereco[1] = end2;
        //     this.endereco[2] = end3;
        //     this.bairro = bairro;
        //     this.idade = idade;
        //     this.raca = raca;
        // }

        // public String getNome() {
        //     return nome;
        // }
        // public String getSobrenome() {
        //     return sobrenome;
        // }
        // public Tipo getTipo() {
        //     return tipo;
        // }
        // public Sexo getSexo() {
        //     return sexo;
        // }
        // public String[] getEndereco() {
        //     return endereco;
        // }
        // public String getBairro() {
        //     return bairro;
        // }
        // public String getIdade() {
        //     return idade;
        // }
        // public String getRaca() {
        //     return raca;
        // }


    }
    
    public static void main(String[] args) throws Exception
    {
        System.out.println("-----------------------------Start program---------------------------------------------------------\n");
        
        //imprimindo arquivo
        File f1 = new File("formulario.txt");//acessa o arquivo
        Scanner read = new Scanner(f1);//cria leitor para o formulario
        String formulario [] = new String[7];//cria vetor para armazenar o formulário
        int cont3=0;

        while (read.hasNextLine()) 
        /*Lê, armazena e printa o formulario */
        {
            formulario[cont3] = read.nextLine();
            System.out.println(formulario[cont3]);
            cont3 = cont3 + 1;
        }
        read.close();


        String menu [] = new String[6];
        menu[0] = "1.Cadastrar novo pet";
        menu[1] = "2.Alterar os dados do pet cadastrado";
        menu[2] = "3.Deletar um pet cadastrado";
        menu[3] = "4.Listar todos os pets cadastrados";
        menu[4] = "5.Listar pets por algum critério (idade, nome, raça)";
        menu[5] = "6.Sair";


        //Interação com menu
        int opcao = 7;
        boolean aux1 = true;
        Scanner ent = new Scanner(System.in);
        String aux3 ="";
        while(aux1==true)
        {   
            boolean aux2 = true;
            System.out.println("\n----------------inicio while1----------------\n");
            
////////////////////////////////////////////Print do Menu//////////////////////////////////////////
            System.out.println("Menu:");
            for(int cont = 0;cont<6;cont++)
            {
                if (cont == 0)
                {
                    System.out.println("________________________________________________________\n");
                }

                String espaco = "";
                if (menu[cont].length()<52)//esse 52 eu desco
                {   
                    /*
                    Como descobri o 52
                    for(int cont = 0; cont <menu.length; cont = cont+1)
                    {
                        System.out.println("menu.length = "+menu[cont].length());
                    }
                    //System.out.println("menu.length = "+menu.length);
                    //System.out.println("menu.length = "+menu[0].length());
                    */
                    int max = 52-menu[cont].length();
                    for(int cont2 = 0;cont2 <max;cont2 = cont2+1)
                    {
                        espaco = espaco +" ";
                    }
                }

                System.out.println("|  "+menu[cont]+espaco+"  |");
                //3
                if (cont==5)
                {
                    System.out.println("________________________________________________________\n");
                }
            }
////////////////////////////////////////////////////////////////////////////////////////////////

            //Escolha da opção do menu
            System.out.println("Digite a opção desejada:");
            
            
            do
            {System.out.println("\n----------------inicio while2----------------\n");
                
                opcao = ent.nextInt();

                int soma = 0;
                switch (opcao) 
                {
                    
                    case 1:
                        System.out.println("Opcao selecionada: "+menu[opcao-1]);
                        pet pet = new pet();
                        for(int cont4 = 0;cont4<7;cont4=cont4+1)
                        {
                            System.out.println(formulario[cont4]);
                            
                            switch (cont4) {
                                case 0:
                                    System.out.println("Digite o primeiro nome:");
                                    pet.nome = ent.next();
                                    System.out.println("Digite o sobrenome:");
                                    pet.sobrenome = ent.next();

                                    break;
                            
                                case 1:
                                    pet.tipo = ent.next().toUpperCase();
                                    break;

                                case 2:
                                    String entrada = ent.next().toUpperCase();

                                    try
                                    {
                                        pet.sexo = pet.valueOf(entrada);
                                    }catch (IllegalArgumentException e) 
                                    {
                                    System.out.println("Erro: Opção inválida! Tente novamente.");
                                    }

                                    break;

                                case 3:
                                    pet.endereco[0] = ent.next();
                                    break;

                                case 4:
                                    pet.bairro = ent.next();
                                    break;

                                case 5:
                                    
                                    break;

                                case 6:
                                    
                                    break;
                                
                            }
                        }
                        






                        break;

                    case 2:
                        System.out.println("Opcao selecionada = "+menu[opcao-1]);
                        System.out.print("Digite o numero da soma");
                        soma = 2 + ent.nextInt();
                        System.out.println("soma = "+soma);
                        break;

                    case 3:
                        System.out.println("Opcao selecionada = "+menu[opcao-1]);
                        System.out.print("Digite o numero da soma");
                        soma = 3 + ent.nextInt();
                        System.out.println("soma = "+soma);
                        break;
                    
                    case 4:
                        System.out.println("Opcao selecionada = "+menu[opcao-1]);
                        System.out.print("Digite o numero da soma");
                        soma = 4 + ent.nextInt();
                        System.out.println("soma = "+soma);
                        break;
                    
                    case 5:
                        System.out.println("Opcao selecionada = "+menu[opcao-1]);
                        System.out.print("Digite o numero da soma");
                        soma = 5 + ent.nextInt();
                        System.out.println("soma = "+soma);
                        break;
                    
                    case 6:
                        System.out.println("Opcao selecionada = "+menu[opcao-1]);
                        System.out.print("Digite o numero da soma");
                        soma = 6 + ent.nextInt();
                        System.out.println("soma = "+soma);
                        aux2 = false;
                    
                }
                
                if(opcao<=0 || opcao>6) 
                {//verifica se digitou algo que não deveria e retorna ao menu
                    aux2=false;
                }

                
                System.out.println("\n----------------fim while2----------------\n");
            }
            while(aux2);//tem q dar true p ficar repetindo o while
            
            
            System.out.println("Sair do programa? Y/N");
            aux3 = ent.next();

            if (aux3.equals("Y")||aux3.equals("y")) 
            {
                aux1 = false;
            }
            

        }
        System.out.println("\n----------------fim while1----------------\n");
        ent.close();
        
        System.out.println("\n-----------------------------End program---------------------------------------------------------\n");
        
    }
}
    

