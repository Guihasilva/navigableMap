package org.example;

//Registro de Estudantes:
//     Crie um programa que permita registrar informações de estudantes, como nome, idade e nota. O programa deve ser capaz de adicionar
//      novos estudantes, buscar estudantes pelo nome,
//      remover estudantes e exibir todos os estudantes em ordem alfabética.
import java.util.Map;
import java.util.NavigableMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {



        NavigableMap<String, Estudante> estudantesMap = new TreeMap<>();

        Scanner sc = new Scanner(System.in);

        boolean continuar = true;

        while(continuar){
            System.out.println("\n===== Registro de Estudantes =====");
            System.out.println("1. Adicionar Estudante");
            System.out.println("2. Buscar Estudante pelo Nome");
            System.out.println("3. Remover Estudante");
            System.out.println("4. Exibir Todos os Estudantes");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = sc.nextInt();
            //Limpar buffer
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do estudante: ");
                    String nome = sc.nextLine();
                    System.out.println("Digite a idade do estudante");
                    int idade = sc.nextInt();
                    System.out.println("Digite a nota do estudante");
                    double nota = sc.nextDouble();
                    sc.nextLine();

                    //Criando detalhes
                    Estudante estudante = new Estudante(idade, nota);

                    //Criando o Map
                    estudantesMap.put(nome, estudante);
                    break;
                case 2:
                    boolean encontra = false;
                    System.out.println("Digite o nome do estudante que deseja buscar");
                    String nomeBusca = sc.nextLine();

                   for(Map.Entry<String, Estudante> estudanteEntry : estudantesMap.entrySet()){
                       if(estudanteEntry.getKey().equals(nomeBusca)){
                           System.out.println(estudanteEntry.getKey());
                           System.out.println(estudanteEntry.getValue());
                           encontra = true;
                           break;
                       }

                   }
                   if(!encontra){
                       System.out.println("Estudante nao encontrado");
                   }

                    break;
                case 3:
                    System.out.println("Digite o nome do estudante que deseja remover");
                    String nomeRemover = sc.nextLine();

                    if (estudantesMap.containsKey(nomeRemover)) {
                        estudantesMap.remove(nomeRemover);
                    } else {
                        System.out.println("Nenhum estudante encontrado com este nome\nOperacao nao executada");
                    }
                    break;
                case 4:
                    System.out.println("Imprimindo os estudantes");
                    for (Map.Entry<String,Estudante> entry : estudantesMap.entrySet()) {
                        System.out.println(entry.getKey() + " - " + entry.getValue());
                    }
                    break;



                case 5:
                    System.out.println("Saindo do programa");
                    continuar = false;

                    break;
                default:
                    System.out.println("Tente novamente");
                    break;
            }






        }


        sc.close();





    }
}
