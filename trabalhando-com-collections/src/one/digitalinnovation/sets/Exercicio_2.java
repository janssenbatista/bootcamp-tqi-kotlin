package one.digitalinnovation.sets;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/*
Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e ide. Em seguida, crie um conjunto
com 3 linguagens e faça um programa que ordene esse conjunto por:
1 - Ordem de inserção
2 - Ordem Natural (nome)
3 - IDE
4 - Ano de criação e nome
5 - Nome, ano de criação e IDE
 */
public class Exercicio_2 {
    public static void main(String[] args) {
        // Respeita a ordem de inserção
        var lfs1 = new LinkedHashSet<LinguagemFavorita>();
        lfs1.add(new LinguagemFavorita("FORTRAN", LocalDate.of(1945, 1, 1), "Ide1"));
        lfs1.add(new LinguagemFavorita("ALGOL 58", LocalDate.of(1958, 1, 1), "Ide2"));
        lfs1.add(new LinguagemFavorita("COBOL", LocalDate.of(1959, 1, 1), "Ide3"));
        System.out.printf("Ordem de inserção: \n%s\n", lfs1);
        System.out.println("------------------------------------------");
        // Ordem natural (nome)
        var lfs2 = new TreeSet<>(new NomeComparator());
        lfs2.addAll(lfs1);
        System.out.printf("Ordem natural (nome): \n%s\n", lfs2);
        System.out.println("------------------------------------------");
        // Ordem IDE
        var lfs3 = new TreeSet<>(new IDEComparator());
        lfs3.addAll(lfs1);
        System.out.printf("Ordem IDE: \n%s\n", lfs3);
        System.out.println("------------------------------------------");
        // Ordem Ano de Criação e Nome
        var lfs4 = new TreeSet<>(new AnoCriacaoNomeComparator());
        lfs4.addAll(lfs1);
        lfs4.add(new LinguagemFavorita("FACT", LocalDate.of(1959, 1, 1), "Ide4"));
        System.out.printf("Ordem Ano de Criação e Nome: \n%s\n", lfs4);
        System.out.println("------------------------------------------");
        // Ordem Nome, Ano de Criação e IDE
        var lfs5 = new TreeSet<>(new NomeAnoCriacaoIdeComparator());
        lfs5.addAll(lfs4);
        System.out.printf("Ordem Nome, Ano de Criação e IDE: \n%s\n", lfs5);



    }
}

class LinguagemFavorita {
    private final String nome;

    public String getNome() {
        return nome;
    }

    public LocalDate getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public String getIde() {
        return ide;
    }

    private final LocalDate anoDeCriacao;
    private final String ide;

    public LinguagemFavorita(String nome, LocalDate anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    @Override
    public String toString() {
        return "LinguagemFavorita{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                ", ide='" + ide + '\'' +
                '}';
    }
}

class NomeComparator implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        return lf1.getNome().compareToIgnoreCase(lf2.getNome());
    }
}

class IDEComparator implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        return lf1.getIde().compareToIgnoreCase(lf2.getIde());
    }
}

class AnoCriacaoNomeComparator implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        if (lf1.getAnoDeCriacao().getYear() == lf2.getAnoDeCriacao().getYear()) {
            return lf1.getNome().compareToIgnoreCase(lf2.getNome());
        } else if (lf1.getAnoDeCriacao().getYear() < lf2.getAnoDeCriacao().getYear())
            return -1;
        return 1;
    }
}

class NomeAnoCriacaoIdeComparator implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        int value = lf1.getNome().compareToIgnoreCase(lf2.getNome());
        if (value == 0) {
            if (lf1.getAnoDeCriacao().getYear() == lf2.getAnoDeCriacao().getYear()) {
                return lf1.getIde().compareToIgnoreCase(lf2.getIde());
            } else if (lf1.getAnoDeCriacao().getYear() < lf2.getAnoDeCriacao().getYear()) {
                return -1;
            } else {
                return 1;
            }
        } else {
            return value;
        }
    }
}
