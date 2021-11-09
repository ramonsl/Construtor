import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner tc= new Scanner(System.in);

        ArrayList<Livro> biblioteca= new ArrayList<Livro>();
        int op=0;
        do{

            System.out.println("Digite 1 para add");
            System.out.println("Digite 2 listar os livros");
            System.out.println("Digite 3 para remover por posiçao");
            System.out.println("Digite 4 para remover por objeto");
            System.out.println("Digite 5 para encontrar um  objeto");

            System.out.println("Digite 6 mostrar o tamanho");
            System.out.println("Digite 7 para atualizar um  objeto");

            op=tc.nextInt();
            switch (op){
                case 1: {
                    Livro livro = new Livro();
                    livro.lerDados();
                    biblioteca.add(livro);
                    break;
                }
                case 2: {
                    for (int i=0;i<biblioteca.size();i++){
                        biblioteca.get(i).exibirDados();
                    }
                    break;
                }

                case 3: {
                    System.out.println("Digite a posição para remover");
                    int posicao=tc.nextInt();
                    Livro apagar=biblioteca.remove(posicao);
                    if(apagar!=null){
                        System.out.println("Livro apagado "+apagar.titulo);
                    }else{
                        System.out.println("Nao encontrei");
                    }
                    break;
                }

                case 4: {
                    System.out.println("Digite o nome do livro a ser apagado");
                    String nome=tc.next();
                    Livro apagar= new Livro(nome);
                   if( biblioteca.remove(apagar)){
                       System.out.println("Removido");
                   }else{
                       System.out.println("Não encontrei");
                   }

                    break;
                }

                case 5: {
                    System.out.println("Digite o nome do livro a ser apagado");
                    String nome=tc.next();
                    Livro buscar= new Livro(nome);
                   if (biblioteca.contains(buscar)){
                       System.out.println("Encontrei na posiçao:"+biblioteca.indexOf(buscar));
                   }else{
                       System.out.println("OPS...");
                   }
                    break;
                }
                case 6: {
                    System.out.println(biblioteca.size());
                }
                case 7:{
                    System.out.println("Digite o nome do livro que deseja atualizar");
                    String nome=tc.next();
                    Livro busca= new Livro(nome);
                    if(biblioteca.contains(busca)){
                        int i= biblioteca.indexOf(busca);
                        Livro newLivro=new Livro();
                        newLivro.lerDados();
                        biblioteca.set(i,newLivro);
                    }




                }
            }
        }while (op!=9);
    }

}
