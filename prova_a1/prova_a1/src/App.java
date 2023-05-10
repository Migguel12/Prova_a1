import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        
        System.out.print("Informe a descrição do artefato: ");
        String descricao = ler.nextLine();
        System.out.println("");

        System.out.print("Informe o tipo do artefato: ");
        int tipo = ler.nextInt();
        System.out.println("");

        System.out.print("Informe o percentual de Carbono-14: ");
        double percentual = ler.nextDouble();
        System.out.println("");

        ler.close();

        if (percentual == 100){ 
             if (tipo == 1) {
                System.out.println(descricao);
                System.out.println("Arma ou tecnologia similar de metal");
                System.out.println("Idade moderna");
                System.out.println("Dra. Kassandra");
            }
            if (tipo == 2){
                System.out.println(descricao);
                System.out.println("Ferramentas ou utensílios domésticos");
                System.out.println("Idade moderna");
                System.out.println("Dr. Edward");
            }
            if (tipo == 3){
                System.out.println(descricao);
                System.out.println("Artefato desconhecido (Isu)");
                System.out.println("Idade moderna");
                System.out.println("Dr. Cesare Borgia");
            }
        }

        if (percentual == 50){
            if (tipo == 1){
                System.out.println(descricao);
                System.out.println("Arma ou tecnologia similar de metal");
                System.out.println("Idade média");
                System.out.println("Dr. Kenway");
            }
            if (tipo == 2){
                System.out.println(descricao);
                System.out.println("Ferramentas ou utensílios domésticos");
                System.out.println("Idade média");
                System.out.println("Dr. Ezio");
            }
            if (tipo == 3){
                System.out.println(descricao);
                System.out.println("Artefato desconhecido (Isu)");
                System.out.println("Idade média");
                System.out.println("Dr. Rodrigo");
            }

        }

        if (percentual == 25){
            if (tipo == 1){
                System.out.println(descricao);
                System.out.println("Arma ou tecnologia similar de metal");
                System.out.println("Idade do bronze");
                System.out.println("Dr. Alexios");
            }
            if (tipo == 2){
                System.out.println(descricao);
                System.out.println("Ferramentas ou utensílios domésticos");
                System.out.println("Idade do bronze");
                System.out.println("Dr. Altair");
            }
            if (tipo == 3){
                System.out.println(descricao);
                System.out.println("Artefato desconhecido (Isu)");
                System.out.println("Idade do bronze");
                System.out.println("Dr. Cormac");
            }
        }

        if (percentual == 10){
            if (tipo == 1){
                System.out.println(descricao);
                System.out.println("Arma ou tecnologia similar de metal");
                System.out.println("Idade do ferro");
                System.out.println("Dr. Alexios");
            }
            if (tipo == 2){
                System.out.println(descricao);
                System.out.println("Ferramentas ou utensílios domésticos");
                System.out.println("Idade do ferro");
                System.out.println("Dr. Eivor");
            }
            if (tipo == 3){
                System.out.println(descricao);
                System.out.println("Artefato desconhecido (Isu)");
                System.out.println("Idade do ferro");
                System.out.println("Dr. Berg");
            }
        }

        if (percentual <= 9 && percentual >= 1){
            if (tipo == 1){
                System.out.println(descricao);
                System.out.println("Arma ou tecnologia similar de metal");
                System.out.println("Pré história");
                System.out.println("Dr. Arno");
            }
            if (tipo == 2){
                System.out.println(descricao);
                System.out.println("Ferramentas ou utensílios domésticos");
                System.out.println("Pré história");
                System.out.println("Dr. Elise");
            }
            if (tipo == 3){
                System.out.println(descricao);
                System.out.println("Artefato desconhecido (Isu)");
                System.out.println("Pré história");
                System.out.println("Dra. Braddock");
            }
        }


    }
}
