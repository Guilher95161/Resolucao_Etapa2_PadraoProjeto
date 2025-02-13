package atividade6_Livro_Builder_Fluent_Interface;

import java.util.List;
import java.util.StringJoiner;

public class Livro {
        private String nomeNacional;
        private int ano;
        private List<String> autores;
        private int edicao;
        private String cidade;
        private String editora;
        private String nomeOriginal;
        private List<String> tradutores;
        private int paginas;
        private long isbn;

        public Livro(String nomeNacional, int ano, List<String> autores,
                     int edicao, String cidade, String editora, String nomeOriginal,
                     List<String> tradutores, int paginas, long isbn) {

            this.nomeNacional = nomeNacional;
            this.ano = ano;
            this.autores = autores;
            this.edicao = edicao;
            this.cidade = cidade;
            this.editora = editora;
            this.nomeOriginal = nomeOriginal;
            this.tradutores = tradutores;
            this.paginas = paginas;
            this.isbn = isbn;
        }

        public Livro() {

        }

        public Livro LivroBuilder(String nomeNacional){
            this.nomeNacional = nomeNacional;
            return this;
        }
        public Livro publicadoEm(int ano){
            this.ano = ano;
            return this;
        }
        public Livro dosAutores(List<String> autores){
            this.autores = autores;
            return this;
        }
        public Livro edicao(int edicao){
            this.edicao = edicao;
            return this;
        }
        public Livro cidade(String cidade){
            this.cidade = cidade;
            return this;
        }
        public Livro editora(String editora){
            this.editora = editora;
            return this;
        }
        public Livro nomeOriginal(String nomeOriginal){
            this.nomeOriginal = nomeOriginal;
            return this;
        }
        public Livro tradutores(List<String> tradutores){
            this.tradutores = tradutores;
            return this;
        }
        public Livro paginas(int paginas){
            this.paginas = paginas;
            return this;
        }
        public Livro isbn(long isbn){
            this.isbn = isbn;
            return this;
        }
        public Livro build(){
            return new Livro(nomeNacional,ano,autores,edicao,cidade,editora,nomeOriginal,tradutores,paginas,isbn);
        }

        @Override
        public String toString() {
            StringJoiner autoresJoiner = new StringJoiner(", ");
            if (autores != null) {
                autores.forEach(autoresJoiner::add);
            }

            StringJoiner tradutoresJoiner = new StringJoiner(", ");
            if (tradutores != null) {
                tradutores.forEach(tradutoresJoiner::add);
            }

            return "Livro{" +
                    "nomeNacional='" + nomeNacional + '\'' +
                    ", ano=" + ano +
                    ", autores=" + autoresJoiner.toString() +
                    ", edicao=" + edicao +
                    ", cidade='" + cidade + '\'' +
                    ", editora='" + editora + '\'' +
                    ", nomeOriginal='" + nomeOriginal + '\'' +
                    ", tradutores=" + tradutoresJoiner.toString() +
                    ", paginas=" + paginas +
                    ", isbn=" + isbn +
                    '}';
        }

// getters e setters omitidos

    }


