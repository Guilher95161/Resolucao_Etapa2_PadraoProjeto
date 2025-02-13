package atividade6_Livro_Builder_Fluent_Interface;

import java.util.*;

public class Teste
{
    public static void main(String[] args) {
        ArrayList<String> autores = new ArrayList<>();
        autores.add("H. M. Deitel");
        autores.add("P. J. Deitel");
        ArrayList<String> tradutores = new ArrayList<>();
        tradutores.add("Carlos Arthur Lang Lisboa");
        Livro livro = new Livro("Java, como programar", 2003,autores, 4, "Porto Alegre", "Bookman", "Java, how to program", tradutores, 1386, 9788536301235L);
        Livro livro2 = new Livro().LivroBuilder("Java, como programar").publicadoEm(2003).dosAutores(autores).edicao(4).cidade("Porto Alegre").editora("Bookman").nomeOriginal("Java, how to program").tradutores(tradutores).paginas(1386).isbn(978853631235L).build();

            System.out.println(livro.toString());
            System.out.println(livro2.toString());

    }
}
