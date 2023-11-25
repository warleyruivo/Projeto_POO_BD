package projeto;

import projeto.Cesta;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Consultando os dados no DB
        Consulta.executarConsulta();

        //--------------------------------------------------------------------------------------------
        //criando os produtos da loja de doce

        DocesAzedos azedos1 = new DocesAzedos("AzedinhoUva",78,2.50F);
        DocesAzedos azedos2 = new DocesAzedos("AzedinhoMorango",23,2.40F);
        DocesAzedos azedos3 = new DocesAzedos("AzedinhoMaçaVerde",12,2.60F);

        Doces doce1 = new Doces("7bello",54,3.00F);
        Doces doce2 = new Doces("Halls",43,3.20F);
        Doces doce3 = new Doces("Frutella",22,3.50F);

        Chocolates chocolate1 = new Chocolates(37,"kitkat","aoLeite", 5.00F);
        Chocolates chocolate2 = new Chocolates(87,"Bis","branco",2.00F);
        Chocolates chocolate3 = new Chocolates(48,"Laka","branco",6.00F);

        //--------------------------------------------------------------------------------------------
        //criando os aways para adicionar a loja e criando a loja
        DocesAzedos[] docesAzedos = new DocesAzedos[5];
        Doces[] doces = new Doces[5];
        Chocolates[] chocolates = new Chocolates[5];

        docesAzedos[0] = azedos1;
        docesAzedos[1] = azedos2;
        docesAzedos[2] = azedos3;

        doces[0] = doce1;
        doces[1] = doce2;
        doces[2] = doce3;

        chocolates[0] = chocolate1;
        chocolates[1] = chocolate2;
        chocolates[2] = chocolate3;

        Loja lojaDoTioWarley = new Loja(doces,chocolates,docesAzedos);

        lojaDoTioWarley.setNome("Tio Warley");
        lojaDoTioWarley.setId(1);

        //--------------------------------------------------------------------------------------------
        //criando cliente e apresentando a loja

        System.out.println("***** Bem vindos a loja: "+lojaDoTioWarley.getNome()+" *****");

        Scanner clientee = new Scanner(System.in);

        String nome;
        String telefone;

        System.out.println("Insira seu nome: ");

        nome = clientee.nextLine();

        System.out.println("Insira seu telefone: ");

        telefone = clientee.nextLine();

        Cliente cliente = new Cliente(4,nome,telefone);

        System.out.println("Em nossa loja temos as seguintes gostosuras:");

        System.out.println("----------------------------------");

        System.out.println("- projeto.Doces azedos -> AzedinhoUva -> cod(1)");
        azedos1.mostraInfos();

        System.out.println("- projeto.Doces azedos -> AzedinhoMorango -> cod(2)");
        azedos2.mostraInfos();

        System.out.println("- projeto.Doces azedos -> AzedinhoMaçaVerde -> cod(3)");
        azedos3.mostraInfos();

        System.out.println("----------------------------------");

        System.out.println("- projeto.Doces doces -> 7bello -> cod(4)");
        doce1.mostraInfos();

        System.out.println("- projeto.Doces doces -> Halls -> cod(5)");
        doce2.mostraInfos();

        System.out.println("- projeto.Doces doces -> Frutella -> cod(6)");
        doce3.mostraInfos();

        System.out.println("----------------------------------");

        System.out.println("- projeto.Chocolates -> kitkat -> cod(7)");
        chocolate1.mostraInfos();

        System.out.println("- projeto.Chocolates -> Bis -> cod(8)");
        chocolate2.mostraInfos();

        System.out.println("- projeto.Chocolates -> Laka -> cod(9)");
        chocolate3.mostraInfos();

        System.out.println("----------------------------------");

        //entrada de dados
        Scanner ecod = new Scanner(System.in);
        int entrada;

        Cesta cesta = new Cesta() {
            @Override
            public void addCestaDoces(Doces doces) {
                super.addCestaDoces(doces);
            }

            @Override
            public void addCestaDocesAzedos(DocesAzedos docesAzedos) {
                super.addCestaDocesAzedos(docesAzedos);
            }

            @Override
            public void addCestaChocolates(Chocolates chocolates) {
                super.addCestaChocolates(chocolates);
            }
        };

        double valorTotal = 0;

        do{
            System.out.println("Quais doces deseja adicionar na sua cesta?(lembrando que só podem ser adicionados pelos codigos fornecidos) e para concluir digite 0");
            entrada = ecod.nextInt();

            switch (entrada){
                case 1:{
                    cesta.addCestaDocesAzedos(azedos1);
                    valorTotal += azedos1.getPreco();
                    break;
                }
                case 2:{
                    cesta.addCestaDocesAzedos(azedos2);
                    valorTotal += azedos2.getPreco();
                    break;
                }
                case 3:{
                    cesta.addCestaDocesAzedos(azedos3);
                    valorTotal += azedos3.getPreco();
                    break;
                }
                case 4:{
                    cesta.addCestaDoces(doce1);
                    valorTotal += doce1.getPreco();
                    break;
                }
                case 5:{
                    cesta.addCestaDoces(doce2);
                    valorTotal += doce2.getPreco();
                    break;
                }
                case 6:{
                    cesta.addCestaDoces(doce3);
                    valorTotal += doce3.getPreco();
                    break;
                }
                case 7:{
                    cesta.addCestaChocolates(chocolate1);
                    valorTotal += chocolate1.getPreco();
                    break;
                }
                case 8:{
                    cesta.addCestaChocolates(chocolate2);
                    valorTotal += chocolate2.getPreco();
                    break;
                }
                case 9:{
                    cesta.addCestaChocolates(chocolate3);
                    valorTotal += chocolate3.getPreco();
                    break;
                }
                default:
                    break;
            }
        }while (entrada != 0);

        DecimalFormat deci = new DecimalFormat("0.00");
        deci.setMaximumFractionDigits(2);
        String saida = deci.format(valorTotal);

        System.out.println("O valor total: R$"+ saida);
    }
}