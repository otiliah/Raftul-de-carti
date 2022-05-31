package raftulDeCarti;

import java.util.Objects;

/*author: otiliah*/
public class Carte {

    private String nume;
    private String autor;
    private String anAparitie;
    private String isbn;

    public Carte(String nume, String autor, String anAparitie, String isbn) {
        this.nume = nume;
        this.autor = autor;
        this.anAparitie = anAparitie;
        this.isbn = isbn;
    }

    public static Carte getInstance(String nume, String autor, String anAparitie, String isbn) {
        if (nume.isEmpty() || autor.isEmpty() || anAparitie.isEmpty() || isbn.isEmpty()) {
            return null;
        }
        return new Carte(nume, autor, anAparitie, isbn);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAnAparitie() {
        return anAparitie;
    }

    public void setAnAparitie(String anAparitie) {
        this.anAparitie = anAparitie;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final Carte carte = (Carte) o;
        if (!(Objects.equals(nume, carte.nume) && Objects.equals(autor, carte.autor) && Objects.equals(anAparitie, carte.anAparitie) && Objects.equals(isbn, carte.isbn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Nume: " + nume + "  |  " + "Autor: " + autor + "  |  " + "An aparitie: " + anAparitie + "  |  " + "ISBN: " + isbn;
    }
}
