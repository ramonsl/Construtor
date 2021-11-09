import java.util.Objects;
import java.util.Scanner;

public class Livro {
    private int qtdPag;
    public int capitulos;
    public String titulo;
    public String sinopse;
    public void lerDados(){
        System.out.println("Informe o titulo");
        Scanner tc = new Scanner(System.in);
        titulo=tc.next();
        /////fazer as demais leituras.
    }
    public void exibirDados() {
        System.out.println(this.titulo);
        System.out.println(this.sinopse);
        System.out.println(this.qtdPag);
        System.out.println(this.capitulos);
    }
    public Livro(int paginas){
        this.qtdPag=paginas;
        System.out.println("Criando o objeto....");
    }
    public Livro(String nome){
        this.titulo=nome;

    }
    public Livro(){
    }

    public void setQtdPag(int qtdPag) {
        this.qtdPag = qtdPag;
    }

    public int getQtdPag() {
        return qtdPag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(titulo, livro.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo);
    }
}
