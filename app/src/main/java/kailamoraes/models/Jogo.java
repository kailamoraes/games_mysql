package kailamoraes.models;

public class Jogo {
    private int id;
    private String titulo;

    private int idGenero;

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }

    public void setTitulo(Srting titulo) {
        return this.titulo;
    }

    public void setGenero(int idGenero) {
        this.idGenero = idGenero;
    }
    public int getIdGenero() {
        return this.idGenero;
    }
}